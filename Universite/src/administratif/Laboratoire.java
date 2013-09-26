package administratif;

import java.util.ArrayList;
import personnel.Chercheur;

public class Laboratoire implements Chercheur {

	private String nom;
	private ArrayList<Chercheur> p;

	public Laboratoire()
	{
		this.nom="";
		this.p= new ArrayList<Chercheur>();
	}

	public Laboratoire(String n, ArrayList<Chercheur> liste)
	{
		this.nom= n;
		this.p= liste;		
	}

	public Laboratoire(Laboratoire d)
	{
		this.nom= d.nom;
		this.p= d.p;
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
