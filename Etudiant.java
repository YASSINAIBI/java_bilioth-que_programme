package bibliotheque;

public class Etudiant extends Person{

	private String branche;
	
	public String getEtudBranche() {
		return branche;
	}
	public void etudBranche(String etudBranche) {
		branche = etudBranche;
	}
}
