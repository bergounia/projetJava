package universite.batiments;

import org.jdom2.Attribute;
import org.jdom2.Element;

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
	
	@Override
	public void toXML(Element salleXML)
	{
		//Ajout de l'attribut type 
		Attribute type = new Attribute("type","SalleReunion");
		this.sa.setAttribute(type);
	}
}
