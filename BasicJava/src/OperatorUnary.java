
public class OperatorUnary {

	public static void main(String[] args) {
		/*
		int x = -10;
		int result;
		
		result = +x;
		System.out.print("result = "+result);
		*/
		
		// increment- decrement unary
		
		int x =10;
		int y;
		/*
		y = x++; // post increment
		//means it will increase by 1 to the next found x
		y = x; // now it will increase by 1
		System.out.print("y = "+y);
		*/
		
		// pre post mixed
		
		y = ++x; // pre increment
		// means it will increase by 1 first 
		System.out.println("y = "+y);
	
		y = x++; // post increment
		// means it will increase by 1 to the next founded x 
		System.out.println("y = "+y);
		
		y = --x; // pre increment
		// means it will increase by 1 first since x found
		//then  it will decrease by 1 first
		System.out.println("y = "+y);
		
		y = x--; // post increment
		// means it will increase by 1 to the next founded x
		System.out.print("y = "+y);
		
	}

}
