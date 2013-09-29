package graphique;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel
{

	private JLabel jlabel;
	
	public Panel(String t) 
	{
		super();
		this.jlabel= new JLabel(t);
		
		this.add(this.jlabel);
	}
}
