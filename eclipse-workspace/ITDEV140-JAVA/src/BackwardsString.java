/*
 * Name: Danielle
 * Class: ITDEV110
 * Assignment: Chapter 9, Challenge 1 - Backwards String
 * 
 * Write a method that accepts a String object as an argument and displays its contents backward. For instance, if the string argument is â€œgravityâ€� the method should display -â€œytivargâ€�.
 * Demonstrate the method in a program that asks the user to input a string and then passes it
 * to the method.
 * 
 * https://www.youtube.com/watch?v=orUTq3CahRE
 */

import java.util.Scanner;

public class BackwardsString {
public static void main(String[] args) {

	String input; // Scanner object to read string from user input

		Scanner scanner = new Scanner(System.in);

			
			System.out.print("Enter String here : ");

			input=scanner.next(); // calling backward method to reverse passed string

			backward(input);

		scanner.close(); // closing Scanner object

	}

  



private static void backward(String source) { // Method to reverse the input string

	int i, len = source.length();

	StringBuilder dest = new StringBuilder(len);

	for (i = (len - 1); i >= 0; i--){ 

			dest.append(source.charAt(i));

		}

	System.out.println("Reversed String : " + dest);

	}

}