package task_break5;

import java.util.Scanner;

public class Task_break5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerStr = new Scanner(System.in);

		System.out.println("Enter your text: ");
		String[] strings = new String[1];

		for (int i = 0; i < strings.length; i++) {
			strings[i] = scannerStr.next();
		}

		String symbol1 = "";
		System.out.println("Enter the first symbol for deleting: ");
		Scanner sc11 = new Scanner(System.in);
		symbol1 = sc11.nextLine();
		char one = symbol1.charAt(0);

		String symbol2 = "";
		System.out.println("Enter the second symbol for deleting: ");
		Scanner sc12 = new Scanner(System.in);
		symbol2 = sc12.nextLine();
		char two = symbol2.charAt(0);

		StringBuffer sb = new StringBuffer();

		char valueForNotDeletedText;

		for (int i = 0, n = strings.length; i < n; i++) {
			for (int j = 0, l = strings[i].length(); j < l; j++) {
				if (strings[i].charAt(j) == one) {
					do {
						j++;
					} while (strings[i].charAt(j) != two);
				}
				valueForNotDeletedText = strings[i].charAt(j);
				sb.append(valueForNotDeletedText);
			}
		}

		int pos = sb.indexOf(symbol2);
		sb.delete(pos, pos + 1);
		System.out.println(sb);
	}
}