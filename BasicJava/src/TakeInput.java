import java.util.Scanner;
/*
 easiest way to take input is Scanner class,
 stored in util package. So we need to import that
 with this command. write Scanner, hold the cursor on it
 and import scannaer.util
*/
public class TakeInput {

	public static void main(String[] args) {
		
	/*
	int num;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter any number\n");
	num = input.nextInt();
	
	System.out.print("Number is  =  "+num);
	*/
	
	// string input taking
	
	/*
	String name;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter you name\n");
	name = input.nextLine();
	
	System.out.print("Welcome "+name);
	*/
	
	//  double input taking
	
	double num;
	Scanner input = new Scanner(System.in);
		
	System.out.println("Enetr a decible namber");
	num =  input.nextDouble();
	
	System.out.print(num);
	
	
	}

}
