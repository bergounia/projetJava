package administratif;

import java.util.ArrayList;

import personnel.Chercheur;



public class Laboratoire implements Chercheur {

	private String nom;
	private ArrayList<Chercheur> p;
	private ArrayList<Departement> depart;

	public Laboratoire()
	{
		this.nom="";
		this.p= new ArrayList<Chercheur>();
		this.depart= new ArrayList<Departement>();
	}

	public Laboratoire(String n, ArrayList<Chercheur> liste, ArrayList<Departement> d)
	{
		this.nom= n;
		this.p= liste;
		this.depart= d;
		
	}

	public Laboratoire(Laboratoire d)
	{
		this.nom= d.nom;
		this.p= d.p;
		this.depart= d.depart;
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
