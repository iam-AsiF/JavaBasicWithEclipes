package jumpStatement;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			int r, temp, num, sum = 0;
			
			System.out.print("Enter any number: ");
			num = input.nextInt();
			
			temp = num;
			
			while(temp != 0) {
				
				r = temp % 10;
				sum = sum * 10 + r;
				temp = temp / 10;
			}
			System.out.print("Reverse integer: "+sum);
			
		}
		
	
	}

}
