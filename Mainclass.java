package bibliotheque;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		
		int input;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Object> listOfEmployee = new ArrayList<>();
		ArrayList<Object> listOfStudent = new ArrayList<>();
		ArrayList<Object> listOfBook = new ArrayList<>();
		
		do {
			System.out.println("bibliotheque Menu");

			System.out.println("1 - Add New Employee");
			System.out.println("2 - Display All Employee");
			System.out.println("3 - Edit employee");
			System.out.println("4 - Delete Employee");
			
			System.out.println("5 - Add New Student");
			System.out.println("6 - Display All Student");
			System.out.println("7 - Edit Student");
			System.out.println("8 - Delete Student");
			
			System.out.println("9 - Add New Book");
			System.out.println("10 - Display All Book");
			System.out.println("11 - Edit Book");
			System.out.println("12 - Delete Book");

			System.out.println("13 - Quit");
			
			System.out.println("Please enter either 1 to 5");
			input = scanner.nextInt();
			
			
			switch (input) {
				case 1:
					Employee emp = new Employee();
	
					//emp.perID(id);
					System.out.println("enter employee ID");
					int empID = scanner.nextInt();
					emp.perID(empID);
					
					System.out.println("enter employee Age");
					int empAge = scanner.nextInt();
					emp.perAge(empAge);
					
					System.out.println("enter employee first name");
					String empFirstName = scanner.next();
					emp.perFirstName(empFirstName);
					
					System.out.println("enter employee last name");
					String empLastName = scanner.next();
					emp.perLastName(empLastName);
	
					System.out.println("enter employee email");
					String empEmail = scanner.next();
					emp.perEmail(empEmail);
	
					System.out.println("enter employee industry");
					String empIndestry = scanner.next();
					emp.empIndustry(empIndestry);
					
					System.out.println("enter employee salary");
					String employeeSalary = scanner.next();
					emp.empSalary(employeeSalary);
					
					listOfEmployee.add("--------------------- employee list -------------------" + "\n" +
					"employee ID: " + emp.getPerID() + "\n" + "employee Age: " + emp.getPerAge() + "\n" +
					"employee firstName: " + emp.getPerLastName() + "\n" + "employee lastName" + emp.getPerLastName() + "\n" +
					"employee email: " + emp.getPerEmail() + "\n" + "employee industry: " + emp.getEmpIndustry() + "\n" +
					"employee salary: " + emp.getEmpSalary() + "\n");
					
				break;
					
				case 2:
					for(Object object : listOfEmployee) {
						System.out.println(object);
					}

				break;
			
				case 3:
					System.out.println("enter the employee number to modify");
					int employeeModifyId = scanner.nextInt();
					
					Employee emp1 = new Employee();
					
					System.out.println("enter employee ID");
					int empID1 = scanner.nextInt();
					emp1.perID(empID1);
					
					System.out.println("enter employee Age");
					int empAge1 = scanner.nextInt();
					emp1.perAge(empAge1);
					
					System.out.println("enter employee first name");
					String empFirstName1 = scanner.next();
					emp1.perFirstName(empFirstName1);
					
					System.out.println("enter employee last name");
					String empLastName1 = scanner.next();
					emp1.perLastName(empLastName1);
	
					System.out.println("enter employee email");
					String empEmail1 = scanner.next();
					emp1.perEmail(empEmail1);
					
					System.out.println("enter employee industry");
					String empIndestry1 = scanner.next();
					emp1.empIndustry(empIndestry1);
					
					System.out.println("enter employee salary");
					String employeeSalary1 = scanner.next();
					emp1.empSalary(employeeSalary1);
					
					listOfEmployee.set(employeeModifyId,
					"--------------------- employee list -------------------" + "\n" +
					"employee ID: " + employeeModifyId + "\n" + "employee Age: " + emp1.getPerAge() + "\n" +
					"employee firstName: " + emp1.getPerLastName() + "\n" + "employee lastName" + emp1.getPerLastName() + "\n" +
					"employee email: " + emp1.getPerEmail() + "\n" + "employee industry: " + emp1.getEmpIndustry() + "\n" +
					"employee salary: " + emp1.getEmpSalary() + "\n");
				break;
				
				case 4:
					System.out.println("enter the employee number to delete");
					int employeedeleteId = scanner.nextInt();
					
					listOfEmployee.remove(employeedeleteId);
				break;
				
				case 5:
					Etudiant stu = new Etudiant();
	
					//emp.perID(id);
					System.out.println("enter student ID");
					int stuID = scanner.nextInt();
					stu.perID(stuID);
					
					System.out.println("enter student Age");
					int stuAge = scanner.nextInt();
					stu.perAge(stuAge);
					
					System.out.println("enter student first name");
					String stuFirstName = scanner.next();
					stu.perFirstName(stuFirstName);
					
					System.out.println("enter student last name");
					String stuLastName = scanner.next();
					stu.perLastName(stuLastName);
	
					System.out.println("enter student email");
					String stuEmail = scanner.next();
					stu.perEmail(stuEmail);
	
					System.out.println("enter student branch");
					String stuBranch = scanner.next();
					stu.etudBranche(stuBranch);
					
					listOfStudent.add("--------------------- student list -------------------" + "\n" +
					"student ID: " + stu.getPerID() + "\n" + "student Age: " + stu.getPerAge() + "\n" +
					"student firstName: " + stu.getPerLastName() + "\n" + "student lastName" + stu.getPerLastName() + "\n" +
					"student email: " + stu.getPerEmail() + "\n" + "student branch: " + stu.getEtudBranche() + "\n");
				break;
				
				case 6:
					for(Object object : listOfStudent) {
						System.out.println(object);
					}
				break;
				
				case 7:
					System.out.println("enter the student number to modify");
					int stuModifyId = scanner.nextInt();
					
					Etudiant stu1 = new Etudiant();
					
					System.out.println("enter student ID");
					int stuID1 = scanner.nextInt();
					stu1.perID(stuID1);
					
					System.out.println("enter student Age");
					int stuAge1 = scanner.nextInt();
					stu1.perAge(stuAge1);
					
					System.out.println("enter student first name");
					String stuFirstName1 = scanner.next();
					stu1.perFirstName(stuFirstName1);
					
					System.out.println("enter student last name");
					String stuLastName1 = scanner.next();
					stu1.perLastName(stuLastName1);
	
					System.out.println("enter student email");
					String stuEmail1 = scanner.next();
					stu1.perEmail(stuEmail1);
	
					System.out.println("enter student branch");
					String stuBranch1 = scanner.next();
					stu1.etudBranche(stuBranch1);
					
					listOfStudent.set( stuModifyId ,
					"--------------------- student list -------------------" + "\n" +
					"student ID: " + stu1.getPerID() + "\n" + "student Age: " + stu1.getPerAge() + "\n" +
					"student firstName: " + stu1.getPerLastName() + "\n" + "student lastName" + stu1.getPerLastName() + "\n" +
					"student email: " + stu1.getPerEmail() + "\n" + "student branch: " + stu1.getEtudBranche() + "\n");
				break;
				
				case 8:
					System.out.println("enter the student number to delete");
					int studentdeleteId = scanner.nextInt();
					
					listOfStudent.remove(studentdeleteId);
				break;
				
				case 9:
					Livre book = new Livre();
	
					//emp.perID(id);
					System.out.println("enter book ID");
					int bookID = scanner.nextInt();
					book.livID(bookID);
					
					System.out.println("enter book name");
					String bookName = scanner.next();
					book.livBookName(bookName);
					
					System.out.println("enter book category");
					String bookCategory = scanner.next();
					book.livBookCategory(bookCategory);
					
					listOfBook.add("--------------------- books list -------------------" + "\n" +
					"book ID: " + book.getID() + "\n" + "book name : " + book.getBookName() + "\n" +
					"book category: " + book.getBookCategory() + "\n");
				break;
				
				case 10:
					for(Object object: listOfBook) {
						System.out.println(object);
					}
				break;
				
				case 11:
					System.out.println("enter the book id to modify");
					int bookNumber = scanner.nextInt();
					
					Livre book1 = new Livre();
	
					//emp.perID(id);
					System.out.println("enter book ID");
					int bookID1 = scanner.nextInt();
					book1.livID(bookID1);
					
					System.out.println("enter book name");
					String bookName1 = scanner.next();
					book1.livBookName(bookName1);
					
					System.out.println("enter book category");
					String bookCategory1 = scanner.next();
					book1.livBookCategory(bookCategory1);
					
					listOfBook.set(bookNumber,
					"--------------------- books list -------------------" + "\n" +
					"book ID: " + book1.getID() + "\n" + "book name : " + book1.getBookName() + "\n" +
					"book category: " + book1.getBookCategory() + "\n");
				break;
				
				case 12:
					System.out.println("enter the book number to detete it");
					int bookDeletetID = scanner.nextInt();
					listOfBook.remove(bookDeletetID);
				break;
				
				default:
					System.out.println("this select is not valable");
			}
			
		}while(input != 13);
	}
}


