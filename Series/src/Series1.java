import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
		
		//series (1^2+2^2+3^2+...+n^2)
		/*
		int n, sum = 0;
		System.out.print("Enter the last number: ");
		n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			sum = sum + i*i;
	    }
		System.out.print("The sum is: "+sum);
		*/
		
		//floating number (1.5+2.5+3.5+...+n)
         double n, sum = 0;
			
		System.out.print("Enter the last number: ");
		n = input.nextDouble();
			
		for(double i=1.5; i<=n; i++) {
			sum = sum + i;
			System.out.println(i);
		}
		System.out.print("Sum of the series = "+sum);
		}
	}
}
