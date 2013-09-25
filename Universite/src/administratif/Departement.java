package administratif;

public class Departement {

	private String nom;

	public Departement()
	{
		this.nom="";
	}

	public Departement(String n)
	{
		this.nom= n;
	}

	public Departement(Departement d)
	{
		this.nom= d.nom;
	}

	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
	
	@Override
	public String toString()
	{
		String res= new String();
		
		res+="Departement de nom: "+ this.nom;
				
		return res;
		
	}
}
