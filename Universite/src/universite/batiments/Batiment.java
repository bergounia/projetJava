package universite.batiments;

import java.util.ArrayList;

public class Batiment {
	
	private int id;
	private String nom;
	private ArrayList<Salle> salle;
	private static int incr=0;
	
	public Batiment()
	{
		this.id= incr++;
		this.nom= null;
		this.salle= null;
	}
	
	public Batiment(int id, String nom, ArrayList<Salle> s)
	{
		this.id= incr++;
		this.nom= nom;
		this.salle= s;
	}

	public Batiment(Batiment b)
	{
		this.id = incr++;
		this.nom= b.nom;
		this.salle= b.salle;
	}
	
	@Override
	public String toString()
	{
		String res= new String();
		
		res+="batiment: "+ this.nom + "d'identifiant "+ this.id;
				
		return res;
		
	}
	
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Salle> getSalle() {
		return salle;
	}

	public void setSalle(ArrayList<Salle> salle) {
		this.salle = salle;
	}
	
}
