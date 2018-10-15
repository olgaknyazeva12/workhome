package task_break4;

import java.util.Scanner;

public class Tast_break4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "";
		System.out.println("Enter the text: ");
		Scanner sc1 = new Scanner(System.in);
		text = sc1.nextLine();

		char[] charArray = text.toCharArray();

		System.out.println("Result: ");
		for (char x : charArray) {
			if (Character.isLetter(x)) {
				System.out.print(x + " ");
			}
		}
	}
}