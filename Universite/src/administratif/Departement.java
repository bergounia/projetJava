package administratif;

import java.util.ArrayList;
import org.jdom2.Element;

import personnel.Enseignant;

public class Departement implements Enseignant{

	private String nom;
	private ArrayList<Enseignant> p;

	public Departement()
	{
		this.nom="";
		this.p= new ArrayList<Enseignant>();
	}

	public Departement(String n, ArrayList<Enseignant> perso)
	{
		this.nom= n;
		this.p= perso;
	}

	public Departement(Departement d)
	{
		this.nom= d.nom;
		this.p= d.p;
	}

	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	@Override
	public String toString()
	{
		String res= new String();
		
		res+="Departement de nom: "+ this.nom;
				
		return res;
		
	}
	
	public void toXML(Element e)
	{
		Element departement= new Element("departement");
		e.addContent(departement);
		
		Element nom= new Element("nom");
		nom.setText(this.getNom());
		departement.addContent(nom);
		
		//Element listeDesEnseignants= new Element("Enseignant");
		//departement.addContent(listeDesEnseignants);

	}
}
