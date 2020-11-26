package bibliotheque;

public class Livre {

	private int ID;
	private String BookName;
	private String BookCategory;
	
	public int getID() {
		return ID;
	}
	public void livID(int livID) {
		ID = livID;
	}
	
	public String getBookName() {
		return BookName;
	}
	public void livBookName(String livBookName) {
		BookName = livBookName;
	}
	
	public String getBookCategory() {
		return BookCategory;
	}
	public void livBookCategory(String livBookCategory) {
		BookCategory = livBookCategory;
	}
}
