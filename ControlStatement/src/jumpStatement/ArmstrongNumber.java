package jumpStatement;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			int num, temp, r, sum = 0;
			
			System.out.print("Enter an integer: ");
			num = input.nextInt();
			
			temp = num;
			
			while(temp != 0) {
				
				r = temp % 10;
				sum = sum + r * r * r;
				temp = temp / 10;
			}
			if(sum == num) {
				System.out.print(num+" is an Armstrong integer");
			}
			else {
				System.out.print(num+" is not an Armstrong integer");
			}
		}
		

	}

}
