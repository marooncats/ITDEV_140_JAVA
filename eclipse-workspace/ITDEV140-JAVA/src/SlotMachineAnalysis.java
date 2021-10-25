/*
 * Name: Danielle Leslie
 * Assignment: ITDEV140 Chapter 4.22 Programming Challenge - Slot Machine Simulation
 * Date: 09.16.21
 */

/*
 * A slot machine is a gambling device that the user inserts money into and then pulls a lever (or presses a button). 
 * The slot machine then displays a set of random images. If two or more of the images match, the user wins an amount of 
 * money that the slot machine dispenses back to the user. Create a program that simulates a slot machine. When the program 
 * runs, it should do the following:
 * 
 * Asks the user to enter the amount of money he or she wants to enter into the slot machine. 
 * Instead of displaying images, the program will randomly select a word from the following list:
 * 
 * Cherries, Oranges, Plums, Bells, Melons, Bars
 * 
 * To select a word, the program can generate a random number in the range of 0 through 5. If the number is 0, the selected word is 
 * Cherries; if the number is 1, the selected word is Oranges; and so forth. The program should randomly select a word from this 
 * list three times and display all three of the words.
 * 
 * If none of the randomly selected words match, the program will inform the user that he or she has won $0.
 * If two of the words match, the program will inform the user that he or she has won two times the amount entered.
 * If three of the words match, the program will inform the user that he or she has won three times the amount entered. 
 * 
 * The program will ask whether the user wants to play again. If so, these steps are repeated. If not, the program displays the 
 * total amount of money entered into the slot machine and the total amount won.
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class SlotMachineAnalysis {

	public static void main(String[] args) {
		
		String userStringInput;
		double startingBalance = 100.00;
		double userAmountEntered;
		Random random = new Random();
		int wordIndex;
		String word = "";
		String outputString = "";
		String word1 = "";
		String word2 = "";
		String word3 = "";
		char playAgain = 'y';
		double totalUserAmountEntered = 0;
		double totalAmountWonSoFar = 0;
		
		
		
		while (playAgain == 'y') {
			outputString = "";
			userStringInput = JOptionPane.showInputDialog("Welcome to Slot Machine Casino! "
					+ "\nYou will start with a balance of $100, use it wisely! "
					+ "\nHow much would you like to bet?");			
			userAmountEntered = Double.parseDouble(userStringInput);
			totalUserAmountEntered = (startingBalance - userAmountEntered);
			
			for (int wordCount = 1; wordCount <= 3; wordCount++) 
			{
				wordIndex = random.nextInt(6);
				
				if (wordIndex == 0) { word = "Cherries";	}
				
				else if (wordIndex == 1) { word = "Oranges";	}

				else if (wordIndex == 2) { word = "Plums";	}

				else if (wordIndex == 3) { word = "Bells";	}
				
				else if (wordIndex == 4) { word = "Melons";	}
				
				else if (wordIndex == 5) { word = "Bars";	}	
			
			
				if (wordCount == 1) { word1 = word; }
				else if (wordCount == 2) { word2 = word; }
				else if (wordCount == 3) { word3 = word; }
				}
				
			
				outputString = outputString + "[" + word1 + " ]\t\t\t\t[ " + word2 + " ]\t\t\t\t[ " + word3 + " ]";
				
				
				if ((word1 != word2) && (word1 != word3) && (word2 != word3)) 
				{
					outputString = outputString + "\nWinnings This Round: $\t\t" +				
					String.format("%.2f", totalAmountWonSoFar += totalAmountWonSoFar + 0);
				}
				
				else if ((word1 == word2) && (word1 != word3) || 
						(word1 == word3) && (word1 != word2)  ||
						(word2 == word3) && (word2 != word1))
				{	
					outputString = outputString + "\n\nWinnings This Round: $" + String.format("%.2f" , (userAmountEntered * 2));
					totalAmountWonSoFar += totalAmountWonSoFar + (userAmountEntered * 2);
				}
				
				else
				{
						outputString = outputString + "\n\nWinnings This Round $" + String.format("%.2f" ,(userAmountEntered * 3));
						totalAmountWonSoFar += totalAmountWonSoFar + (userAmountEntered * 3);
				}
				
				outputString = outputString + "\nStarting Bet Amount: $" + String.format("%.2f" , userAmountEntered) + 
						"\nStarting Balance: $" + String.format("%.2f" , totalUserAmountEntered) + "\nEarnings: $" + 
						String.format("%.2f" , totalAmountWonSoFar);
				
				playAgain = JOptionPane.showInputDialog(outputString + "\n\n\nDo you want to play again?\n"
						+ "Press Y for yes, any other key for no.").charAt(0);
			}
		
			if (totalUserAmountEntered > totalAmountWonSoFar) 
			{
				JOptionPane.showMessageDialog(null,  "You started with a balance of $" + String.format("%.2f" , totalUserAmountEntered) + " and won $" + 
			String.format("%.2f" , totalAmountWonSoFar) + ", and are leaving with $" + String.format("%.2f" , (totalUserAmountEntered - 
					totalAmountWonSoFar)) + ". Thanks for playing!");
			}
			
			else if (totalAmountWonSoFar > totalUserAmountEntered) {
				JOptionPane.showMessageDialog(null,  "You started with a balance of $" + String.format("%.2f" , totalUserAmountEntered) + " and won $" + 
						String.format("%.2f" , totalAmountWonSoFar) + ", making a profit of $" + String.format("%.2f" ,(totalAmountWonSoFar - 
								totalUserAmountEntered)) + "!! Thanks for playing!");
			}
			
			else {
				JOptionPane.showMessageDialog(null,  "You started with a balance of $" + String.format("%.2f" , totalUserAmountEntered) + " and won $" + 
						String.format("%.2f" , totalAmountWonSoFar) + ", you didn't make any profit or loss." + " Thanks for playing!");
			}
			
			System.exit(0);
		}		
	}

