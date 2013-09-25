package administratif;

import java.util.ArrayList;

public class Universite {
	
	private String nom;
	private ArrayList<UFR> ufr;
	private ArrayList<Laboratoire> labo;
	private ArrayList<Departement> depart;
	
	public Universite()
	{
		this.nom= "";
		this.ufr= new ArrayList<UFR>();
		this.labo= new ArrayList<Laboratoire>();
		this.depart= new ArrayList<Departement>();
	}
	
	public Universite(String nom, ArrayList<UFR> u, ArrayList<Laboratoire> l, ArrayList<Departement> d)
	{
		this.nom= nom;
		this.ufr= u;
		this.depart= d;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
	
	@Override
	public String toString()
	{
		String res= new String();
		
		res+="L'universite: "+ this.nom + "contient "+ this.ufr+ 
				" mais aussi "+ this.labo+
				" et enfin "+ this.depart;
				
		return res;
		
	}
}
