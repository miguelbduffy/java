import java.util.Scanner;

public class prime_number3 {

	public static void main(String[] args) {
		// Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. 
		
		// Declare an int variable.
		int num;
		
		// Ask the user to input a positive integer number
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a positive integer number: ");
			num = in.nextInt();
		
		// Make a while to compel the user to input a positive integer number
		while(num <= 0) {
			System.out.print("You must enter a positive integer number: ");
			num = in.nextInt();
		}
		
		// Set a boolean to false; if it turns to true, it is a prime number
		boolean flag = false;
		
		// Make a for loop to check if the number is prime. It must contain an if statement to check if during the loop num is % of i.
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		
		// Print if it is or not a prime number, it must contain an if statement as it depends on the result of the previous if contained in the for.
		if(flag = true) {
			System.out.println("The number " + num + " is prime.");			
		}
		else {
			System.out.println("The number " + num + " is not prime.");
		}
		


		
		
		

	}

}
