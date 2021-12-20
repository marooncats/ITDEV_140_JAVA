/*
 * Name: Danielle Leslie
 * Assignment:  Chapter 5, Challenge 17: Rock, Paper, Scissors
 * Class: ITDEV140
 * 
 * Write a program that lets the user play the game of Rock, Paper, Scissors against the computer. The program should be as follows:
 * 1. When the proghram begins, a random number in the range of 1-3 is generated. 
 * 0 = rock
 * 1 = paper
 * 2 = scissors
 * 3 = Spock
 * 4 = lizard
 * 
 * The user enters his or her choice, rock, paper or scissors, at the keyboard. 
 * The computers choice is displayed. A winner is selected based on these rules:
 * If one player chooses rock and other chooses scissors, rock wins
 * If one player chooses rock and the other chooses lizard, rock wins.
 * If one player chooses scissors and other chooses paper, scissors wins.
 * If one player chooses scissors and the other chooses lizard, scissors wins.
 * If one player chooses paper and the other chooses rock, paper wins. 
 * If one player chooses paper and the other chooses Spock, paper wins.
 * If one player chooses lizard and the other chooses Spock, lizard wins.
 * If one player chooses lizard and the other chooses paper, lizard wins.
 * If one player chooses Spock, and the other chooses scissors, Spock wins.
 * If one player chooses Spock, and the other chooses rock, Spock wins.
 * If both players select the same choice, the game replays to determine the winner.
 * 
 * Be sure to divide the program into methods that perform each major task.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JPanel;

public class RPS {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
	
				
		System.out.println("Welcome to Rock, Paper, Scissors the Game... "
		
				+ "Spock & Lizard Limited Edition"
				+ "\n"
				+ "\nPlease enter your choice: Rock, Paper, Scissors, Spock, or Lizard:");
		String userMove = input.nextLine();
		
		//Verify user string
		if (!userMove.equals("Rock") && !userMove.equals("Paper") && !userMove.equals("Scissors") && !userMove.equals("Spock") && !userMove.equals("Lizard")) {
			System.out.println("Your selection isn't valid, please try again.");
		} else {
			
			//Computer's Move
			int rand = (int)(Math.random() * 5);
			String computerMove = "";
			if (rand == 0) {
				computerMove = "Rock";
			} else if (rand == 1) {
				computerMove = "Paper";
			} else if (rand == 2) {
				computerMove = "Scissors";
			} else if (rand == 3) {
				computerMove = "Spock";
			} else {
				computerMove = "Lizard";
			}
			
			System.out.println("Computer's move: " + computerMove);
			
			// Calulate win, loss, or tied
			if (userMove.equals(computerMove)) {
				System.out.println("You tied!");
				} else if 
				// Rock	
					((userMove.equals("Rock") && computerMove.equals("Scissors"))
					|| (userMove.equals("Rock") && computerMove.equals("Lizard"))
					//Paper 
					|| (userMove.equals("Paper") && computerMove.equals("Rock"))
					|| (userMove.equals("Paper") && computerMove.equals("Spock"))
					// Scissors 
					|| (userMove.equals("Scissors") && computerMove.equals("Paper"))
					|| (userMove.equals("Scissors") && computerMove.equals("Lizard"))
					// Lizard
					|| (userMove.equals("Lizard") && computerMove.equals("Paper"))
					|| (userMove.equals("Lizard") && computerMove.equals("Spock"))
					// Spock
					|| (userMove.equals("Spock") && computerMove.equals("Scissors"))
					|| (userMove.equals("Spock") && computerMove.equals("Rock"))) {
						System.out.println("You won!");
					} else {
						System.out.println("You lost!");
					}
				}

	}
}
