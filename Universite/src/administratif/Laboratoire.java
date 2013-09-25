package administratif;

public class Laboratoire {

	private String nom;

	public Laboratoire()
	{
		this.nom="";
	}

	public Laboratoire(String n)
	{
		this.nom= n;
	}

	public Laboratoire(Laboratoire d)
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
		
		res+="Laboratoire de nom: "+ this.nom;
				
		return res;
		
	}
}
