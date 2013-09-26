package administratif;

import java.util.ArrayList;

import personnel.Enseignant;

public class Departement implements Enseignant{

	private String nom;
	private ArrayList<Enseignant> p;

	public Departement()
	{
		this.nom="";
		this.p= new ArrayList<Enseignant>();
	}

	public Departement(String n, ArrayList<Enseignant> perso)
	{
		this.nom= n;
		this.p= perso;
	}

	public Departement(Departement d)
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
		
		res+="Departement de nom: "+ this.nom;
				
		return res;
		
	}
}
