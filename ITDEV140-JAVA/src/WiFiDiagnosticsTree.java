/*
 * Name: Danielle Leslie
 * Assignment: ITDEV140 Chapter 3.17 Programming Challenge - WiFi Diagnostics Tree
 * Date: 09.16.21
 */



/*
 * Figure 3-23 shows a simplified flowchart for troubleshooting a bad Wifi connection. Use the flowchart 
 * to create a program that leads a person through the steps of fixing a bad Wifi connection. Here's an example of the output:
 * 
 * Reboot the computer to try and connect.
 * Did that fix the problem? no [enter]
 * Reboot the router and try to connect. 
 * Did that fix the problem? yes [enter]
 * 
 * Notice that the program ends as soon as a solution is found to the problem. HEre is another example of the programs output:
 * 
 * Reboot the computer to try and connect.
 * Did that fix the problem? no [enter]
 * Reboot the router and try to connect. 
 * Did that fix the problem? no [enter]
 * MAke sure the cables between the router and modem are plugged in firmly. 
 * Did that fix the problem? no [enter]
 * Move the router to a new location.
 * Did that fix the problem? no [enter]
 * Get a new router.
 */
import java.util.Scanner;
public class WiFiDiagnosticsTree {

	   public static void main(String[] args) {
	  
	   Scanner sc = new Scanner(System.in);
	  
	       System.out.println("Reboot the computer and try to connect.");
	      
	       System.out.print("Did that fix the problem? ");
	       String response = sc.nextLine();
	      
	       if(response.toLowerCase().equals("no"))
	       {
	       System.out.println("Reboot the router and try to connect.");
	      
	       System.out.print("Did that fix the problem? ");
	       response = sc.nextLine();
	      
	       if(response.toLowerCase().equals("no"))
	       {
	       System.out.println("Make sure the cables between the router & modem are plugged in firmly.");
	      
	       System.out.print("Did that fix the problem? ");
	       response = sc.nextLine();
	      
	       if(response.toLowerCase().equals("no"))
	       {
	       System.out.println("Move the router to a new location and try to connect.");
	      
	       System.out.print("Did that fix the problem? ");
	       response = sc.nextLine();
	      
	       if(response.toLowerCase().equals("no"))
	       {
	       System.out.println("Get a new router.");
	       }
	       }
	       }
	       }
	   
	}

}
