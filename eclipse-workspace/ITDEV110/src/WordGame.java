//Chapter 2.21 Compound Interest
import java.util.Scanner;
public class WordGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in ); // Scanner object
		
		// Declared Variabless
		String name;
		int age;
		String city;
		String college;
		String profession;
		String animal;
		String petName;
	
		System.out.println(" Please enter your name: ");
		name = scanner.nextLine();
		
		System.out.println(" Please enter your age: ");
		age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println(" Please enter your city: ");
		city = scanner.nextLine();
		
		System.out.println(" Please enter your college: ");
		college = scanner.nextLine();
		
		System.out.println(" Please enter your profession: ");
		profession = scanner.nextLine();
		
		System.out.println(" Please enter your pet type: ");
		animal = scanner.nextLine();

		System.out.println(" Please enter your pet's name: ");
		petName = scanner.nextLine();
		
		//Story
		System.out.println("There was once a person named " + name + " who lived in " + city +  ". At the age of " + age + ", " + name 
				+ " went to college at " + college + ". " + name + " graduated and went to work as a " + profession + ". " +
				"Then, " + name + " adopted a " + animal + " named " + petName + "." + " They both lived happily ever after!");

	}

}

