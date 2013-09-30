package personnel;

import org.jdom2.Attribute;
import org.jdom2.Element;

public class ChargeRecherche extends Personnel implements Chercheur{

	public ChargeRecherche()
	{
		super();
	}
	
	public ChargeRecherche(String nom, String prenom)
	{
		super(nom, prenom);
	}
	
	/*@Override
	public void toXML(Element p)
	{
		//Ajout de l'attribut type 
		Attribute type = new Attribute("type","ChargeRecherche");
	    personne.setAttribute(type);
	}*/
}
