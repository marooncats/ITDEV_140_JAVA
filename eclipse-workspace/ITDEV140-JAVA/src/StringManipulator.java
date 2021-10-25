/*
 * Name: Danielle Leslie
 * Class: ITD 140
 * Assignment: 2.12 String Manipulator
 */

/* Assignment Instructions:
 * Write a program that asks the user to enter the name of his or her favorite city. Use a String variable to store the input. The program should display the following:
 * The number of characters in the city name
 * The name of the city in all upper-case letters
 * The name of the city in all lower-case letters
 * The first character in the name of the city.
 */

import java.util.Scanner;
public class StringManipulator {

	public static void main(String[] args) {
		// Variables
		String cityName;		
		
		//Scanner class
	    Scanner input = new Scanner(System.in);

	    // User Input
	    System.out.println("Please enter the name of your favority city: ");
	    cityName = input.next(); 
	    
	    System.out.println("There are " + cityName.length() + " " + "characters in the name of your favorite city.");	    
	    System.out.println("This is what your favorite city in all uppercase would look like: " + cityName.toUpperCase());	   
	    System.out.println("This is what your favorite city in all lowercase would look like: " + cityName.toLowerCase());	 
	    System.out.println("The first character of your favorite city is " + cityName.charAt(0) + ".");	   
	}

}
