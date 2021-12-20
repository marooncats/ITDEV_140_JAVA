/*
 * Name: Danielle Leslie
 * Assignment:  Chapter 5, Challenge 10: Stock Profit
 * Class: ITDEV140
 */

import java.util.Scanner;
public class StockProfit {
	
	 public static double profitCalculator(double numberOfShares, double purchasePrice, double purchaseCommission, double salePrice, double saleCommission) { //declared variables
		 double profit;
		 profit = ((numberOfShares * salePrice) - saleCommission) - ((numberOfShares * purchasePrice) + purchaseCommission);
		 return profit;
	 }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		// Declare scanner object to input user data
		double numberOfShares; // variable storing inputted data
		double purchasePrice; 
		double purchaseCommission; 
		double salePrice;
		double saleCommission;
		double profit;
		
		System.out.println("Please enter number of shares: "); // Ask user for data
		numberOfShares = scanner.nextDouble();
		
		System.out.println("Please enter purchase price: "); 
		purchasePrice = scanner.nextDouble();
		
		System.out.println("Please enter the purchase commission cost: "); 
		purchaseCommission = scanner.nextDouble();
		
		System.out.println("Please enter sale price: "); 
		salePrice = scanner.nextDouble();
		
		System.out.println("Please enter sale commission: "); 
		saleCommission = scanner.nextDouble();
		
		profit = profitCalculator( numberOfShares, purchasePrice, purchaseCommission, salePrice, saleCommission );
		
		if (profit < 0) {
			System.out.printf("You made a loss of $%,.2f" , profit ); //%f is placeholder of 2 decimal places
			} 
		else {
				System.out.printf("You made a profit of $%,.2f" , profit ); //%f is placeholder of 2 decimal places
			}
		}
	 }


















