/*
 * Name: Danielle
 * Class: ITDEV110
 * Assignment: Chapter 7, Challenge 7 - Grade Book
 */

import java.util.ArrayList;

public class GradeBook {

	// Private because only certain people should have access to information
	private ArrayList<String> studentNames = new ArrayList<String>();
	private char[] studentLetterGrades = { 'A', 'B', 'C', 'D', 'F' };
	private double[][] studentTestScores; // 2D ray to hold all students and their test scores
	
	public String getStudentName(int studentIndex) {
		return studentNames.get(studentIndex);
	}

	// Method to calculate average
	public double calculateAverageTestScore(double[] individualStudentTestScore) {
		double studentTestScoreTotal = 0;
		double studentTestScoreAverage;

		// length holds length of array to check for int condition; adds 1 to score each
		// loop to test if the grade is less than the length of the array
		for (int currentStudentTestScore = 0; currentStudentTestScore < individualStudentTestScore.length; currentStudentTestScore++) {
			studentTestScoreTotal = studentTestScoreTotal + individualStudentTestScore[currentStudentTestScore];
		}

		studentTestScoreAverage = studentTestScoreTotal / individualStudentTestScore.length;
		return studentTestScoreAverage;
	}

	// Method to return letter grade
	public char getStudentLetterGrade( double studentTestScoreAverage ) {
		// variable
		char studentLetterGrade ='Z';
		
		if ( studentTestScoreAverage < 60  ) {
			studentLetterGrade = 'F'; 		} 
		else if ( studentTestScoreAverage < 70) {
			studentLetterGrade = 'D'; 		}
		else if ( studentTestScoreAverage < 80) {
			studentLetterGrade = 'C';		}
		else if ( studentTestScoreAverage < 90) {
			studentLetterGrade = 'B';		}
		else if ( studentTestScoreAverage <= 100) {
			studentLetterGrade = 'A'; 		}
		
		return studentLetterGrade;
	}
	
	//setter, no return so void
	public void setStudentName( String studentName ) {
		studentNames.add(studentName); // adding to array list
	}
	
	public void setStudentScore( int studentIndex, int scoreIndex, double studentScore ) {
		studentTestScores[studentIndex][scoreIndex] = studentScore;
	}
	
	public double [][] getStudentTestScoreArray(){
		return studentTestScores;
	}
	
	public GradeBook( int numberOfStudents, int numberOfTestScoresPerStudent ){
		studentTestScores = new double [ numberOfStudents ] [ numberOfTestScoresPerStudent ];
	}

}
