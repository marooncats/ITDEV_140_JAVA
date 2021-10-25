/*
 * Name: Danielle Leslie
 * Class: ITD 140
 * Assignment: 2.7 Sales Tax
 */

/* Assignment Instructions:
 * Write a program that will ask the user to enter the amount of a purchase. The program should then compute the state and county sales tax. 
 * Assume the state tax is 4% and the county sales tax is 2%. The program should display the amount of the purchase, the state sales tax, 
 * the county sales tax, the total sales tax, and the total of the sale (which is the sum of the amount of purchase plus the total sales tax.)
 * State tax: .04
 * County Sales tax: .02
 */

import java.util.Scanner;
public class SalesTax {
	
		public static void main(String[] args) {
		
		/* Formula
		 * totalSale = (purchaseAmount - totalTax);
		 * totalTax = (stateTax + countyTax);
		 * stateSalesTaxAmount = .04;
		 * countySalesTaxAmount = .02;
		 * stateTax = (purchaseAmount * stateSalesTaxAmount);
		 * countyTax = (purchaseAmount * countySalesTaxAmount);
		 */
			
			 //Scanner class
		    Scanner input = new Scanner(System.in);

		    // User Input
		    System.out.println("Please enter the amount of your purchase: ");
		    double purchaseAmount = input.nextDouble(); 
			
		     double stateSalesTaxAmount = .04;
			 double countySalesTaxAmount = .02;
			 double stateTax = (purchaseAmount * stateSalesTaxAmount); // figuring out state tax by multiplying total by state percent, converting it to a dollar amount
			 double countyTax = (purchaseAmount * countySalesTaxAmount); // figuring out county tax by multiplying total by county percent, converting it to a dollar amount
			 double totalSalesTax = (stateTax + countyTax); // adding together state and county tax
			 double totalSalePurchaseAmount = (purchaseAmount + totalSalesTax); 
			
			 double stateTaxPercent = stateSalesTaxAmount * 100; // converting state tax to list percentage
			 double countyTaxPercent = countySalesTaxAmount * 100; // converting state tax to list percentage
			 double totalSalesTaxPercent = (stateSalesTaxAmount + countySalesTaxAmount) * 100; // converting total sales tax to percentage
					    
		    System.out.println("Your total purchase amount is $" + purchaseAmount);
		    System.out.println("Your total state tax is " + stateTaxPercent + "% equalling to $" + stateTax);
		    System.out.println("Your total county tax is " + countyTaxPercent + "% equalling to $" + countyTax);
		    System.out.println("Your total sales tax is " + totalSalesTaxPercent + "% equalling to $" + totalSalesTax);
		    System.out.println("Your total sales amount is $" + totalSalePurchaseAmount);
		    
		    
			
				}			
			}
