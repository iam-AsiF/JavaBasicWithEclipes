import java.util.Scanner;

public class OperatorApplicationCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius;
		
		System.out.print("Enter radius value : ");
		radius = input.nextDouble();
		
		double area;
		area = 3.1416 * radius * radius;
		System.out.print("Area is = "+area);
		
	}

}
