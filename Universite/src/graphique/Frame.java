package graphique;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import sauvegardeXML.JDom1;
import administratif.*;


public class Frame extends JFrame{
	
	private JLabel batiment;
	private JLabel listeBatiments;
	private JLabel departement;
	
	public Frame(String titre){
		
		super(titre);
		this.batiment=new JLabel("Liste des batiments");
		this.departement= new JLabel("Liste des departements");
		
		//this.listeBatiments= new JLabel(JDom1.urca.listerBatiments());
		
		this.setLayout(new GridLayout(2, 2));
		this.add(this.batiment);
		this.add(this.departement);
		
		this.pack();
	}


	public static void main(String [] args) 
    {
    	SwingUtilities.invokeLater(new Runnable() //Processus qui va gérer tout ce qui est lié à l'interface pour éviter les conflits avec le proccessus Main
    	{
    		public void run() 
    		{
    			Frame f = new Frame("Universite");
        		f.setSize(300,200);
        		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		f.setVisible(true);
    		}
    	});
    }      
}