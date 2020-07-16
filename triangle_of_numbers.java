import java.util.Scanner;

public class triangle_of_numbers {

	public static void main(String[] args) {
		// Write a program to print following :
		
//		 1
//	    222
//	   33333
//	  4444444
//	 555555555
		
		// Declare variable int num to assign it to the number of rows
		int num;
		
		// Ask the user tu insert the number of rows
		Scanner in = new Scanner(System.in);
		System.out.print("Please insert the number of rows: ");
			num = in.nextInt();
			
		// Make a for loop to get in upto num
		for(int i = 1; i <= num; i++) {
		// Make a nested for loop to print the left spaces
			for(int j = num; j > i; j--) {
			System.out.print(" ");	
			}
		// Make another nested for loop to print the numbers
			for(int k = 1; k <= i * 2 - 1; k++) {
				System.out.print(i);
			}
			// Print an enter to get to the next line
			System.out.println();
		}


	}

}
