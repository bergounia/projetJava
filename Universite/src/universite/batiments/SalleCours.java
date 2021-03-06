package universite.batiments;

import org.jdom2.Attribute;
import org.jdom2.Element;

public class SalleCours extends Salle{
	
	private boolean videoProj=false;

	public SalleCours()
	{
		super();
	}
	
	public SalleCours(String num, int i, boolean vid)
	{
		super(num, i);
		this.setVideoProj(vid);
	}

	public boolean isVideoProj() {
		return videoProj;
	}

	public void setVideoProj(boolean videoProj) {
		this.videoProj = videoProj;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
			return super.clone();
	}
	
	@Override
	public String toString()
	{
		String res= new String();
		res+="La salle de cours"+ this.getNum();
		
		if(this.videoProj)
			res+=" contient un video-projecteur";
		else
			res+="  ne contient pas de video-projecteur";	
			
		return res;
	}
	
	/*@Override
	public void toXML(Element salleXML)
	{
		//Ajout de l'attribut type 
		Attribute type = new Attribute("type","SalleCours");
		this.sa.setAttribute(type);
	}*/
}
