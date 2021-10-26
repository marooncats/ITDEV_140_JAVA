import java.util.Scanner;
public class AverageScore {

	public static void main(String[] args) {
		double 	score1,
				score2,
				score3,
				average; 
		
		//scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("This program averages 3 test scores.");
		
		//First score
		System.out.println("Enter score #1: ");
		score1 = keyboard.nextDouble();
		
		//Second score
		System.out.println("Enter score #2: ");
		score2 = keyboard.nextDouble();
		
		//third score
		System.out.println("Enter score #3: ");
		score3 = keyboard.nextDouble();
		
		//calculate and display average
		average = (score1 + score2 + score3) / 3.0;
		System.out.println("The average is " + average);
		
			

	}

}
