import java.util.Scanner;

/*
 * Name: Danielle Leslie
 * Class: ITDEV 140
 * Assignment 4: Ch 6, Ex 6 Average TestScores
 * 
 * Design a TestScores Class that has fields to hold three test scores. The class should have a constructor, accessor, and mutator methods 
 * for each test score fields, and a method that returns the average of the test scores. Demonstrate the class by writing a separate program 
 * that creates an instance of the class. The programs hould ask for the user to enter three test scores, of which are store in the TestScores object. 
 * Then the program should display the average of the test scores.
 */

public class testScores {
public static void main(String[] args) {
		
		//Declared variables
		int 	grade1,
				grade2,
				grade3,
				gradetotal,
				gradeaverage;
	
		Scanner keyboard = new Scanner(System.in ); // Scanner object
		
		//Enter Test Scores
		System.out.println("Please enter first test grade: ");
		grade1 = keyboard.nextInt();
		
		System.out.println("Please enter second test grade: ");
		grade2 = keyboard.nextInt();
		
		System.out.println("Please enter third test grade: ");
		grade3 = keyboard.nextInt();
		
		//Calculate average
		gradetotal = grade1 + grade2 + grade3;
		gradeaverage = gradetotal / 3;
		System.out.println("Your grade is " + gradeaverage + "%");
		
		// Letter grade
		if (gradeaverage >= 90) 
			System.out.println("Your letter grade is an A!");
		else 
		if (gradeaverage >= 80) 
			System.out.println("Your letter grade is an B!");
		else
		if (gradeaverage >= 70) 
			System.out.println("Your letter grade is an C!");
		else
		if (gradeaverage >= 60) 
			System.out.println("Your letter grade is an D!");
		else
		if (gradeaverage < 60) 
			System.out.println("Your letter grade is an F!");
		
	}


}
