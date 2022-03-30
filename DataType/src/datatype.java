
public class datatype {

	public static void main(String[] args) {
		
		/* boolean b;
		char c;
		short s;
		int i;
		float f;
		double d;
		
		b = true;
		System.out.println("b = "+b);

		c = 'a';
		System.out.println("c = "+c);
		*/
		
		
		// or, we can use dynamic initialization
		
		/* boolean b = true;
		char c = 'a';
		short s = 10000;
		byte y = 15;
		
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("s = "+s);
		System.out.println("y = "+y);
		
		*/
		
		// Format specifier, using ' % ' sign
		
		boolean b = true;
		char c = 'a';
		short s = 10000;
	    float f = 10.1f;
	    
		System.out.printf("boolean b = %b\n",b);
		System.out.printf("character c = %c\n",c);
		System.out.printf("short s = %s\n",s);
		System.out.printf("float f = %.3f\n",f);
		
		// float f showing 6 zeros after point
		// we can control it by putting .1 or .2 or more to control
		

	}

}
