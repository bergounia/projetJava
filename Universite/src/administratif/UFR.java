package administratif;

public class UFR {
	
	private String nom;

	public UFR(String nom) {
		this.nom = nom;
	}
	
	public UFR(UFR u) {
		this.nom = u.nom;
	}
	
	public UFR() {
		this.nom = "noname";
	}

}