package task_break1;

import java.util.Scanner;

public class Task_break1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string");
		String myString = new String();
		myString = scanner.nextLine();
		System.out.println("Entered string: " + myString);
		StringBuffer sBuffer = new StringBuffer(myString);

		System.out.println("After what number the string will be added? Please, enter the value: ");
		int afterWhatVAlue = scanner.nextInt();
		System.out.println("Your entered value: " + afterWhatVAlue);

		System.out.println("Enter the insered string:");
		String inseredString = new String();
		inseredString = scanner.next();

		sBuffer.insert(afterWhatVAlue, inseredString);

		System.out.println("Your text with insered string after the entered index: " + sBuffer);
	}
}
