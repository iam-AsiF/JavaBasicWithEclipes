import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int num1, num2, large;
			//which number is bigger
			System.out.print("Enter two number: ");
			num1= in.nextInt();
			num2= in.nextInt();
			
			large = (num1>num2) ? num1 : num2;
			System.out.print("large number =" +large);
		}

	}

	}
