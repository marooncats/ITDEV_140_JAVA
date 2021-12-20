/*
 * Name: Danielle Leslie
 * Class: ITDEV 140
 * Assignment: 2.21 Compound Interest
 */


import java.util.Scanner;

class CompoundInterest {
  public static void main(String[] args) {
	  /* A = P(1 + r/n)*nt
		A = amount of money in account after x amount of years
		P = original amount deposited
		r = annual interest rate
		n = number of times per year that interest is compounded
		t = specified number of years
		*/
	  
	  
    //Scanner class
    Scanner input = new Scanner(System.in);

    // User Input
    System.out.println("Please enter amount of money originally deposited: ");
    double p = input.nextDouble();

    System.out.println("Please enter your annual interest rate: ");
    double r = input.nextDouble();

    System.out.println("Please enter number of times per year that interest is compounded: ");
    int n = input.nextInt();
    
    System.out.println("Please enter total number of years remaining: ");
    double t = input.nextDouble();

    double A = p* (Math.pow((1 + r/100), (t * n))) - p;
    
    
       System.out.println("Your compound interest is $" + A + ".");

    input.close();
  }
}