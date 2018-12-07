/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.BDD;
import Model.Utilisateur;
import View.Connexion;
import View.Visualisation;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author vn934281
 */
public class Controleur implements ActionListener {
    //on cree les vues dont on aura besoin
    Connexion con;
    Visualisation vis;
    //on a besoin de savoir dans quelle base de données on travaille
    BDD mongo;
    //utilisateur cree lors de la connexion
    Utilisateur user;
    // connexion -> 0   Visualisation -> 1
    int vue;
    
    //constructeur pour relier la bdd et la vue connexion
    public Controleur(BDD m, Connexion c)
    {
        con = c;
        mongo = m;
        vue = 0;
    }
    //constructeur pour relier la bdd et la vue Visualisation
    public Controleur(BDD m, Visualisation v)
    {
        vis = v;
        mongo = m;
        vue = 1;
    }

    //mega méthode de la mort qui tue
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean existe = false;
        //on recupere le nom du boutton qui a été cliqué
        JButton b = (JButton)e.getSource();
        //si la vue actuelle est celle de la connexion
        if (vue == 0)
        {
            //si l'utilisateur veut s'inscrire, on vérifie que tous les champs soient remplis
            if(b.getName().equals("inscription") && !con.getPseudo().equals("") && !con.getMdp().equals(""))
            {
                try{
                //on recherche dans la base de donnée si un pseudo identique existe deja
                BasicDBObject query = new BasicDBObject();
                query.put("pseudo", Pattern.compile(con.getPseudo()));
                DBCursor cursor = mongo.getCollection().find(query);
                DBObject obj  = cursor.next();
                existe = true;
                }catch(NoSuchElementException ex)
                { existe = false;}
                //si il existe, on affiche un message d'erreur
                if( existe == true )
                {
                    JOptionPane jop = new JOptionPane();
                    jop.showMessageDialog(con,"Pseudo déjà utilisé","Information",JOptionPane.INFORMATION_MESSAGE);
                }
                //sinon on insère dans la base de données
                else
                {
                BasicDBObject inscr = new BasicDBObject();
                inscr.append("pseudo", con.getPseudo());
                inscr.append("mdp", con.getMdp());

                mongo.getCollection().insert(inscr);
                }

            }
            //connexion , on vérifie que tous les champs soient remplis
            else if(b.getName().equals("connexion") && !con.getPseudo().equals("") && !con.getMdp().equals("") )
            {
                String pseudo = con.getPseudo();
                String mdp = con.getMdp();
                try{
                //on recherche dans la base de donnée si l'utilisateur existe
                BasicDBObject query = new BasicDBObject();
                List<BasicDBObject> obj = new ArrayList<BasicDBObject>();
                obj.add(new BasicDBObject("pseudo", pseudo));
                obj.add(new BasicDBObject("mdp", mdp));
                query.put("$and",obj);
                DBCursor cursor = mongo.getCollection().find(query);
                DBObject dbobject  = cursor.next();
                //si il existe, on cree un utilisateur représentant le client connecté
                existe = true;
                user = new Utilisateur(dbobject);
                }catch(NoSuchElementException ex)
                { existe = false;}
                //on se connecte
                if( existe == true)
                {
                    //on crée une nouvelle instance de la vue principale
                    vis = new Visualisation(con,true,user.getAdmin()); 
                    //on lui associe un controleur
                    Controleur control2 = new Controleur(mongo,vis);
                    vis.addControleur(control2);
                    //on change de collection car nous n'avons plus besoin des users pour l'instant
                    //on va vouloir afficher les jeux à l'affichage
                    mongo.setCollection("jeu");
                    //on définit la vue courante comme étant la Visualisation
                    vue = 1;
                    con.setVisible(false);
                    vis.setVisible(true);
                }
                //erreur, soit l'utilisateur n'xiste pas , soit erreur dans l'entree des identifiants
                else
                {
                    JOptionPane jop = new JOptionPane();
                    jop.showMessageDialog(con,"Pseudo ou mot de passe incorrect, enregistrez vous ?","Erreur",JOptionPane.INFORMATION_MESSAGE);
                }        

            }
            //si tous les champs n'ont pas été remplis
            else 
            {
                JOptionPane jop = new JOptionPane();
                jop.showMessageDialog(con,"Veuillez remplir tous les champs","Information",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        //si la vue courante est la visualisation
        if( vue == 1)
        {
            //on gere la deconnexion
            if (b.getName().equals("deconnexion"))
            {
                //on redefinit la vue courante comme etant l'ecran de connexion
                vue = 0;
                //on repasse sur la collection users
                mongo.setCollection("users");
                //on recree une vue et on lui associe un controleur
                con = new Connexion();
                Controleur control = new Controleur(mongo, con);
                con.addControleur(control);
                vis.setVisible(false);
                con.setVisible(true);
            }
        }
    }
    
}
