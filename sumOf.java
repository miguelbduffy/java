
public class sumOf {

	public static void main(String[] args) {
		// Write a program to calculate the sum of first 10 natural number.
		
		//FOR
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of first 10 natural numbers is: " + sum);
		
		//WHILE
		int sum1 = 0, j = 1;
		
		while(j <= 10) {
			sum1 = sum1 + j;
			j++;
		}
		System.out.println("The sum of first 10 natural numbers is: " + sum1);
		
		//DO WHILE
		int k = 1, sum2 = 0;
		
		do {
			sum2 += k;
			k++;
		}while(k <= 10);
		System.out.println("The sum of first 10 natural numbers is: " + sum2);
	}

}
