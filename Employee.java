package bibliotheque;

public class Employee extends Person {

	private String Industry;
	private String Salary;

	public String getEmpIndustry() {
		return Industry;
	}
	public void empIndustry(String empIndustry) {
		Industry = empIndustry;
	}
	
	public String getEmpSalary() {
		return Salary;
	}
	public void empSalary(String empSalary) {
		Salary = empSalary;
	}
}
