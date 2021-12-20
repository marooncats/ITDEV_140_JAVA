/* 
 * Name: Danielle Leslie
 * Class: ITDEV 140 - JAVA
 * Assignment 6 - Programming Challenges 10.1-10.3, 11.10
 * 
 * 1. Design a class named Employee, The class should keep the following information in fields:
 * 	- Employee name
 *  - Employee # in XXX-L, where each X is a digit within 0-9 and L is a letter within the range A-M
 *  - Hire Date
 *  
 *  Write one or more constructors and the appropriate accessor and mutator for the class. 
 *  Next write a class named ProductionWorker that extends the Employee Class. 
 *  The ProductionWorker class should have fields to hold the following information:
 *  - Shift (an integer)
 *  - Hourly pay rate (double)
 *  
 *  The work day is divided into two shifts, day and night. The shift field will be an integer value representing the shift that the employers work.
 *  Day shift is 1, night shift is 2. 
 *  
 *  Write one or more constructors and the appropriate accessors and mutators for the class. 
 *  Demonstrate the classes by writing a program that uses ProductionWorker object.
 *  
 *  2. ShiftSupervisor Class
 * In a particular factory, a shift supervisor is a salaried employee who supervises a shift. In addition to a salary, 
 * the shift supervisor earns a yearly bonus when his or her shift meets production goals. Design a ShiftSupervisor class 
 * that extends the Employee class you created in Programming Challenge 1. The ShiftSupervisor class should have a field that 
 * holds the annual salary and a field that holds the annual production bonus that a shift supervisor has earned. Write one 
 * or more constructors and the appropriate accessor and mutator methods for the class. Demonstrate the class by writing a 
 * program that uses a ShiftSupervisor object.
 * 
 * 3. TeamLeader Class
 * In a particular factory, a team leader is an hourly paid production worker that leads a small team. In addition to hourly pay, 
 * team leaders earn a fixed monthly bonus. Team leaders are required to attend a minimum number of hours of training per year. 
 * Design a TeamLeader class that extends the ProductionWorker class you designed in Programming Challenge 1. The TeamLeader class 
 * should have fields for the monthly bonus amount, the required number of training hours, and the number of training hours that the 
 * team leader has attended. Write one or more constructors and the appropriate accessor and mutator methods for the class. 
 * Demonstrate the class by writing a program that uses a TeamLeader object.
 * 
 * Chapter 11, Programming Challenge 10
 * This assignment assumes you have completed Programming Challenge 1 of Chapter 10  (Employee and ProductionWorker Classes). 
 * Modify the Employee and ProductionWorker classes so they throw exceptions when the following errors occur:
 * - The Employee class should throw an exception named InvalidEmployeeNumber when it receives an invalid employee number.
 * - The ProductionWorker class should throw an exception named InvalidShift when it receives an invalid shift.
 * - The ProductionWorker class should throw an exception named InvalidPayRate when it receives a negative number for the 
 * 		hourly pay rate.
*/
package assignment6;

public class EmployeeProductionWorker {

}
