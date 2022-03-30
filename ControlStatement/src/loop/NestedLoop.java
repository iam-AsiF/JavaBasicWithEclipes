package loop;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int m, n, result;
			System.out.print("Enter first number: ");
			m = input.nextInt();
			
			System.out.print("Enter last number: ");
			n = input.nextInt();
			
			for(int i = m; i <= n; i++) {
				//loop inside a loop
				
				for(int j =1 ; j <= 10; j++) {
					result = i * j;
					System.out.println(i+" x "+j + " = "+result);
				}
			System.out.println("End of time table of "+i);
			System.out.println();
			}
		}

	}

}
