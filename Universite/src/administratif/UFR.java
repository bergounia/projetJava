package administratif;

import java.util.ArrayList;

import org.jdom2.Element;

import universite.batiments.Batiment;

public class UFR {
	
	private String nom;
	private ArrayList<Batiment> b;
	private ArrayList<Departement> d;

	public UFR(String nom, ArrayList<Batiment> bat, ArrayList<Departement> depart) {
		this.nom = nom;
		this.b= bat;
		this.d= depart;
	}
	
	public UFR(String nom) {
		this.nom = nom;
		this.b= null;
		this.d= null;
	}
	
	public UFR(UFR u) {
		this.nom = u.nom;
		this.b= u.b;
		this.d= u.d;
	}
	
	public UFR() {
		this.nom = "noname";
		this.b= new ArrayList<Batiment>();
		this.d= new ArrayList<Departement>();
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public ArrayList<Batiment> getListeBatiments()
	{
		return this.b;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
	
	@Override
	public String toString()
	{
		String res= new String();
		
		res+="UFR de nom: "+ this.nom;
				
		return res;
		
	}
	
	public void ajoutBatiment(Batiment bat){
		this.b.add(bat);
	}

	public void toXML(Element u)
	{
		Element ufr= new Element("ufr");
		u.addContent(ufr);
		
		Element nom= new Element("nom");
		nom.setText(this.getNom());
		ufr.addContent(nom);
		
		Element batiments= new Element("batiments");
		ufr.addContent(batiments);
		
		for(Batiment bat : this.b)
		{
			bat.toXML(batiments);
		}
		
		Element departements= new Element("departementsUFR");
		ufr.addContent(departements);
		
		for(Departement depart : this.d)
		{
			depart.toXML(departements);
		}
	}

	public ArrayList<Batiment> getB() {
		return b;
	}

	public void setB(ArrayList<Batiment> b) {
		this.b = new ArrayList<Batiment>(b);
	}

	public ArrayList<Departement> getD() {
		return d;
	}

	public void setD(ArrayList<Departement> d) {
		this.d = d;
	}
}