package universite.batiments;

public class SalleTP extends Salle{
	
	private int posteInfo = 0;
	
	public SalleTP()
	{
		super();
	}
	
	public SalleTP(String num, int pI)
	{
		super(num);
		this.setPosteInfo(pI);
	}

	public int getPosteInfo() {
		return posteInfo;
	}

	public void setPosteInfo(int posteInfo) {
		this.posteInfo = posteInfo;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
	
	@Override
	public String toString()
	{
		String res= new String();
		res+="La salle de tp"+ this.getNum()+ 
				" contient "+ this.posteInfo + " postes informatique";
			
		return res;
		
	}

}
