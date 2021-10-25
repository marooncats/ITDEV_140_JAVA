/*
 * Name: Danielle Leslie
 * Class: ITD 140
 * Assignment: 2.20 Planting Grapevines
 */

/* Assignment Instructions:
 * A vineyard owner is planting several rows of grapevines and needs to know how many grapevines to plant in each row. 
 * She has determined that after measuring the length of a future row, she can use the following formula to calculate 
 * the number of vines that will fit in the row, along with the trellis end-post assemblies that will need to be 
 * constructed at each end of the row. 
 */

/*
 * Formula & Directions
 * Write a program that makes the calculation for the vineyard owner. The program should ask the user to input the following:
 * The length of the row, in feet
 * The amount of space used by an end-post assembly, in feet
 * The amount of space between the vines, in feet
 * 
 * 			R - 2E
 * 		V = _______
 * 			   S
 * 
 * V = the number of grapevines that will fit in each row
 * R = the length of the row, in feet
 * E = the amount of space used by an end-post assembly
 * S = the space between vines, in feet
 */

import java.util.Scanner;
public class PlantingGrapevines {

	public static void main(String[] args) {
		//Scanner class
	    Scanner input = new Scanner(System.in);

	    // User Input
	    System.out.println("Please enter the length of the row, in feet: ");
	    int lengthOfRow = input.nextInt(); 
	    
	    System.out.println("Please enter the amount of space used by an end-post assembly: ");
	    int endPostAssemblySpace = input.nextInt(); 
	    
	    System.out.println("Please enter the amount of space between the vines, in feet: ");
	    int spaceBetweenVines = input.nextInt(); 
	    
	    
	    //Formula
	    int numberOfVines = (lengthOfRow - 2 * endPostAssemblySpace) / spaceBetweenVines;
	    
	    System.out.println("The number of grapevines that will fit in the row are: " + numberOfVines);
	}

}
