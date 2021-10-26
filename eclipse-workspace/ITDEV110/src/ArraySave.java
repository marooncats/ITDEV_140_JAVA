/*
 * Name: Danielle Leslie
 * Assignment: Week 5, Arrays, Slide 33
 * Date: 7.11.21
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
public class ArraySave {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\DANIELLE\\Documents\\MATC\\Summer_2021\\ITDEV117\\";
		File oFile = new File (path + "Values.txt");
		int [] array = {0, 5, 6, 8, 10, 12, 16, 30, 25, 56};
	
		PrintWriter p0 = new PrintWriter(System.out);
		p0.write("PrintWriter Example. \n");
		
		PrintWriter p1 = new PrintWriter (oFile);
		for (int i=0; i<array.length; i++) {
			p0.write(i + ": " + array[i] + "\n");
			p1.write(i + ": " + array[i] + "\n");
			}
		p0.flush();
		p1.flush();
		p0.close();
		p1.close();
		
	}
}
