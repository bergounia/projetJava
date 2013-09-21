package universite.batiments;

public abstract class Salle {

	private String num;
	private int nbplace;
	
	public Salle()
	{
		this.num= null;
		this.nbplace= 0;
	}
	
	public Salle(String num)
	{
		this.num= num;
	}
	
	public Salle(String num, int i) 
	{
		this.num= num;
		this.nbplace= i;
	}
	
	public String getNum() {
		return this.num;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
	
	public int getNbplace() {
		return nbplace;
	}
	
	public void setNbplace(int nbplace) {
		this.nbplace = nbplace;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
	
	@Override
	public String toString()
	{
		String res= new String();
		
		res+="La salle: "+ this.num + "contient "+ this.nbplace;
				
		return res;
		
	}
}
