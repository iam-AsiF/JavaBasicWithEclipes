import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			char ch;
			
			System.out.print("Enter a letter: ");
			ch = input.next().charAt(0);
			//charAt means index char point and 
			//0 means first index or first position
			
			if(ch=='a') {
				System.out.print("vowel");
			}
			else if(ch=='e') {
				System.out.print("vowel");
			}
			else if(ch=='i') {
				System.out.print("vowel");
			}
			else if(ch=='o') {
				System.out.print("vowel");
			}
			else if(ch=='u') {
				System.out.print("vowel");
			}
			else {
				System.out.print("consonent");
			}
		}
	}

}
