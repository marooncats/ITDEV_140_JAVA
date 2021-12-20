/*
 * Name: Danielle Leslie
 * Class: ITD 140
 * Assignment: 2.5 Sales Prediction
 */

/* Assignment Instructions:
 * The East Coast sales division of a company generates 62% of total sales. Based on their percentage, 
 * write a program that will predict how much the East Coast division will generate if the company has 
 * 4.6 million in sales this year. 
 * Hint: use the value 0.62 
 */
public class SalesPrediction {
	
		public static void main(String[] args) {
		
		//Formula
			/* 
			 * Total Sales (TS) = .62 (62%) * 4600000
			 */
			
			double TS = .62 * 4600000;
			System.out.println("The estimated total amount in sales is $" + TS + ".");
			}
		}
