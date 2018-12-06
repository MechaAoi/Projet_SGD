package Model;

import org.json.JSONObject;

public class Avis
{
	private float note;
	private int jeu;
	private String commentaire;

	public Avis(JSONObject obj)
	{
		note 		= (float) obj.get("note");
		jeu 		= (Integer) obj.get("jeu");
		commentaire = (String) obj.get("commentaire");
	}

	public Avis(float _note, int _jeu, String _commentaire)
	{
		note 		= _note;
		jeu 		= _jeu;
		commentaire = _commentaire;
	}
}