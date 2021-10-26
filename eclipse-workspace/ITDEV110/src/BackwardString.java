/*
 * Name: Danielle
 * Class: ITDEV110
 * Assignment: Chapter 9, Challenge 1 - Backwards String
 */

import java.util.Scanner;
public class BackwardString {

	public static void main(String[] args) {
		String userInput; // string input
		Scanner scanner = new Scanner(System.in); // User input
		
		System.out.println("Enter word here: ");
			userInput = scanner.next(); // converting string input to scanner
			backward(userInput); // calling backward method to reverse input
			scanner.close(); // closing scanner
	}
	
	public static void backward(String inputSource) { //method to reverse input
		int i, len = inputSource.length();
		StringBuilder dest = new StringBuilder(len); // StringBuilder is a class that allows you to manipulate strings without changing the 
		// string instance, and just changes the string builder instance
		
		for (i = (len - 1); i >=0; i--) { // get characters of string, take one away from index as strings always start at zero
			dest.append(inputSource.charAt(i));
			}
		System.out.println("Reversed String : " + dest);
	}
}