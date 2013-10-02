package universite.batiments;

import java.util.ArrayList;
import org.jdom2.Element;

public class Batiment {
	
	private int id;
	private String nom;
	private ArrayList<Salle> salle;
	private static int incr=1;
	
	public Batiment()
	{
		this.id= incr++;
		this.nom= null;
		this.salle= null;
	}
	
	public Batiment(String nom, ArrayList<Salle> s)
	{
		this.id= incr++;
		this.nom= nom;
		this.salle= s;
	}
	
	public Batiment(String nom)
	{
		this.id= incr++;
		this.nom= nom;
		this.salle= null;
	}
	
	public Batiment(String nom,int id)
	{
		this.id= id;
		this.nom= nom;
		this.salle= null;
	}

	public Batiment(Batiment b)
	{
		this.id = incr++;
		this.nom= b.nom;
		this.salle= b.salle;
	}
	
	@Override
	public String toString()
	{
		String res= new String();
		
		res+=this.nom + " d'identifiant "+ this.id;
				
		return res;
		
	}
	
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId()
	{
		return this.id;
	}
	
	public void ajoutSalle(Salle sa){
		this.salle.add(sa);
	}
	
	public ArrayList<Salle> getSalle() {
		return salle;
	}

	public void setSalle(ArrayList<Salle> salle) {
		this.salle = new ArrayList<Salle>(salle);
	}
	
	public void toXML(Element bat)
	{
		Element batiment = new Element("batiment");
		bat.addContent(batiment);
		
		Element id= new Element("id");
		id.setText(String.valueOf(this.getId()));
		batiment.addContent(id);
	      
		Element nom= new Element("nom");
		nom.setText(this.getNom());
		batiment.addContent(nom);		
		
		Element salles= new Element("salles");
		batiment.addContent(salles);
		
		for(Salle sal : this.salle)
		{
			sal.toXML(salles);
		}
	}
}
