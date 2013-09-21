package personnel;

public abstract class Personnel {

	private String nom;
	private String prenom;
	
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
}
