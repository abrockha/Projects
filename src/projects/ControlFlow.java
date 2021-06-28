package projects;
import java.util.Scanner;

public class ControlFlow {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		String[] msg = new String[] {"What is the name of your favorite pet?",  "How old is your favorite pet?", "What is your lucky number?", 
				"What is the jersey number of your favorite quarterback?", "What year is your vehicle? (two digits)", "What is the name of your favorite actor or actress?","Pick a number from 1 to 50." };
		Object[] answerArray = new Object[7];
		String strAns;
		int intAns;
		final int MAXNUM = 65;
		final int MAXBALL = 75;
		int powerBall;
		int lottNums[] = new int[5];
		
		
		
		
		System.out.println("Valid characters:");
		System.out.println("");
		AsciiChars.printNumbers();
		System.out.println("");
		AsciiChars.printUpperCase();
		System.out.println("");
		AsciiChars.printLowerCase();
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println("Please enter your name.");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		System.out.println("Would you like to continue to the interactive portion? (y/n)");
		String onward = scanner.nextLine();
		
		if (onward.charAt(0) == 'y') {
			for (int i = 0; i <= msg.length-1; i++) {
				System.out.println(msg[i]);
				if (i == 0 || i == 5) {
					
					
					strAns = scanner.nextLine();
					answerArray[i] = strAns;
				}
				else {
					intAns = Integer.parseInt(scanner.nextLine());
					answerArray[i] = intAns;
				}
				
			}
			int firstRand = (int)(Math.random() * 10);
			int secondRand = (int)(Math.random() * 50);
			int thirdRand = (int)(Math.random() * 20);
			powerBall = (int) answerArray[2] * firstRand;
			lottNums[0] = (int)(msg[0].charAt(2));
			lottNums[1] = (int) answerArray[2] + (int) answerArray[4];
			lottNums[2] = Math.abs(secondRand - thirdRand);
			lottNums[3] = (int) answerArray[1] + (int) answerArray[4];
			lottNums[4] = (int) answerArray[1] + (int) answerArray[2] + (int) answerArray[3];
			
			
			while (powerBall > MAXBALL) {
				powerBall -= MAXBALL;
			}
			
			for (int i = 0; i<5;i++) {
				if (lottNums[i] > MAXNUM) {
					lottNums[i] -= MAXNUM;
					
				}
			}
			
			System.out.println("Lottery numbers: " + lottNums[0] + ", " + lottNums[1] + ", " + lottNums[2] + ", " + lottNums[3] + ", " + lottNums[4] + ", " + powerBall);
			
			
		}
		else {
			System.out.println("Please return later to complete the survey.");
		}
		
		
		
		
		
		
		
		
		
		
		scanner.close();
	}
	
	
	
	
}

