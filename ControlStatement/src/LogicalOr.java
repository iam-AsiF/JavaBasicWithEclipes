import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			char ch;
			
			System.out.print("Enetr a letter: ");
			ch = input.next().charAt(0);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.print("Small vowel");
			}
			else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				System.out.print("Capital vowel");
			}
			else {
				System.out.print("consonent");
			}
		}
	}

}
