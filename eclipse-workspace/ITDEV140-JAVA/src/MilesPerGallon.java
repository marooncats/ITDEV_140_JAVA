/*
 * Name: Danielle Leslie
 * Class: ITD 140
 * Assignment: 2.9 MilesPerGallon
 */

/* Assignment Instructions:
 * A car's MPG can be calculated with the following formula:
 * MPG = miles Driven / gallons of gas used
 * 
 * Write a program that asks the user for the number of miles driven, and the gallons of gas used. It should calculate the car's miles and display the result on the screen. 
 */

import java.util.Scanner;
public class MilesPerGallon {

	public static void main(String[] args) {
		/* formula 
		 * MPG = milesDriven / gallonsOfGas 
		 */

		//Scanner class
	    Scanner input = new Scanner(System.in);

	    // User Input
	    System.out.println("Please enter the amount of miles driven in your vehicle: ");
	    int milesDriven = input.nextInt(); 
	    
	    System.out.println("Please enter the amount of gallons of gas used in your vehicle: ");
	    int gallonsOfGas = input.nextInt(); 
	    
	    int totalMPG = milesDriven / gallonsOfGas;
	    
	
	    System.out.println("Your total miles per gallon are: " + totalMPG + " miles per gallon (MPG).");
	}

}
