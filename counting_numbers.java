import java.util.Scanner;

public class counting_numbers {

	public static void main(String[] args) {
		// Write a program to enter the numbers till the user wants and at the end it 
		// should display the count of positive, negative and zeros entered.
		
		// Declare variable int to let the user to input a number 
		int num;
		// Declare counters positive, negative and zeros and initialize them to 0.
		int count_positive_numbers = 0, count_negative_numbers = 0, count_zeros = 0;
		//Declare a string to ask the user if wants to enter another number.
		String ask;
		// Declare a character to let the user to choose if wants to enter another number
		char choice;
		// Make a do while
		do {
		// Ask the user to input a integer number
			Scanner in = new Scanner (System.in);
				System.out.print("Please insert a number: ");
				num = in.nextInt();
		// Make if statements to count the numbers
			if(num > 0) {
				count_positive_numbers++;
			}
			else if(num == 0) {
				count_zeros++;
			}
			else {
				count_negative_numbers++;
			}
		// Ask the user if wants to input a new number	
		System.out.print("Would you like to input another number?: y / n");
			choice = in.next().charAt(0);
		
		// While the answer isn´t y or n, the user will be asked to enter a valid answer.
		while(choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N') {
		System.out.print("You must input y (for yes) / n (for no). Would you like to input another number? ");
			choice = in.next().charAt(0);
		}
		
		// While the user responds it will enter a new number, do continues working; otherwise, it will print the counters.
		}while(choice == 'y' || choice == 'Y');
		
		// Print the counters
		System.out.println("The positive numbers entered are: " + count_positive_numbers);
		System.out.println("The negative numbers entered are: " + count_negative_numbers);
		System.out.println("The zeros entered are: " + count_zeros);

	}

}
