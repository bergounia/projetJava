package universite.batiments;

import java.util.ArrayList;

import personnel.Personnel;

public class Bureau extends Salle {

	private ArrayList<Personnel> pList=  new ArrayList<Personnel>();
	
	public Bureau(){
		super();
		this.setpList(null);
	}
	
	public Bureau(String num, ArrayList<Personnel> p){
		super(num);	
		this.setpList(p);
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
}