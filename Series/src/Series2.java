import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			
			//Multiplication Series (1x2x3x...x)
			/*
			int n, result = 1; // if put  0; sum = 0xsum = 0
			System.out.print("Enter last number: ");
			n = input.nextInt();
			
			for(int i=1; i<=n; i++) {
				result = result * i;
			}
		System.out.print("Total sum = "+result);
		*/
			
		// multiplication series (1.5x3.5x5.5x...n)
		
		double n,  result = 1;
		System.out.print("Enter last number: ");
		n = input.nextDouble();
		
		for(double i=1.5; i<=n; i=i+2) {
			result = result * i;
			System.out.println(i);
		}
		System.out.print("Result of the series = "+result);
		}

	}

}
