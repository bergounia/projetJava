package personnel;

import org.jdom2.Element;

public abstract class Personnel {

	private String nom;
	private String prenom;
	protected Element personne= new Element("personne");;
	
	public Personnel()
	{
		this.nom= null;
		this.prenom= null;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Personnel(String nom, String prenom)
	{
		this.nom= nom;
		this.prenom= prenom;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
	
	public String toString()
	{
		String res= new String();
		
		res+= this.nom+" "+this.prenom;
				
		return res;
		
	}
	
	public static Element getPersonnel()
	{
		Element personne= new Element("personne");
		return personne;
	}
	
	public void toXML(Element p)
	{		
		Element personne= Personnel.getPersonnel();
		//Creation de l'element personne
		p.addContent(personne);
	      
		//Une personne a un nom
		Element nom= new Element("nom");
		nom.setText(this.getNom());
		personne.addContent(nom);
		
		//Une personne a aussi un prenom
		Element prenom= new Element("prenom");
		prenom.setText(this.getPrenom());
		personne.addContent(prenom);  
	}
}
