package task_break10;

import java.util.Scanner;

public class Task_break10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] massiveofMarks = { '.', ',', '?', '!', ':', ';', '-' };
		int count = 0;
		System.out.println("Enter the text");
		Scanner scanner = new Scanner(System.in);
		String myString = scanner.nextLine();
		System.out.println("Your string: " + myString);

		for (int i = 0; i < myString.length(); i++) {
			for (int j = 0; j < massiveofMarks.length; j++) {
				if (myString.charAt(i) == massiveofMarks[j]) {
					count++;
				}
			}

		}
		System.out.println("Count of marks: " + count);
	}
}
