import java.util.Scanner;

public class OperatorApplicationTemperature {

	public static void main(String[] args) {
		// celsius to farhenheit
		
		Scanner input = new Scanner(System.in);
		
		double cels;
		System.out.print("Enter celsius temperature : ");
		cels = input.nextDouble();
		
		double farh;
		farh = ((9*cels)/5) + 32;
		System.out.print("Temperature in Farhenhite = "+farh);
		
		
		// Farhenheit to Celsius
		
		/*
		double farh;
		System.out.print("Enter Farhengeit temperature : ");
		farh = input.nextDouble();
		
		double cels;
		//cels = 5/9*farh-32;
		cels = (5*(farh - 32))/9;
		System.out.print("Temperature in Celsius = "+cels);
		*/
	}

}
