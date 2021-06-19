package projects;
import java.util.Scanner;

public class ControlFlow {

	
	public static void main(String[] args) {
		System.out.println("Valid characters:");
		System.out.println("");
		AsciiChars.printNumbers();
		System.out.println("");
		AsciiChars.printUpperCase();
		System.out.println("");
		AsciiChars.printLowerCase();
		System.out.println("");
		System.out.println("");
		
		Scanner scanner = new Scanner(System.in);
		
		String petName;
		int petAge;
		
		System.out.println("Please enter your name.");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		System.out.println("Would you like to continue to the interactive portion? (y/n)");
		String onward = scanner.nextLine();
		
		if (onward.charAt(0) == 'y' || onward.equals("yes")) {
			System.out.println("What is the name of your favorite pet?");
			petName = scanner.nextLine();
			System.out.println("How old is your favorite pet?");
			petAge = scanner.nextInt();
			
		}
		else {
			System.out.println("Please return later to complete the survey.");
		}
		
		
		
		
		
		
		
		
		
		
		scanner.close();
	}
	
	
	
	
}

