package bibliotheque;

public class Person {

	private int ID;
	private int Age;
	private String FirstName;
	private String LastName;
	private String Email;
	
	public int getPerID() {
		return ID;
	}
	public void perID(int perID) {
		ID = perID;
	}
	
	public int getPerAge() {
		return Age;
	}
	public void perAge(int perAge) {
		Age = perAge;
	}
	
	public String getPerFirstName() {
		return FirstName;
	}
	public void perFirstName(String perName) {
		FirstName = perName;
	}
	
	public String getPerLastName() {
		return LastName;
	}
	public void perLastName(String perLastName) {
		LastName = perLastName;
	}
	
	public String getPerEmail() {
		return Email;
	}
	public void perEmail(String perEmail) {
		Email = perEmail;
	}
}


