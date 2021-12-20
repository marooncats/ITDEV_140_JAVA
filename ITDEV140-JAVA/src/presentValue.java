/*
 * Name: Danielle Leslie
 * Class: ITDEV 140
 * Assignment 4: Chapter 5, Challenge 16 Present Value
 * 
 * Suppose you want to deposit a certain amount of money into a savings account, and then leae it alone to draw interest for the next 10 years. 
 * At the end of the 110 years, you would like to have $10,000 in the account. How much do you need to deposit today to make that happen? 
 * You can use the following formula, which is known as the present value formula to find out:
 * P = F / (1+r)^n
 * 
 * P is present value
 * F is future value (10,000)
 * r is annual interest rate
 * n is number of years in the account
 * 
 * Write a method named presentValue that performs this calculation. The method should accept the future value, annual interest rate, number of years 
 * as arguments. It should return the present value, which is the amount you need to deposit today. Demonstrate this method in a program that lets the user 
 * experiment with different values for the formula's terms. 
 */

import java.util.Scanner;


public class presentValue {
	
	public static void main(String[] args) {
	
	//Scanner Class
	Scanner input = new Scanner(System.in);
	
	//User Input
	System.out.println("Please enter your desired future value");
	double futureValue = input.nextDouble();
	
	System.out.println("Please enter your annual interest rate: ");
    double interestRate = input.nextDouble();

    System.out.println("Please enter number of years you'd like to draw interest in your account: ");
    double numberofYears = input.nextDouble();
    
    //System.out.println(presentValue(futureValue, interestRate, numberofYears));
	  double presentValue = futureValue / Math.pow((1 + (interestRate / 100)), numberofYears); 
	  System.out.println("Your total balance after " + numberofYears + " years and an interest value of " + interestRate + "% is: $" + 
	  futureValue + ", starting with $" + presentValue + ".");
	}
	
    /*public static double presentValue(double futureValue, double interestRate, double numberofYears){
    	// System.out.println("Your total balance after" + numberofYears + "years and an interest value of " + interestRate + "% is:" + futureValue);
    	return futureValue / Math.pow((1 + interestRate), numberofYears);        
	}*/
}