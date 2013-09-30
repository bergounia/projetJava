package sauvegardeXML;

import java.io.*;

import org.jdom2.*;
import org.jdom2.input.*;
import org.jdom2.filter.*;

import universite.batiments.Batiment;
import universite.batiments.Salle;
import administratif.Departement;
import administratif.UFR;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class JDom2
{
   static org.jdom2.Document document;
   static Element racine;
   static ArrayList<UFR> listeUFRs = new ArrayList<UFR>();
   static Batiment batCourant;
   static UFR ufrCourant;
   
   
   // il faudra cr�er 2 autres �l�ments courant (salle et batiments)

   public static void LectureXML(){
	   
		 //On cr�e une List contenant tous les noeuds "etudiant" de l'Element racine
		   List listUFR = racine.getChild("universite").getChild("ufrsUniversite").getChildren("ufr");

		   //On cr�e un Iterator sur notre liste
		   Iterator i = listUFR.iterator();
		   while(i.hasNext())
		   {
		      //On recr�e l'Element courant � chaque tour de boucle afin de
		      //pouvoir utiliser les m�thodes propres aux Element comme :
		      //s�lectionner un n�ud fils, modifier du texte, etc...
		      Element courant = (Element)i.next();
		      //On affiche le nom de l��l�ment courant
		      //System.out.println(courant.getChild("nom").getText());
		      ufrCourant=new UFR(courant.getChild("nom").getText());
		      
		      List listBatiments = courant.getChild("batiments").getChildren("batiment");
		      Iterator j = listUFR.iterator();
		      while(i.hasNext())
			   {
		    	  Element courant2 = (Element)i.next();
		    	  batCourant = new Batiment(courant2.getChild("nom").getText());
		    	  
		    	  List listSalles = courant2.getChild("salles").getChildren("salle");
		    	  Iterator k = listUFR.iterator();
				  while(i.hasNext())
				   {
					   Element courant3 = (Element)i.next();
					   batCourant.ajoutSalle(new Salle(courant3.getChild("nom").getText()));
				   }
				   
				   ufrCourant.ajoutBatiment(batCourant);
			   }
		      
		      listeUFRs.add(new UFR(courant.getChild("nom").getText()));
		      //System.out.println(listeUFRs.size());
		   }

	   }
   
   
   public static void ParserXML()
   {
      //On cr�e une instance de SAXBuilder
      SAXBuilder sxb = new SAXBuilder();
      try
      {
         //On cr�e un nouveau document JDOM avec en argument le fichier XML
         //Le parsing est termin� ;)
         document = sxb.build(new File("universite.xml"));
      }
      catch(Exception e){}

      //On initialise un nouvel �l�ment racine avec l'�l�ment racine du document.
      racine = document.getRootElement();
      
      LectureXML();
   }
   
  
   
   public static void main(String[]args){
	   ParserXML();
   }
}
