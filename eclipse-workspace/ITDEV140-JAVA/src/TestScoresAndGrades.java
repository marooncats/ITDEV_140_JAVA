/*
 * Name: Danielle Leslie
 * Assignment: ITDEV140 Chapter 3 Programming Challenge - Test Scores & Grades
 * Date: 09.16.21
 */

import java.util.Scanner;
public class TestScoresAndGrades {

	public static void main(String[] args) {
		
		//Declared variables
		double 	grade1,
				grade2,
				grade3,
				gradetotal,
				gradeaverage;
	
		Scanner keyboard = new Scanner(System.in ); // Scanner object
		
		//Enter Test Scores
		System.out.println("Please enter first test grade: ");
		grade1 = keyboard.nextDouble();
		
		System.out.println("Please enter second test grade: ");
		grade2 = keyboard.nextDouble();
		
		System.out.println("Please enter third test grade: ");
		grade3 = keyboard.nextDouble();
		
		//Calculate average
		gradetotal = grade1 + grade2 + grade3;
		gradeaverage = gradetotal / 3.0;
		System.out.println("Your grade is " + gradeaverage);
		
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
