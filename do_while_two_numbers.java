import java.util.Scanner;

public class while_two_numbers {

	public static void main(String[] args) {
		// Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. 
		//The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate. 
		
		// Declare three int variables, which will be used to enter and sum the numbers
		int num1, num2, sum;
		
		// Declare a string to ask the user if wants to perform the operation again
		String ask;
		
		do {
			// Ask the user to input two numbers
			Scanner in = new Scanner(System.in);
			
			System.out.print("Please insert an integer positive number: ");
				num1 = in.nextInt();
			System.out.print("Please insert another integer positive number: ");
				num2 = in.nextInt();
				
			// Add the numbers
				sum = num1 + num2;
			
			// Display the sum
				System.out.println("The sum of the numbers is: " + sum);
			
			// Ask the user if wants to perform the operation again.
				System.out.println("Would you like to perform the operation again? y / n");
				ask = in.next();
		// Insert the while condition		
		}while(ask.equalsIgnoreCase("y"));
		
		// Print a termination statement.
		System.out.print("Ok, bye!");

	}

}
