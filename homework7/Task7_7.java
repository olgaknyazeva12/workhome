package task7_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7_7 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("Enter the number of words: ");
		Scanner scanner = new Scanner(System.in);
		int numberOfString = scanner.nextInt();

		System.out.println("Enter words:");
		String[] strings = new String[numberOfString];
		for (int i = 0; i < strings.length; i++) {

			strings[i] = scanner.next();
		}

		System.out.println("Word with different symbols: ");

		for (int i = 0; i < strings.length; i++) {
			if (diffWords(strings[i]).trim().length() != 0) {
				System.out.println(diffWords(strings[i]));
				System.exit(0);
			}
		}

	}

	private static String diffWords(String st) {
		StringBuffer u = new StringBuffer();
		String c;
		String string = "";
		for (int i = 0; i < st.length(); i++) {
			c = String.valueOf(st.charAt(i));
			if (u.indexOf(c) == -1)
				string = String.valueOf(u.append(c));
			else
				return "";
		}

		return string;
	}
}