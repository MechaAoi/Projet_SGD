package Model;

import Controller.Controleur;
import View.*;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.management.Query;
/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        //essayer de se connecter à partir de la fac pour voir
       /* try{
            MongoClientURI monclient = new MongoClientURI("mongodb://host1:vn934281@depinfo.u-bourgogne.fr");
            MongoClient mongo = new MongoClient(monclient);
            DB db = mongo.getDB("vn934281");
            DBCollection collection = db.getCollection("users");
            BasicDBObject query = new BasicDBObject();
            query.put("name", Pattern.compile("Bruce Lee"));
            DBCursor cursor = collection.find(query);
            DBObject obj  = cursor.next();
            Utilisateur u = new Utilisateur(obj);
            System.out.println(u.getPseudo()+ " "+ u.getMdp()+ " "+ u.getAdmin());
        } catch (UnknownHostException ex) {
            System.out.println(ex);
        }
        */
        // ça, ça marche ! mais il vous faut une base mongo en localhost avec une collection users remplie
        
        String client = "localhost";
        String database = "projet";
        String collection = "users";
        BDD bdd = new BDD(client, database, collection);
        Connexion con = new Connexion();
        Controleur control = new Controleur(bdd, con);
        con.addControleur(control);
        con.setVisible(true);
        
    }
}
