package universite.batiments;

public class SalleReunion extends Salle{
	
	private boolean paperBoard=false;
	
	public SalleReunion()
	{
		super();
	}
	
	public SalleReunion(String num, boolean b)
	{
		super(num);
		this.setPaperBoard(b);
	}

	public boolean isPaperBoard() {
		return paperBoard;
	}

	public void setPaperBoard(boolean paperBoard) {
		this.paperBoard = paperBoard;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
	
	@Override
	public String toString()
	{
		String res= new String();
		res+="La salle de reunion"+ this.getNum();
		
		if(this.paperBoard)
			res+=" contient un paperboard";
		else
			res+="  ne contient pas de paperboard";	
			
		return res;
		
	}
}
