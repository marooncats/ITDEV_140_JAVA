/*
 * Name: Danielle Leslie
 * Assignment:  Chapter 6, Challenge 1: Employee Class
 * Class: ITDEV110
 */

public class EmployeeClassTest{

		public static void main(String [] args) {
			Employee employee1 = new Employee(); //accessing Employee file and entering data into this file
			Employee employee2 = new Employee( "Mark Jones", 39119 );
			Employee employee3 = new Employee( "Joy Rogers", 81774, "Manufacturing", "Engineer");
		
		//entering missing data
		employee1.setName("Susan Meyers");
		employee1.setIdNumber("47899"); //other program knows to convert string to int, so string or int can be used for id #
		employee1.setDepartment("Accounting");
		employee1.setJobTitle("Vice President");
		
		employee2.setDepartment("IT");
		employee2.setJobTitle("Programmer");
			
	System.out.println( "Name\t\tID Number\t\tDepartment\t\tPosition" );
	
	System.out.println( employee1.getName() + "\t" + employee1.getIdNumber() + "\t\t\t" + employee1.getDepartment() + 
			"\t\t" + employee1.getJobTitle() );
	
	System.out.println( employee2.getName() + "\t" + employee2.getIdNumber() + "\t\t\t" + employee2.getDepartment() + 
			"\t\t\t" + employee2.getJobTitle() );
	
	System.out.println( employee3.getName() + "\t" + employee3.getIdNumber() + "\t\t\t" + employee3.getDepartment() + 
			"\t\t" + employee3.getJobTitle() );
	}
}