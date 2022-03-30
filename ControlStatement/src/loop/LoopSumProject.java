package loop;

import java.util.Scanner;

public class LoopSumProject {

	public static void main(String[] args) {
		/*
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			
			sum = sum + i;
		}
		System.out.print("The sum is = "+sum);
		*/
		
		// if we want to take initial and final value from user
		
		/*
		try (Scanner input = new Scanner(System.in)) {
			int m, n;
			int sum = 0;
			
			System.out.print("Enter initial value: ");
			m = input.nextInt();
			
			System.out.print("Enter final value: ");
			n = input.nextInt();
			
			for(int i=m; i<=n; i++) {
				
				sum = sum + i;
			}
			System.out.print("The sum is = "+sum);
		}
		*/
		
		// if we only want to add even numbers
		
		/*
		try (Scanner input = new Scanner(System.in)) {
			int m, n;
			int sum = 0;
			
			System.out.print("Enter initial value: ");
			m = input.nextInt();
			
			System.out.print("Enter final value: ");
			n = input.nextInt();
			
			for(int i=m; i<=n; i++) {
				
				if(i%2==0) {
					sum = sum + i;
					System.out.println(i); 
					// if we want to print those numbers
				}
				else {
					continue;
				}
			}
			System.out.print("The  even sum is = "+sum);
		}
		*/
		
		//if we only want to add odd numbers
		
		try (Scanner input = new Scanner(System.in)) {
			int m, n;
			int sum = 0;
			
			System.out.print("Enter initial value: ");
			m = input.nextInt();
			
			System.out.print("Enter final value: ");
			n = input.nextInt();
			
			for(int i=m; i<=n; i++) {
				
				if(i%2==0) {
					continue;
				}
				else {
					sum = sum + i;
					System.out.println(i); 
					// if we want to print those numbers
	
				}
			}
			System.out.print("The obb sum is = "+sum);
		}

	}

}
