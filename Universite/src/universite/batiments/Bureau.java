package universite.batiments;

import java.util.ArrayList;
import org.jdom2.Attribute;
import org.jdom2.Element;

import personnel.Personnel;

public class Bureau extends Salle {

	private ArrayList<Personnel> pList;
	
	public Bureau(){
		super();
		this.setpList(null);
	}
	
	public Bureau(String num, ArrayList<Personnel> p){
		super(num);	
		this.pList= p;
	}

	public ArrayList<Personnel> getpList() {
		return pList;
	}

	public void setpList(ArrayList<Personnel> pList) {
		this.pList = pList;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
	
	@Override
	public String toString()
	{
		String res= new String();
		
		res+="Les personnes de ce bureau sont: ";
		
		for (int j=0; j<this.pList.size();j++)
		{
			res+= this.pList.get(j)+"\n";
		}
				
		return res;
		
	}
	
	@Override
	public void toXML(Element salleXML)
	{
		//Ajout de l'attribut type 
		Attribute type = new Attribute("type","Bureau");
		this.sa.setAttribute(type);
		
		Element personnel= new Element("Personnel");
		this.sa.addContent(personnel);
		
		for(Personnel e: this.pList)
		{
			e.toXML(personnel);
		}
	}
}