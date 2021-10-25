/*
 * Name: Danielle Leslie
 * Assignment: ITDEV140 Chapter 3.18 Programming Challenge - Restaurant Selector
 * Date: 09.16.21
 */

/*
 * You have a group of friends coming to visit for your high school reunion, and you want to 
 * take them out to eat at a local restaurant. You aren't sure if any of them have any dietary 
 * restrictions, but your restaurant choices are as follows:
 * 
 * Joe's Gourmet Burgers - Vegetarian: No, Vegan: No, Gluten-Free: No
 * Main Street Pizza Company - Vegetarian: Yes, Vegan: No, GF: Yes
 * Corner Cafe - Vegetarian: Y, Vegan Y, GF: Y
 * Mama's Fine Italian - Vegetarian: Y, Vegan: N, GF: N
 * The Chef's Kitchen - Vegetarian: Y, Vegan: Y, GF: Y
 * 
 * Write a program that asks whether any members of the party are vegetarian, vegan, or GF, and 
 * then display only the restaurants that you may take the group to. Here is an example of the program's output:
 * 
 * Is anyone at in your party vegetarian? yes [enter]
 * Is anyone at in your party vegan? no [enter]
 * Is anyone at in your party GF? yes [enter]
 * The restaurant choices are: 
 * Main Street Pizza Company
 * Corner Cafe
 * The Chef's Kitchen
 * 
 * Here's another example:
 * Is anyone at in your party vegetarian? yes [enter]
 * Is anyone at in your party vegan? yes [enter]
 * Is anyone at in your party GF? yes [enter]
 * The restaurant choices are: 
 * Corner Cafe
 * The Chef's Kitchen
 * 
 */
import java.util.Scanner;

public class RestaurantSelector {


	public static void main(String[] args) {
  
		String restaurantOption[]={"","",""};
  
		Scanner userSelection = new Scanner(System.in);
		System.out.println("Is anyone at your party vegetarian?");
		restaurantOption[0] = userSelection.nextLine();

  
		System.out.println("Is anyone at your party a vegan?");
		restaurantOption[1] = userSelection.nextLine();
  
  
		System.out.println("Is anyone at your party gluten free?");
		restaurantOption[2] = userSelection.nextLine();
  

  
		System.out.println("Here are your restaurant choices:");
  
		if(restaurantOption[0].equalsIgnoreCase("yes") && restaurantOption[1].equalsIgnoreCase("yes") && restaurantOption[2].equalsIgnoreCase("yes"))
		{
			System.out.println("Corner's Cafe");
			System.out.println("Chef's Kitchen");
		}
		
		else if(restaurantOption[0].equalsIgnoreCase("yes") && restaurantOption[1].equalsIgnoreCase("yes") && restaurantOption[2].equalsIgnoreCase("no"))
		{
			System.out.println("Corner's Cafe");
			System.out.println("Chef's Kitchen");
		}
		
		else if(restaurantOption[0].equalsIgnoreCase("yes") && restaurantOption[1].equalsIgnoreCase("no") && restaurantOption[2].equalsIgnoreCase("yes"))
		{
			System.out.println("Main Street Pizza Company");
			System.out.println("Corner's Cafe");
			System.out.println("Chef's Kitchen");
		}
		
		else if(restaurantOption[0].equalsIgnoreCase("no") && restaurantOption[1].equalsIgnoreCase("yes") && restaurantOption[2].equalsIgnoreCase("yes"))
		{  
			System.out.println("Corner's Cafe");
			System.out.println("Chef's Kitchen");
		}
		
		else if(restaurantOption[0].equalsIgnoreCase("yes") && restaurantOption[1].equalsIgnoreCase("no") && restaurantOption[2].equalsIgnoreCase("no"))
		{
			System.out.println("Main Street Pizza Company");
			System.out.println("Corner's Cafe");
			System.out.println("Mama's Fine Italian");
			System.out.println("Chef's Kitchen");
		}
		
		else if(restaurantOption[0].equalsIgnoreCase("no") && restaurantOption[1].equalsIgnoreCase("no") && restaurantOption[2].equalsIgnoreCase("yes"))
		{
			System.out.println("Main Street Pizza Company");
			System.out.println("Corner's Cafe");
			System.out.println("Chef's Kitchen");
		}
		
		else if(restaurantOption[0].equalsIgnoreCase("no") && restaurantOption[1].equalsIgnoreCase("yes") && restaurantOption[2].equalsIgnoreCase("no"))
		{
			System.out.println("Corner's Cafe");
			System.out.println("Chef's Kitchen");
		}
		
		else if(restaurantOption[0].equalsIgnoreCase("no") && restaurantOption[1].equalsIgnoreCase("no") && restaurantOption[2].equalsIgnoreCase("no"))
		{
			System.out.println("Joe's Gourmet Burgers");
			System.out.println("Main Street Pizza Company");
			System.out.println("Corner's Cafe");
			System.out.println("Mama's Fine Italian");
			System.out.println("Chef's Kitchen");
		}
  
	}
  
}
