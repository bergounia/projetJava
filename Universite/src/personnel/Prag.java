package personnel;

import org.jdom2.Attribute;
import org.jdom2.Element;

public class Prag extends Personnel implements Enseignant{

	public Prag()
	{
		super();
	}
	
	public Prag(String nom, String prenom)
	{
		super(nom, prenom);
	}
	
	/*@Override
	public void toXML(Element p)
	{
		//Ajout de l'attribut type 
		Attribute type = new Attribute("type","Prag");
	    personne.setAttribute(type);
	}*/
}