package graphique;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Frame extends JFrame{
	
	private Panel pan;
	
	public Frame(String titre){
		
		super(titre);
		this.pan=new Panel("Universite");
		
		this.pack();
	}


	public static void main(String [] args) 
    {
    	SwingUtilities.invokeLater(new Runnable() //Processus qui va gérer tout ce qui est lié à l'interface pour éviter les conflits avec le proccessus Main
    	{
    		public void run() 
    		{
    			Frame f = new Frame("universite");
        		f.setSize(300,200);
        		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		f.setVisible(true);
    		}
    	});
    }      
}