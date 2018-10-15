package task_break7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Task_break7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerStr = new Scanner(System.in);
		Scanner scannerInt = new Scanner(System.in);

		System.out.println("Enter the number of words: ");
		int number = scannerInt.nextInt();

		System.out.println("Enter the text: ");
		String[] strings = new String[number];

		for (int i = 0; i < strings.length; i++) {
			strings[i] = scannerStr.next();
		}

		char c = 0;
		String newString = null;

		Task_break7 obj = new Task_break7();

		StringBuilder sb = new StringBuilder();

		for (int i = 0, n = strings.length; i < n; i++) {
			for (int j = 0, k = strings[i].length(); j < k; j++) {
				if (obj.checkLatin(strings[i].charAt(j)) == false) {
					c = strings[i].charAt(j);
					newString = newString + c;
				} else
					c = ' ';
			}
			newString = newString + " ";

		}

		System.out.println(sb);

		String[] subStr;
		String delimeter = " ";
		subStr = newString.split(delimeter);

		ArrayList<String> Str = new ArrayList<>();
		for (int i = 0, n = subStr.length; i < n; i++) {
			Str.add(subStr[i]);
		}

		String max = Collections.max(Str, Comparator.comparing(s -> s.length()));
		System.out.println(max);
	}

	static boolean checkLatin(char st) {
		String str = Character.toString(st);
		;
		return str.matches("[a-zA-Z]+");
	}
}