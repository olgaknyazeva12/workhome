package task_break2;

import java.util.Scanner;

public class Task_break2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the text:");
		String myString = scanner.nextLine();
		System.out.println("Your text: " + myString);

		System.out.println("Enter the string for searching in the end:");
		String NewMyString = scanner.nextLine();
		System.out.println("Entered string: " + NewMyString);

		System.out.println("Enter the string for insert:");
		String UkazmyString = scanner.nextLine();
		System.out.println("Your entered string: " + UkazmyString);

		String[] subStr;
		String delimeter = " ";
		subStr = myString.split(delimeter);
		int indexJava = 0;

		for (int i = 0, n = subStr.length; i < n; i++) {
			indexJava = 0;
			indexJava = subStr[i].lastIndexOf(NewMyString);
			if (indexJava == -1) {
				System.out.println("Word " + NewMyString + " is not found in the word " + subStr[i]);
			} else {
				System.out.println("Word " + NewMyString + " is found in the word " + subStr[i]);
				subStr[i] = new StringBuilder().append(subStr[i]).append(UkazmyString).toString();
			}

		}

		System.out.println("The result : ");
		for (int i = 0, n = subStr.length; i < n; i++) {
			System.out.print(subStr[i] + " "); 
		}
	}

}
