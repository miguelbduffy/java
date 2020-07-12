import java.util.Scanner;

public class factorial_number {

	public static void main(String[] args) {
		// Write a program to find the factorial value of any number entered through the keyboard.
		int num, i, factorial = 1;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
			num = in.nextInt();
		
		for(i = 1; i <= num; i++) {
			factorial *= i;
			
		}
		System.out.println("The factorial number of " + num + " is " + factorial + ".");
		
	  }

}
