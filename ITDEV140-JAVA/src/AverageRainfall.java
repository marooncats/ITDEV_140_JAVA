/* 
 * Name: Danielle Leslie
 * Assignment: ITDEV140 Average Rainfall, Chapter 4 Programming Challenge
 * Date: 09.16.21
 */
import javax.swing.JOptionPane;
public class AverageRainfall {

	public static void main(String[] args) {
		
		//Variables
		String userInputString; //JOptionPane input
		int userNumberOfYears = 0; //number of years
		final int MONTHS_IN_YEAR = 12; // fixed, cannot change how many months in a year
		int totalNumberOfMonths = 0; //starts at 0 because no data is collected yet
		double inchesOfRainfall = -1; //data keeps adding and getting stored in totalInchesofRainfall, need to set as -1 to start to get while prompt to work
		double totalInchesOfRainfall = 0;
		double averageRainfall;
		
		
		while ( userNumberOfYears < 1) { //keep asking user to input a number for the year until value is greater than or equal to 1
			userInputString = JOptionPane.showInputDialog("Please enter the number of years you'd like to calculate: "); //user input for years
			userNumberOfYears = Integer.parseInt( userInputString ); // converting number to integer
		} 
		
		//outer loop, each time loop runs is for one year then loops
		for( int year = 1; year <= userNumberOfYears; year++ ) { //initialize number of years, starting at year 1; before loop goes again, add one year for next calculation
			
			//inner loop, each time loop runs is one month then loops
			for( int month = 1; month <= MONTHS_IN_YEAR; month++ ) { //initialize months, starting at 1 month; before loop goes again, add one onto month
				
				while ( inchesOfRainfall < 0) { //will not accept number less than 0, will keep prompting user to input variable until value is greater than zero
					userInputString = JOptionPane.showInputDialog("Please enter the inches of rainfall for the month: " + month 
							+ " , year " + year ); //user input for inches of rainfall
					
					inchesOfRainfall = Double.parseDouble( userInputString ); // converted to double to see decimals, storing string in inchesOfRainfall
				}
						 
				totalNumberOfMonths = totalNumberOfMonths + 1; //starts at zero, one gets added on for the next month
				totalInchesOfRainfall = totalInchesOfRainfall + inchesOfRainfall;
				inchesOfRainfall = -1; // this will cause the while loop to be prompted for entering each month value
			}
		}
			averageRainfall = totalInchesOfRainfall / totalNumberOfMonths;
			
			JOptionPane.showMessageDialog( null, "Number of months: " + totalNumberOfMonths + "\nTotal inches of Rainfall: " 
			+ totalInchesOfRainfall + "\nAverage Rainfall per month: " + averageRainfall); //display message
			
			
			System.exit( 0 ); // terminate JOptionPane, program will return 0 if it has run successfully
			
	}	
}