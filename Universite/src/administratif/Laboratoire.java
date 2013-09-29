package administratif;

import java.util.ArrayList;

import org.jdom2.Element;

import personnel.Chercheur;

public class Laboratoire implements Chercheur {

	private String nom;
	private ArrayList<Chercheur> p;

	public Laboratoire()
	{
		this.nom="";
		this.p= new ArrayList<Chercheur>();
	}

	public Laboratoire(String n, ArrayList<Chercheur> liste)
	{
		this.nom= n;
		this.p= liste;		
	}

	public Laboratoire(Laboratoire d)
	{
		this.nom= d.nom;
		this.p= d.p;
	}
	
	public String getNom()
	{
		return this.nom;
	}

	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
	
	@Override
	public String toString()
	{
		String res= new String();
		
		res+="Laboratoire de nom: "+ this.nom;
				
		return res;
		
	}
	
	public void toXML(Element d)
	{
		Element laboratoire= new Element("Laboratoire");
		d.addContent(laboratoire);
		
		Element nom= new Element("nom");
		nom.setText(this.getNom());
		laboratoire.addContent(nom);
	}
}
