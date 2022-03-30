package array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] number = new int[5];
		
		// index number starts from 0
		
		number[0] = 10;
		number[1] = 10;
		number[2] = 10;
		number[3] = 10;
		number[4] = 10;
		
		//System.out.print(number[1]);
		
		//if you want to add all the array
		
		int sum = number[0] + number[1] + number[2]+ number[3] + number[4];
		System.out.print("Sum of array = "+sum);
		

	}

}
