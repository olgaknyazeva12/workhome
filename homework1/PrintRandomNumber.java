package onesixpackage;

import java.util.Random;

public class PrintRandomNumber {

	public static void main(String[] args) {
		Random generator = new Random();
		int result = generator.nextInt(1000000);
		System.out.println("Random number = " + result);

	}

}
