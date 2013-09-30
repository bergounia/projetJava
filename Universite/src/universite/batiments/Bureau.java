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
	
	public Bureau(String num, int i, ArrayList<Personnel> p){
		super(num, i);	
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
	
	/*@Override
	public void toXML(Element s)
	{
		//Ajout de l'attribut type 
		Attribute type = new Attribute("type","Bureau");
		Salle.getSalle().setAttribute(type);
		
		Element personnel= new Element("Personnel");
		Salle.getSalle().addContent(personnel);
		
		for(Personnel e: this.pList)
		{
			e.toXML(personnel);
		}
	}*/
}