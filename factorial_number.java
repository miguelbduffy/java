import java.util.Scanner;

public class factorial_number {

	public static void main(String[] args) {
		// Write a program to find the factorial value of any number entered through the keyboard.
		
		// declare int variables num, i and factorial (set it to 1).
		int num, i, factorial = 1;
		//ask the user tu input a number
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
			num = in.nextInt();
		// loop 1 up to the number, and do factorial times i
		for(i = 1; i <= num; i++) {
			factorial *= i;
		}
		// print the result outside the loop
		System.out.println("The factorial number of " + num + " is " + factorial + ".");
		
	  }

}
