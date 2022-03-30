package loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			// value of 5!
			int n , result=1;
			System.out.print("Enter a positive integer: ");
			n = input.nextInt();
			
			for(int i=n; i>=1; i--) {
				
				result = result * i;
			}
			System.out.print("Factorial of the number " +n+ " is = "+result);
		}
		
	}

}
