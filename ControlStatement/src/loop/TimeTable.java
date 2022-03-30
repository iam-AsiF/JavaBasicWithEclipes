package loop;

import java.util.Scanner;

public class TimeTable {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int num, result;
			System.out.print("Enter the number: ");
			num = input.nextInt();
			
			for(int i = 1; i <= 10; i++) {
				
				result = num * i;
				System.out.println(num+" x "+i + " = "+result);
			}
			System.out.print("The End");
	
		}

	}

}
