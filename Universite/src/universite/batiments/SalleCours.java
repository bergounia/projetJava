package universite.batiments;

public class SalleCours extends Salle{
	
	private boolean videoProj=false;

	public SalleCours()
	{
		super();
	}
	
	public SalleCours(String num, boolean vid)
	{
		super(num);
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
}
