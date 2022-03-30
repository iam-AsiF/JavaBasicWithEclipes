import java.util.Scanner;

public class MaximumMinimumNumber {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int num1, num2;
			
			System.out.print("Enter first number: ");
			num1 = input.nextInt();
			System.out.print("Enter second number: ");
			num2 = input.nextInt();
			
			if(num1>num2) {
				System.out.print("max number is: "+num1);
			}
			else if(num1==num2) {
				System.out.print("both are equal");
			}
			else {
				System.out.print("max number is: "+num2);
			}
		}

	}

}
