package sauvegardeXML;

import java.io.*;
import org.jdom2.*;
import org.jdom2.output.*;

public class JDom1 {

	//Nous allons commencer notre arborescence en créant la racine XML
	//qui sera ici "universite".
	static Element racine = new Element("Universite");

	//On crée un nouveau Document JDOM basé sur la racine que l'on vient de créer
	static org.jdom2.Document document = new Document(racine);

	static void affiche()
	{
		try
		{
			//On utilise ici un affichage classique avec getPrettyFormat()
			XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
			sortie.output(document, System.out);
		}
		catch (java.io.IOException e){}
	}

	static void enregistre(String fichier)
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
		//On crée un nouvel Element batiment et on l'ajoute
		//en tant qu'Element de racine
		Element batiment = new Element("batiment");
		racine.addContent(batiment);


		//On crée un nouvel Element nom, on lui assigne du texte
		//et on l'ajoute en tant qu'Element de etudiant
		Element id = new Element("id");
		id.setText("001");
		batiment.addContent(id);

		//Les deux méthodes qui suivent seront définies plus loin dans l'article
		affiche();
		enregistre("universite.xml");

	}
}