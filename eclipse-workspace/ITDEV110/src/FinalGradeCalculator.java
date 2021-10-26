/*
 * Name: Danielle
 * Class: ITDEV110
 * Assignment: Chapter 7, Challenge 7 - Grade Book
 */

import java.util.Scanner;

public class FinalGradeCalculator {
	public static void main(String [] args) {
		Scanner userInput = new Scanner (System.in);
		String studentName;
		double studentScore;
		double [][] studentTestScores;
		double studentAverage;
		char studentLetterGrade;
		
		final int NUMBER_OF_STUDENTS = 2;
		final int NUMBER_OF_TESTS_SCORES_PER_STUDENT = 2;
		GradeBook currentClass = new GradeBook( NUMBER_OF_STUDENTS, NUMBER_OF_TESTS_SCORES_PER_STUDENT);
		studentTestScores = currentClass.getStudentTestScoreArray();
		
		for( int currentStudentIndex = 0; currentStudentIndex < NUMBER_OF_STUDENTS; currentStudentIndex++ ) {
			System.out.println("Please enter the name of the student " + (currentStudentIndex + 1 )); // will add one to each student until 5 is reached
			studentName = userInput.nextLine();
			currentClass.setStudentName(studentName);
			
			for( int currentStudentScoreIndex = 0; currentStudentScoreIndex  < NUMBER_OF_TESTS_SCORES_PER_STUDENT; currentStudentScoreIndex++) {
				System.out.println("Please enter score " + (currentStudentScoreIndex + 1) + " of " + studentName);
				studentScore = userInput.nextDouble();
				
				while(studentScore < 0 || studentScore > 100 ) { // || means or
					System.out.println("Please enter a VALID score for test " + (currentStudentScoreIndex + 1) + " for the Student, " + studentName);
					studentScore = userInput.nextDouble();
				}
				
				userInput.nextLine();
				currentClass.setStudentScore(currentStudentIndex, currentStudentScoreIndex, studentScore);
			}
		}
		
		for( int currentStudentIndex = 0; currentStudentIndex < NUMBER_OF_STUDENTS; currentStudentIndex++ ) {
			System.out.print( currentClass.getStudentName(currentStudentIndex) + " has scores of " );
			studentAverage = currentClass.calculateAverageTestScore(studentTestScores [currentStudentIndex]);
			studentLetterGrade = currentClass.getStudentLetterGrade(studentAverage);
			
			for( int currentStudentScoreIndex = 0; currentStudentScoreIndex  < NUMBER_OF_TESTS_SCORES_PER_STUDENT; currentStudentScoreIndex++) {
				if (currentStudentScoreIndex != NUMBER_OF_TESTS_SCORES_PER_STUDENT - 1) { //gramatical correction for sentence structure (end sentence with period or space, no comma
					System.out.print( studentTestScores[currentStudentIndex][currentStudentScoreIndex] + ", " );
				} 
				
				else {
				System.out.print( studentTestScores[currentStudentIndex][currentStudentScoreIndex] + " ");
				}
			}
			System.out.println("with an average of " + String.format("%.2f" , studentAverage) + "%" + ", and a letter grade of " + studentLetterGrade + ".");	//formatting it as a float w 2 decimal places
			//line corrector
			System.out.println();
		}
	}
}
