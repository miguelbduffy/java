import java.util.Scanner;

public class asterisk_triangle_reversed {

	public static void main(String[] args) {
		// Write a program to print following :
//		        *
//		       **
//		      ***
//		     ****
//		    *****
		int num;
		
		System.out.print("Please insert number of rows: ");
		Scanner in = new Scanner(System.in);
			num = in.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
