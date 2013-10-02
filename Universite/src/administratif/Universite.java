package administratif;

import java.util.ArrayList;

import org.jdom2.Element;

import universite.batiments.Batiment;

public class Universite {
	
	private String nom;
	private ArrayList<UFR> ufr = new ArrayList<UFR>();
	private ArrayList<Laboratoire> labo = new ArrayList<Laboratoire>();
	private ArrayList<Departement> depart = new ArrayList<Departement>();
	
	public Universite()
	{
		this.nom= "";
		this.ufr= new ArrayList<UFR>();
		this.labo= new ArrayList<Laboratoire>();
		this.depart= new ArrayList<Departement>();
	}
	
	public ArrayList<UFR> getUfr() {
		return ufr;
	}

	public void setUfr(ArrayList<UFR> ufr) {
		this.ufr = ufr;
	}

	public Universite(String nom, ArrayList<UFR> u, ArrayList<Laboratoire> l, ArrayList<Departement> d)
	{
		this.nom= nom;
		this.ufr= u;
		this.labo= l;
		this.depart= d;
	}
	
	public Universite(Universite u)
	{
		this.nom= u.nom;
		this.ufr= u.ufr;
		this.labo= u.labo;
		this.depart= u.depart;
	}
	
	public String getNom()
	{
		return this.nom;
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
	
	public String listerBatiments()
	{
		String res= new String();
		
		for(int i=0; i< this.ufr.size(); i++)
		{
			ArrayList<Batiment> lb= this.ufr.get(i).getListeBatiments();
			
			for(int j=0; j<lb.size(); j++)
			{
				res+= lb.get(j).getNom()+"\n";
			}
		}
		
		return res;
	}
	
	public void toXML(Element universiteRacine)
	{
		Element univ = new Element("universite");
		universiteRacine.addContent(univ);

		Element nom= new Element("nom");
		nom.setText(this.getNom());
		univ.addContent(nom);
	      
		Element ufrs= new Element("ufrsUniversite");
		univ.addContent(ufrs);
		
		for(UFR u : this.ufr)
		{
			u.toXML(ufrs);
		}
		
		Element laboratoires= new Element("laboratoiresUniversite");
		univ.addContent(laboratoires);
		
		for(Laboratoire l : this.labo)
		{
			l.toXML(laboratoires);
		}
		
		Element departements= new Element("departementsUniversite");
		univ.addContent(departements);
		
		for(Departement d : this.depart)
		{
			d.toXML(departements);
		}
	}
}
