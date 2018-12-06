package Model;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public class Jeu
{
  private int id;
  private String titre;
  private Date date_parution;
  private Date date_ajout;
  private String editeur;
  private String genre;
  private List<String> plateforme;
  private float prix;
  private float note;
  private int nbNote;
  private int disponibilite;
  private String serie;
  private String description;
  private String image;

  public Jeu(JSONObject obj)
  {
    id            = (Integer) obj.get("id");
    titre         = (String) obj.get("titre");
    date_parution = (Date) obj.get("date_parution");
    date_ajout    = (Date) obj.get("date_ajout");
    editeur       = (String) obj.get("editeur");
    genre         = (String) obj.get("genre");
    prix          = (float) obj.get("prix");
    note          = (float) obj.get("note");
    nbNote        = (Integer) obj.get("nbNote");
    disponibilite = (Integer) obj.get("disponibilite");
    serie         = (String) obj.get("serie");
    description   = (String) obj.get("description");
    image         = (String) obj.get("image");
    
    JSONArray jsonArray = obj.getJSONArray(obj.getString("plateforme"));
    plateforme    = new ArrayList<String>();
    if (jsonArray != null)
    {
        int jsonArrayLength = jsonArray.length();
        for (int i = 0; i < jsonArrayLength; i++)
        {
            plateforme.add(jsonArray.get(i).toString());
        }
    }
  }

  public Jeu(int _id, String _titre, Date _parution, Date _ajout, String _editeur, String _genre, List<String> _plateforme, float _prix, float _note, int _nbNote, int _disponibilite, String _serie, String _description, String _image)
  {
    id            = _id;
    titre         = _titre;
    date_parution = _parution;
    date_ajout    = _ajout;
    editeur       = _editeur;
    genre         = _genre;
    plateforme    = _plateforme;
    prix          = _prix;
    note          = _note;
    nbNote        = _nbNote;
    disponibilite = _disponibilite;
    serie         = _serie;
    description   = _description;
    image         = _image;
  }

  // Getter
  public int getId() { return id; }
  public String getTitre() { return titre; }
  public Date getDateParution() { return date_parution; }
  public Date getDateAjout() { return date_ajout; }
  public String getEditeur() { return editeur; }
  public String getGenre() { return genre ;}
  public List<String> getplateforme() { return plateforme; }
  public float getPrix() { return prix; }
  public float getNote() { return note; }
  public int getnbNote() { return nbNote; }
  public int getDisponibilite() { return disponibilite; }
  public String getSerie() { return serie; }
  public String getDescription() { return description; }
  public String getImage() { return image; }

  // Setter
  public void setDisponibilite(int _disponibilite) { disponibilite = _disponibilite; }
  public void setDescription(String _description) { description = _description; }

}
