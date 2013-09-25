package administratif;

public class UFR {
	
	private String nom;

	public UFR(String nom) {
		this.nom = nom;
	}
	
	public UFR(UFR u) {
		this.nom = u.nom;
	}
	
	public UFR() {
		this.nom = "noname";
	}
	
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
	
	@Override
	public String toString()
	{
		String res= new String();
		
		res+="UFR de nom: "+ this.nom;
				
		return res;
		
	}

}