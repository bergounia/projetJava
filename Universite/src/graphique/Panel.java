package graphique;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import personnel.ChargeRecherche;
import personnel.Personnel;

public class Panel extends JPanel
{

	private JLabel jlabel;
	private ObjetListe OL;
	
	public Panel(String t) 
	{
		super();
		this.jlabel= new JLabel(t);
		this.OL = new ObjetListe();
		OL.AjoutElement(new ChargeRecherche("benjamin","kaminski"));
		
		
		this.add(this.jlabel);
		this.add(this.OL);
	}
}
