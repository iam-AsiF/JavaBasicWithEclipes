import java.util.Scanner;

public class VowelConsonantCapitalSmall {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			char ch;
			
			System.out.print("Enetr a letter: ");
			ch = input.next().charAt(0);
			
			if(ch=='a') {
				System.out.print("small letter vowel");
			}
			else if(ch=='e') {
				System.out.print("small letter vowel");
			}
			else if(ch=='i') {
				System.out.print("small letter vowel");
			}
			else if(ch=='o') {
				System.out.print("small letter vowel");
			}
			else if(ch=='u') {
				System.out.print("small letter vowel");
			}
			else if(ch=='A') {
				System.out.print("capital letter vowel");
			}
			else if(ch=='E') {
				System.out.print("capital letter vowel");
			}
			else if(ch=='I') {
				System.out.print("capital letter vowel");
			}
			else if(ch=='O') {
				System.out.print("capital letter vowel");
			}
			else if(ch=='U') {
				System.out.print("capital letter vowel");
			}
			else {
				System.out.print("consonant");
			}
		}

	}

}
