import java.util.Scanner;

public class elseifLadder {

	public static void main(String[] args) {
	try (Scanner input = new Scanner(System.in)) {
		int num;
		System.out.print("Enter a num: ");
		num = input.nextInt();
		
		if(num>0) {
			System.out.print("Positive");
		}
		else if(num<0) {
			System.out.print("Negative");
		}
		else {
			System.out.print("Equal to Zero");
		}
	}
	}

}
