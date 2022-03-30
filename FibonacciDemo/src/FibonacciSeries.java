import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			
			int n;
			System.out.print("How many numbers: ");
			n = input.nextInt();
			
			int first = 0;
			int second = 1;
			int fibo;
			System.out.println(" "+first+"\n "+second);
			
			//Since I have already printed first two numbers
			//so I can start initial value with 3 now
			
			for(int i=3; i<=n; i++) {
				
				fibo = first + second;
				System.out.println(" "+fibo);
				first = second;
				second = fibo;
			}
			
			
		}
		
		

	}

}
