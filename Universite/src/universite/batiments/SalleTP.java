package universite.batiments;

import org.jdom2.Attribute;
import org.jdom2.Element;

public class SalleTP extends Salle{
	
	private int posteInfo = 0;
	
	public SalleTP()
	{
		super();
	}
	
	public SalleTP(String num, int i, int pI)
	{
		super(num, i);
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

	/*@Override
	public void toXML(Element salleXML)
	{
		//Ajout de l'attribut type 
		Attribute type = new Attribute("type","SalleTP");
		this.sa.setAttribute(type);
	}*/
}
