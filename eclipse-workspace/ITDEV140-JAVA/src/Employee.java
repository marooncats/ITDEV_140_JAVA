/*
 * Name: Danielle Leslie
 * Assignment:  Chapter 6, Challenge 1: Employee Class
 * Class: ITDEV110
 */

public class Employee { 
	
	//Variables -- Private as it's containing sensitive data
	private String name; 
	private int idNumber;
	private String department;
	private String jobTitle;
	
	//mutator/setter method
	public void setName( String nameGiven ){ // return nothing but accept argument (provided name)
		name = nameGiven;
	}
	
	public void setIdNumber( int idNumberGiven ){ 
		idNumber = idNumberGiven;
		}
	
	public void setIdNumber( String idNumberGiven ){ 
		idNumber = Integer.parseInt(idNumberGiven); // converting int to string
		}
	
	public void setDepartment( String departmentGiven ){ 
		department = departmentGiven;
		}
	
	public void setJobTitle( String jobTitleGiven ){ 
		jobTitle = jobTitleGiven;
		}
	
	//Getters -- return value, no static because these are instance methods/fields
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	// method for when we create an object from this class
	public Employee( String employeeName, int employeeIDNumber, String employeeDepartment, String employeeJobTitle ) {  //Constructor, no return type as it can't return anything
		name = employeeName;
		idNumber = employeeIDNumber;
		department = employeeDepartment;
		jobTitle = employeeJobTitle;
	}
	
	public Employee( String employeeName, int employeeIDNumber) {  //Constructor
		name = employeeName;
		idNumber = employeeIDNumber;
		department = "";
		jobTitle = "";
	}
	
	public Employee() {  //No argument Constructor
		name = "";
		idNumber = 0;
		department = "";
		jobTitle = "";
	}
	
}