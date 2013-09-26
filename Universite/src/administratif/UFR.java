package administratif;

import java.util.ArrayList;

import universite.batiments.Batiment;

public class UFR {
	
	private String nom;
	private ArrayList<Batiment> b;
	private ArrayList<Departement> d;

	public UFR(String nom, ArrayList<Batiment> bat, ArrayList<Departement> depart) {
		this.nom = nom;
		this.b= bat;
		this.d= depart;
	}
	
	public UFR(UFR u) {
		this.nom = u.nom;
		this.b= u.b;
		this.d= u.d;
	}
	
	public UFR() {
		this.nom = "noname";
		this.b= new ArrayList<Batiment>();
		this.d= new ArrayList<Departement>();
	}
	
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
	
	@Override
	public String toString()
	{
		String res= new String();
		
		res+="UFR de nom: "+ this.nom;
				
		return res;
		
	}

}