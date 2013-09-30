package graphique;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ObjetListe extends JList{
	
	private static DefaultListModel  LObjets = new DefaultListModel();;
	
	public ObjetListe(){
		super(LObjets);
	}
	
	public ObjetListe(DefaultListModel  liste){
		super(LObjets);
		this.LObjets=liste;
	}
	
	public void AjoutElement(Object element){
		this.LObjets.addElement(element);
	}


}
