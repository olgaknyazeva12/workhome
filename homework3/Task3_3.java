

package task3_3;

import java.util.Scanner;

public class Task3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int myFirstResult = 0;
		int mySecondResult = 1;

		System.out.println("Enter 2 values: ");

		a = printEnterValue(a);
		b = printEnterValue(b);
		myFirstResult = raznost(a, b);
		System.out.println("Differ: " + myFirstResult);

		System.out.println("Enter 3 values: ");

		c = printEnterValue(c);
		d = printEnterValue(d);
		e = printEnterValue(e);
		mySecondResult = mySum(c, d, e);

		System.out.println("Sum = " + mySecondResult);

	}

	public static int printEnterValue(int enterValue) {
		Scanner scanner = new Scanner(System.in);
		enterValue = scanner.nextInt();
		System.out.println("Your value: " + enterValue);
		return enterValue;
	}

	public static int raznost(int firstValue, int secondValue) {
		return (firstValue - secondValue);
	}

	public static int mySum(int first, int second, int third) {
		return (first + second + third);
	}
}
