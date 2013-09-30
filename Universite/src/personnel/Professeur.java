package personnel;

import org.jdom2.Attribute;
import org.jdom2.Element;

public class Professeur extends Personnel implements Enseignant, Chercheur{
	
	public Professeur()
	{
		super();
	}
	
	public Professeur(String nom, String prenom)
	{
		super(nom, prenom);
	}
	
	/*@Override
	public void toXML(Element p)
	{
		//Ajout de l'attribut type 
		Attribute type = new Attribute("type","Professeur");
	    personne.setAttribute(type);
	}*/
}
