package personnel;

import org.jdom2.Attribute;
import org.jdom2.Element;

public class MaitreDeConf extends Personnel implements Enseignant, Chercheur{
	
	public MaitreDeConf()
	{
		super();
	}
	
	public MaitreDeConf(String nom, String prenom)
	{
		super(nom, prenom);
	}
	
	@Override
	public void toXML(Element p)
	{
		//Ajout de l'attribut type 
		Attribute type = new Attribute("type","MaitreDeConf");
	    personne.setAttribute(type);
	}
}
