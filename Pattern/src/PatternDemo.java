import java.util.Scanner;

public class PatternDemo {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.print("Enter line number: ");
			int n = input.nextInt();
			
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= i; j++) {
					
					System.out.print(""+j);
				}
				System.out.println();
			}
			
		}
		
		

	}

}
