import java.util.Scanner;

public class LeapYearCalcilation {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int y;
			
			System.out.print("Enter a year: ");
			y = in.nextInt();
			
			if(y%4==0 && y%100==0 && y%400==0) {
				System.out.print("It is a leap year");
			}
			else if(y%4==0 && y%100!=0) {
				System.out.print("It is a leap year");
			}
			else {
				System.out.print("It is not a leap year");
			}
		}

	}

}
