package twopackage;

public class DiffrTypes {

	public static void main(String[] args) {

		
		int i = 0b10;
		short s = 44;
		long l = 122222;
		double d = 555555.35;
		float f = 90.35f;
		char c = 'b';
		boolean boo = true;

		int result1 = i + s; 
		double result2 = l - d; 
		double result3 = f * d; 

		
		if (l > d) {
			System.out.println("long > double");
		}

		else {
			System.out.println("long < double");
		}

		
		if (f < i) {
			System.out.println("float < int");
		} else {
			System.out.println("float > int");
		}

		
		if (i == l) {
			System.out.println("int = long");
		} else {
			System.out.println("int != long");
		}

		
		if (i != d) {
			System.out.println("int ! = double");
		} else {
			System.out.println("int == long");
		}
		System.out.println(" ");
		System.out.println("Initial values");

		System.out.println("i = " + i + ", s = " + s + ", l = " + l + ", d = " + d + ", f = " + f + ", c = " + c
				+ ", boo = " + boo);

		
		System.out.println();
		System.out.println("Result with println: ");
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		System.out.println(" ");

		
		System.out.print(" ");
		System.out.print("Result with print: ");
		System.out.print(" result1 = " + result1);
		System.out.print(" result2 = " + result2);
		System.out.print(" result3 = " + result3);

		
		System.out.println(" ");
		System.out.printf("String with printf: ");
		String str = "Hello";
		System.out.printf(str);

	}

}
