package sauvegardeXML;

import graphique.Frame;

import java.io.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.jdom2.*;
import org.jdom2.output.*;

import personnel.ChargeRecherche;
import personnel.Chercheur;
import personnel.Enseignant;
import personnel.MaitreDeConf;
import personnel.Personnel;
import personnel.Prag;
import personnel.Professeur;
import universite.batiments.Batiment;
import universite.batiments.Bureau;
import universite.batiments.Salle;
import universite.batiments.SalleCours;
import universite.batiments.SalleReunion;
import universite.batiments.SalleTP;
import administratif.Departement;
import administratif.Laboratoire;
import administratif.UFR;
import administratif.Universite;

public class JDom1 {

	//Nous allons commencer notre arborescence en créant la racine XML
	//qui sera ici "universite".
	public static Element racine = new Element("Universite");

	//On crée un nouveau Document JDOM basé sur la racine que l'on vient de créer
	public static org.jdom2.Document document = new Document(racine);
	
	public static Universite urca;
	public static ArrayList<Batiment> listeBatiments = new ArrayList<Batiment>();
	public static ArrayList<Personnel> listePersonnels = new ArrayList<Personnel>();
	public static ArrayList<Departement> listeDepartements = new ArrayList<Departement>();

	public static void creationObjets()
	{
		// Creation du personnel
		Personnel p1 = new Prag("Bride", "Aymeric");
		Personnel p2 = new MaitreDeConf("Rabat", "Cyril");
		Personnel p3 = new Professeur("Kaminski", "Benjamin");
		Personnel p4 = new ChargeRecherche("Nocent", "Olivier");
		Personnel p5 = new Prag("Sandron", "Lidy");
		Personnel p6 = new Prag("Prevost", "Sabine");
		Personnel p7 = new Professeur("Gillard", "Damien");
		Personnel p8 = new ChargeRecherche("Joncquet", "Antoine");

		ArrayList<Personnel> listePersonnel = new ArrayList<Personnel>();

		listePersonnel.add(p1);
		listePersonnel.add(p2);
		listePersonnel.add(p3);
		listePersonnel.add(p4);

		// Creation de 2 listes, chercheur et enseignant
		ArrayList<Enseignant> listeEnseignants = new ArrayList<Enseignant>();

		listeEnseignants.add((Enseignant) p1);
		listeEnseignants.add((Enseignant) p2);
		listeEnseignants.add((Enseignant) p3);

		ArrayList<Enseignant> listeEnseignantsPhysique = new ArrayList<Enseignant>();

		listeEnseignantsPhysique.add((Enseignant) p5);
		listeEnseignantsPhysique.add((Enseignant) p6);

		ArrayList<Chercheur> listeChercheurs = new ArrayList<Chercheur>();

		listeChercheurs.add((Chercheur) p3);
		listeChercheurs.add((Chercheur) p4);

		ArrayList<Chercheur> listeChercheurs2 = new ArrayList<Chercheur>();

		listeChercheurs2.add((Chercheur) p7);
		listeChercheurs2.add((Chercheur) p8);

		//Creation de salles du batiment 1
		Salle s11 = new SalleCours("Maths", true);
		Salle s12 = new SalleReunion("ConseilDeClasse", false);
		Salle s13 = new SalleTP("TpJava", 20);
		Salle s14 = new Bureau("BureauPersonnel", listePersonnel);
		
		ArrayList<Salle> listeSallesBat1 = new ArrayList<Salle>();

		listeSallesBat1.add(s11);
		listeSallesBat1.add(s12);
		listeSallesBat1.add(s13);
		listeSallesBat1.add(s14);

		// Creation des salles du batiment 2
		Salle s21 = new SalleCours("BD", true);
		Salle s22 = new SalleReunion("Conseils", true);
		Salle s23 = new SalleTP("TpBD", 15);
		Salle s24 = new SalleCours("Analyse", false);

		ArrayList<Salle> listeSallesBat2 = new ArrayList<Salle>();

		listeSallesBat2.add(s21);
		listeSallesBat2.add(s22);
		listeSallesBat2.add(s23);
		listeSallesBat2.add(s24);

		// Creation des batiments
		Batiment b1 = new Batiment("Informatique", listeSallesBat1);
		Batiment b2 = new Batiment("Amphi", listeSallesBat2);

		listeBatiments.add(b1);
		listeBatiments.add(b2);

		// Creation des laboratoires
		Laboratoire labo1 = new Laboratoire("Labo1", listeChercheurs);
		Laboratoire labo2 = new Laboratoire("Labo2", listeChercheurs2);

		ArrayList<Laboratoire> listeLaboratoires = new ArrayList<Laboratoire>();

		listeLaboratoires.add(labo1);
		listeLaboratoires.add(labo2);

		// Creation d'une liste de departements
		Departement d1 = new Departement("DepartementInformatique", listeEnseignants);
		Departement d2 = new Departement("DepartementPhysique", listeEnseignantsPhysique);

		ArrayList<Departement> listeDepartements = new ArrayList<Departement>();

		listeDepartements.add(d1);
		listeDepartements.add(d2);

		// Seconde liste de laboratoires
		Departement d3 = new Departement("DepartementTC", listeEnseignants);
		Departement d4 = new Departement("DepartementGC", listeEnseignantsPhysique);

		ArrayList<Departement> listeDepartements2 = new ArrayList<Departement>();

		listeDepartements2.add(d3);
		listeDepartements2.add(d4);

		// Creation de l'ufr
		UFR ufrReims = new UFR("FacDesSciences", listeBatiments, listeDepartements);
		UFR ufrChalon = new UFR("FacDeChalon", listeBatiments, listeDepartements2);

		ArrayList<UFR> listeUFR = new ArrayList<UFR>();

		listeUFR.add(ufrReims);
		listeUFR.add(ufrChalon);

		Departement d5= new Departement("DepartementMathematiques", listeEnseignants);
		Departement d6= new Departement("DepartementEconomie", listeEnseignants);
		
		ArrayList<Departement> listeDepartements3 = new ArrayList<Departement>();
		
		listeDepartements3.add(d5);
		listeDepartements3.add(d6);
		
		urca = new Universite("URCA", listeUFR, listeLaboratoires, listeDepartements3);
	}
	
	public static void testObjet(){
				
		listeBatiments.add(new Batiment("Informatique"));
		listeBatiments.add(new Batiment("Amphi"));
		
		listePersonnels.add(new Prag("Bride", "Aymeric"));
		listePersonnels.add(new MaitreDeConf("Rabat", "Cyril"));
		listePersonnels.add(new Professeur("Kaminski", "Benjamin"));
		listePersonnels.add(new ChargeRecherche("Nocent", "Olivier"));
		listePersonnels.add(new Prag("Sandron", "Lidy"));
		listePersonnels.add(new Prag("Prevost", "Sabine"));
		listePersonnels.add(new Professeur("Gillard", "Damien"));
		listePersonnels.add(new ChargeRecherche("Joncquet", "Antoine"));
		
		listeDepartements.add(new Departement());
		listeDepartements.add(new Departement("DepartementInformatique"));
		
	}
	
	public static void affiche()
	{
		try
		{
			//On utilise ici un affichage classique avec getPrettyFormat()
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			sortie.output(document, System.out);
		}
		catch (java.io.IOException e){}
	}

	public static void enregistre(String fichier)
	{
		try
		{
			//On utilise ici un affichage classique avec getPrettyFormat()
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			//Remarquez qu'il suffit simplement de créer une instance de FileOutputStream
			//avec en argument le nom du fichier pour effectuer la sérialisation.
			sortie.output(document, new FileOutputStream(fichier));
		}
		catch (java.io.IOException e){}
	}

	public static void main(String[] args)
	{
		
		testObjet();

		SwingUtilities.invokeLater(new Runnable() //Processus qui va gérer tout ce qui est lié à l'interface pour éviter les conflits avec le proccessus Main
    	{
    		public void run() 
    		{
    			Frame f = new Frame("Universite");
    			f.ajoutBatimentListe(listeBatiments);
    			//f.ajoutDepartementListe(listeDepartements);
        		f.setSize(300,200);
        		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		f.setVisible(true);
    		}
    	});
	/*
		urca.toXML(racine);

		//Les deux méthodes qui suivent seront définies plus loin dans l'article
		affiche();
		enregistre("universite.xml");
*/
	}
}