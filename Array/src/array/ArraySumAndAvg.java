package array;

import java.util.Scanner;

public class ArraySumAndAvg {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			
			double[] num = new double[5];
			/*
			number[0] = input.nextDouble();
			number[1] = input.nextDouble();
			number[2] = input.nextDouble();
			number[3] = input.nextDouble();
			number[4] = input.nextDouble();
			*/
			// we can use loop to stop index writing many times
			
			System.out.print("Enter five numbers please: ");
			for(int i = 0; i < 5; i++) {
				num[i] = input.nextDouble();
			}
			double sum = 0;
			
			//sum = number[0] + number[1] + number[2] + number[3] + number[4];
			//we can same thing for this line
			
			for(int j = 0; j < 5; j++) {
				sum = sum + num[j];
			}
			System.out.println("Sum = "+sum);
			
			double avg = sum / num.length;
			System.out.print("Avg number: "+avg);
			
		}
		

	}

}
