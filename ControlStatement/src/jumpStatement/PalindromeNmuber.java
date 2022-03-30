package jumpStatement;

import java.util.Scanner;

public class PalindromeNmuber {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			int num, temp, r, sum = 0;
			
			System.out.print("Enter an integer: ");
			num = input.nextInt();
			
			temp = num;
			
			while(temp != 0) {
				
				r = temp % 10;
				sum = sum * 10 + r;
				temp = temp / 10;
			}
			if(sum == num) {
				System.out.print(num+" is a Palindrome");
			}
			else {
				System.out.print(num+" is not a Palindrome");
			}
		}
		

	}

}
