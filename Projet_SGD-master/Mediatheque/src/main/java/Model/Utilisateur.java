package Model;

import com.mongodb.DBObject;
import java.util.List;
import java.util.ArrayList;
import org.json.JSONObject;

public class Utilisateur
{
	private String pseudo;
	private String mdp;
	private int admin;
	private List<Avis> avis;

	public Utilisateur(DBObject obj)
	{
		pseudo = (String) obj.get("pseudo");
		mdp	   = (String) obj.get("mdp");
                if ( obj.get("admin") != null)
		admin  = 1;
                else
                admin = 0;   

		avis = new ArrayList<Avis>();
                avis = (List<Avis>) obj.get("avis");
	}

	// Getter
	public String getPseudo() { return pseudo; }
        public String getMdp() {return mdp;}
	public int getAdmin() { return admin; }
	public List<Avis> getAvis() { return avis ;}

	// Setter
	public void setPseudo(String _pseudo) { pseudo = _pseudo; }
	public void setMdp(String _mdp) { mdp = _mdp; }
	public void setAdmin(int _admin) { admin = _admin; }
	public void setAvis(List<Avis> _avis) { avis = _avis; }

	public void ajouterAvis(float note, int jeu, String commentaire)
	{
		Avis nouvelAvis = new Avis(note, jeu, commentaire);
		avis.add(nouvelAvis);
	}
	
	public void modifierDroits(Utilisateur utilisateur)
        {
            if (this.admin == 1)
            {
                utilisateur.admin = 1;
            }
        }
}
