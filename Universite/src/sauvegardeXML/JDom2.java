package sauvegardeXML;

import java.io.*;

import org.jdom2.*;
import org.jdom2.input.*;
import org.jdom2.filter.*;

import universite.batiments.Batiment;
import universite.batiments.Salle;
import administratif.Departement;
import administratif.UFR;
import administratif.Universite;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class JDom2
{
   static org.jdom2.Document document;
   static Element racine;
   //static ArrayList<UFR> listeUFRs = new ArrayList<UFR>();
   static Batiment batCourant;
   static UFR ufrCourant;
   static ArrayList<Batiment> listeBATs = new ArrayList<Batiment>();
   static ArrayList<Salle> listeSALLEs = new ArrayList<Salle>();
   
   
   // il faudra créer 2 autres éléments courant (salle et batiments)

   public static void LectureXML(ArrayList<UFR> listeUFRs){
	   
		 //On crée une List contenant tous les noeuds "etudiant" de l'Element racine
		   List listUFR = racine.getChild("universite").getChild("ufrsUniversite").getChildren("ufr");

		   //On crée un Iterator sur notre liste
		   Iterator i = listUFR.iterator();
		   while(i.hasNext())
		   {
		      //On recrée l'Element courant à chaque tour de boucle afin de
		      //pouvoir utiliser les méthodes propres aux Element comme :
		      //sélectionner un nœud fils, modifier du texte, etc...
		      Element courant = (Element)i.next();
		      //On affiche le nom de l’élément courant
		      //System.out.println(courant.getChild("nom").getText());
		      ufrCourant=new UFR(courant.getChild("nom").getText());
		      
		      List listBatiments = courant.getChild("batiments").getChildren("batiment");
		      Iterator j = listBatiments.iterator();
		      while(j.hasNext())
			   {
		    	  Element courant2 = (Element)j.next();
		    	  batCourant = new Batiment(courant2.getChild("nom").getText());
		    	  
		    	  
		    	  List listSalles = courant2.getChild("salles").getChildren("salle");
		    	  Iterator k = listSalles.iterator();
				  while(k.hasNext())
				   {
					   Element courant3 = (Element)k.next();
					   listeSALLEs.add(new Salle(courant3.getChild("num").getText()));
					   
					   //if (batCourant !=null) batCourant.ajoutSalle(new Salle());
				   }
				   
				   batCourant.setSalle(listeSALLEs);
				   listeBATs.add(batCourant);
				   listeSALLEs.clear();
			   }
		      
		      ufrCourant.setB(listeBATs);
		      listeUFRs.add(ufrCourant);
		      listeBATs.clear();
		      //System.out.println(batCourant);
		     
		   }
		   //System.out.println(ufrCourant);
		   //System.out.println(listeUFRs.size());
	   }
   
   
   public static void ParserXML(Universite univ)
   {
      //On crée une instance de SAXBuilder
      SAXBuilder sxb = new SAXBuilder();
      try
      {
         //On crée un nouveau document JDOM avec en argument le fichier XML
         //Le parsing est terminé ;)
         document = sxb.build(new File("universite.xml"));
      }
      catch(Exception e){}

      //On initialise un nouvel élément racine avec l'élément racine du document.
      racine = document.getRootElement();
      
      LectureXML(univ.getUfr());
   }
   
   /*public static void affichertout(){
	  
	  for(UFR r:listeUFRs){
		  System.out.println(r);
		  for(Batiment b:r.getListeBatiments()){
			  System.out.println(b);
			  for(Salle s:b.getSalle()){
				  System.out.println(s);
			  }
		  }
	  }
	  
  }
   
   public static void main(String[]args){
	   ParserXML();
	   affichertout();
   }*/
}
