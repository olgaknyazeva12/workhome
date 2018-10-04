
package task3_1;

import java.util.Scanner;

public class Task3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 value: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("The first value: " + a);
		System.out.println("The second value: " + b);

		raznost(a, b);

	}

	public static void raznost(int firstValue, int secondValue) {
		System.out.println("Differ is: " + (firstValue - secondValue));
	}
}
