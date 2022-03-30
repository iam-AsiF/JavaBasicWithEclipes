import java.util.Scanner;

public class OperatorArithmatic {

	public static void main(String[] args) {
		
		/*
		int num1; // or int num1, num2;
		int num2;
		
		num1 = 10;
		num2 = 5;
		
		int result;
		*/
		
		// or we can take input from user
		// note - import 'Scanner' class from Java 'util' package
		
		/*
		int num1, num2, result;
		Scanner answer = new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1 = answer.nextInt();
		System.out.println("Enter second number");
		num2 = answer.nextInt();
		
		result = num1 + num2;
		System.out.println("Result is "+result);
		
		result = num1 - num2;
		System.out.println("Result is "+result);
		
		result = num1 * num2;
		System.out.println("Result is "+result);

		result = num1 / num2;
		System.out.println("Result is "+result);
		
		result = num1 % num2;
		System.out.println("Result is "+result);
		*/
		
		// if the remainder is not integer, like 10/3 = 3.33
		// then wee need to do type casting
		// basically it means we need to change our integer
		// value to that value, is this case it will be 'double'
		
		int num1, num2, result;
		Scanner answer = new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1 = answer.nextInt();
		System.out.println("Enter second number");
		num2 = answer.nextInt();
		
		result = num1 + num2;
		System.out.println("Result is "+result);
		
		result = num1 - num2;
		System.out.println("Result is "+result);
		
		result = num1 * num2;
		System.out.println("Result is "+result);

		double result2  = num1 / (double) num2;
		// because there is already a result variable
		// which is integer, so we made another variable
		// for this double
		System.out.println("Result is "+result);
		
		result = num1 % num2;
		System.out.println("Result is "+result);
		
		
	}

}
