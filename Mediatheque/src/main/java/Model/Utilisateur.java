package Model;

//import java.util.Map;
//import java.util.HashMap;

import java.util.List;
import java.util.ArrayList;
import org.json.JSONObject;

public class Utilisateur
{
	private String pseudo;
	private String mdp;
	private boolean admin;
	//private List<Map<String, Object>> avis;
	private List<Avis> avis;

	public Utilisateur(JSONObject obj)
	{
		pseudo = (String) obj.get("pseudo");
		mdp	   = (String) obj.get("mdp");
		admin  = (boolean) obj.get("admin");
		//avis   = new HashMap<String, Object>();

		//ObjectMapper mapper = new ObjectMapper();
		//avis = mapper.readValue(obj.get("avis"), new TypeReference<Map<String, String>>(){});
		avis = new ArrayList<Avis>();
	}

	// Getter
	public String getPseudo() { return pseudo; }
	public boolean getAdmin() { return admin; }
	//public Map<String, Object> getAvis() { return avis; }
	public List<Avis> getAvis() { return avis ;}

	// Setter
	public void setPseudo(String _pseudo) { pseudo = _pseudo; }
	public void setMdp(String _mdp) { mdp = _mdp; }
	public void setAdmin(boolean _admin) { admin = _admin; }
	//public void setAvis(Map<String, Object> _avis) { avis = _avis; }
	public void setAvis(List<Avis> _avis) { avis = _avis; }

	public void ajouterAvis(float note, int jeu, String commentaire)
	{
		//avis.put()
		Avis nouvelAvis = new Avis(note, jeu, commentaire);
		avis.add(nouvelAvis);
	}
}