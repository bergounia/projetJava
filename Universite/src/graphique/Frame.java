package graphique;

import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import personnel.Personnel;
import sauvegardeXML.JDom1;
import sauvegardeXML.JDom2;
import universite.batiments.Batiment;
import universite.batiments.Salle;
import administratif.*;


public class Frame extends JFrame{
	
	private JLabel universiteLabel;
	private Universite univ=new Universite();
	private JDom1 jdom1 = new JDom1();
	private JDom2 jdom2 = new JDom2();
	
	public Frame(String titre){
		
		super(titre);
		//this.batiment=new JLabel("Liste des batiments");
		//this.departement= new JLabel("Liste des departements");
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				jdom1.sauvegarde(univ);
				System.exit(0);
               } 
          } ) ; 
		
		jdom2.ParserXML(univ);
	
		//this.universiteLabel=new JLabel(affichertout(univ));
		//this.add(this.universiteLabel);
		
		TextArea textArea = new TextArea(affichertout(univ));
		JScrollPane scrollPane = new JScrollPane(textArea);
		
		this.add(scrollPane);
		
		this.pack();
	}
	
	public String affichertout(Universite univ){
		
		String res=new String();
		
		  for(UFR r:univ.getUfr()){
			  res+=r+"\n \n Batiments: \n";
			  for(Batiment b:r.getListeBatiments()){
				  res+= "\t"+b+"\n";
				  res+= "\t \t Salles:\n \n";
				  for(Salle s:b.getSalle()){
					  res+= "\t \t"+s+"\n";
				  }
			  }
		  }
		  
		  return res;
	  }
	

/*
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
	}*/
	
	
	public static void main(String []args){

		SwingUtilities.invokeLater(new Runnable() //Processus qui va gérer tout ce qui est lié à l'interface pour éviter les conflits avec le proccessus Main
    	{
    		public void run() 
    		{
    			Frame f = new Frame("Universite");
    			//f.ajoutBatimentListe(listeBatiments);
    			//f.ajoutDepartementListe(listeDepartements);
        		f.setSize(300,600);
    			f.setLocation(500, 200);
        		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		f.setVisible(true);
    		}
    	});
	}
}