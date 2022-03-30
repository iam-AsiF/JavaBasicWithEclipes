import java.util.Scanner;

public class ifelseStatement {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int num;
			System.out.print("Enter a number: ");
			num = input.nextInt();
			
			if(num >0) {
				System.out.print("Positive");
			}
			
			else {
				System.out.print("Negative");
			}
		}
		
		
	}

}
