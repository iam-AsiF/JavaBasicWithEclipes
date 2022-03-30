import java.util.Scanner;

public class Series3 {

	public static void main(String[] args) {
		// 1^2x3^2x5^2x...xn^2 multiplication series
		
		try (Scanner input = new Scanner (System.in)) {
			System.out.print("Enter last number: ");
			
			int n, result = 1;
			n = input.nextInt();
			
			for(int i=1; i<=n; i=i+2) {
				
				result = result * i * i;
				System.out.println(i);
			}
			System.out.print("total series multiplicatiuon = "+result);
		}	

	}

}
