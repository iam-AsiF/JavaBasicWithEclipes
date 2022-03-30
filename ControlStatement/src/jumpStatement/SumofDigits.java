package jumpStatement;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			int num, r, temp, sum = 0;
			
			System.out.print("Enter the numer: " );
			num = input.nextInt();
			
			temp = num;
			
			while(temp != 0) {
				
				r = temp % 10;
				sum = sum + r;
				temp = temp / 10;
				
			}
			System.out.print("Sum of digits: "+sum);

		}
	

	}

}
