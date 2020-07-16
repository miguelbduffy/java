import java.util.Scanner;

public class triangle2 {

	public static void main(String[] args) {
		// Write a program to print following :
		
		
//		    *
//		   ***
//		  *****
//		 *******
//		*********
		
		// Declare the int variable num to set the number of rows.
		int num;
		
		// Ask the user to set the number of rows
		Scanner in = new Scanner(System.in);
		System.out.print("Please insert the number of rows: ");
			num = in.nextInt();
			
		// Make a for loop to print the left spaces, and consider it will have the number of rows the
		// user input before.
			
		for(int i = 1; i <= num; i++) {
			// Nested for loop to print the spaces
			for(int j = num; j > i; j--) {
				System.out.print(" ");
			}
			// Nested for loop to print the asterisks
			for(int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
		// Print an enter.
			System.out.println();
		}

	}

}
