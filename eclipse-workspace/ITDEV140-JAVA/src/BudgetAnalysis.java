/*
 * Name: Danielle Leslie
 * Assignment: ITDEV140 Chapter 4.16 Programming Challenge - Budget Analysis
 * Date: 09.16.21
 */

/*
 * Write a program that asks the user to enter the amount that he or she has budgeted for a month. A loop
 * should then prompt the user to enter each or his or her own expenses for the mount, and keep a running total.
 * Whejn the loop finishes, the program should display the amount that the user is over or under budget.
 */
import java.util.*;
public class BudgetAnalysis 
{

	public static void main(String[] args) 
	{
		int budget, expenses, totalExpenses = 0;
		char characterInput;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a budget for this month: $");
		budget = keyboard.nextInt();
		
		do {
			System.out.print("Enter the expense $");
			expenses = keyboard.nextInt();
			totalExpenses += expenses;
			System.out.print("Do you wish to enter another expense? Please enter yes or no.");
			characterInput = keyboard.next().charAt(0);
			}
		while (characterInput == 'y');
		{
			if (totalExpenses <= budget)
			{
				System.out.println("Total expense is: $" + totalExpenses);
				System.out.println("Your expense is underbudget.");
			}
			
			else
			{
				System.out.println("Total expense is: $" + totalExpenses);
				System.out.println("Your expense is overbudget.");
			}
			
			keyboard.close();
			System.exit(0);
			
		}
	}			
}


