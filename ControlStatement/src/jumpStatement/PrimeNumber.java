package jumpStatement;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int m;
			System.out.print("Enter a positive integer: ");
			m = input.nextInt();
			int count = 0;
			
			for(int i = 2; i < m; i++) {
				
				if(m % i == 0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.print(m+" is a prime number");
			}
			else {
				System.out.print(m+" is not a prime number");
			}
			
		}

	}

}
