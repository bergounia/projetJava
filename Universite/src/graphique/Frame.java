package graphique;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import personnel.Personnel;
import sauvegardeXML.JDom1;
import universite.batiments.Batiment;
import universite.batiments.Salle;
import administratif.*;


public class Frame extends JFrame{
	
	private JLabel batiment;
	private JLabel listeBatiments;
	private JLabel departement;
	private ObjetListe batiments;
	private ObjetListe dpts;
	private ObjetListe personnels;
	
	public Frame(String titre){
		
		super(titre);
		//this.batiment=new JLabel("Liste des batiments");
		//this.departement= new JLabel("Liste des departements");
		
		//this.listeBatiments= new JLabel(JDom1.urca.listerBatiments());
		
		this.setLayout(new GridLayout(2, 2));
		//this.add(this.batiment);
		//this.add(this.departement);
		
		this.batiments=new ObjetListe();
		this.add(this.batiments);
		
		//this.personnels=new ObjetListe();
		//this.add(this.personnels);
		
		//this.dpts=new ObjetListe();
		//this.add(this.dpts);
		
		this.pack();
	}


	public void ajoutBatiment(Object bat){
		this.batiments.AjoutElement(bat);
	}
	
	public void ajoutBatimentListe(ArrayList<Batiment> listeBatiment){
		for(Batiment bat : listeBatiment)
		{
			ajoutBatiment(bat);
		}
	}
	
	public void ajoutPersonnel(Object personnel){
		this.personnels.AjoutElement(personnel);
	}
	
	public void ajoutPersonnelListe(ArrayList<Personnel> listePersonnel){
		for(Personnel per : listePersonnel)
		{
			ajoutPersonnel(per);
		}
	}
	
	public void ajoutDepartement(Object dptt){
		this.dpts.AjoutElement(dptt);
	}
	
	public void ajoutDepartementListe(ArrayList<Departement> listeDPT){
		for(Departement DPT : listeDPT)
		{
			ajoutDepartement(DPT);
		}
	}
}