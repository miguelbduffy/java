import java.util.Scanner;

public class positiveInteger {

	public static void main(String[] args) {
		// Write a program that prompts the user to input a positive integer.
		// It should then print the multiplication table of that number. 
		
		// declare int variables input, i and multiplication, and set this one to 0. 
		int input, i, multiplication = 0;
		
		// request the user to input an integer positive number
		System.out.print("Please insert a positive integer number: ");
		Scanner in = new Scanner(System.in);
			input = in.nextInt();
		
		// while the user input 0 or a negative number, it will be requested to input another number, until inputs an integer positive number.
		while(input <= 0) {
			System.out.print("You must insert an integer positive number. Please try again: ");
			input = in.nextInt();
		}
		
		//	set i to 1, while i is less or equals 10, will multiple the input number times i and then, print the result.
		for(i = 1; i <= 10; i++) {
			multiplication = input * i;
			System.out.println("The number " + input + " times " + i + " is : " + multiplication);
		}

	}

}
