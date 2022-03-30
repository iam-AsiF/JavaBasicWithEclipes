import java.util.Scanner;

public class evenVSodd {

	public static void main(String[] args) {
	
		try (Scanner input = new Scanner(System.in)) {
			int num;
			
			System.out.print("Enter a positive number: ");
			num = input.nextInt();
			
			if(num%2==0) {
				System.out.print("The number is even");
			}
			else {
				System.out.print("The number is odd");
			}
		}
	}

}
