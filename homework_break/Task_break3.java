package task_break3;

import java.util.Scanner;

public class Task_break3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerStr = new Scanner(System.in);
		Scanner scannerInt = new Scanner(System.in);

		System.out.println("Enter the count of words: ");
		int numberOfString = scannerInt.nextInt();

		System.out.println("Enter the words: ");
		String[] strings = new String[numberOfString];

		for (int i = 0; i < strings.length; i++) {
			strings[i] = scannerStr.next();
		}

		System.out.println("Enter the feature(0,1): ");
		int[] priznak = new int[numberOfString];
		for (int i = 0; i < priznak.length; i++) {
			priznak[i] = scannerInt.nextInt();
		}

		Scanner scannerStr1 = new Scanner(System.in);
		System.out.println("Enter the symbol for deleting: ");
		String symbol = scannerStr1.nextLine();
		System.out.println("Deleted symbol: " + symbol);

		Scanner scannerInt1 = new Scanner(System.in);
		System.out.println("Enter the k symbol for insert:");
		String word = scannerInt1.nextLine();
		char k = word.charAt(0);

		StringBuilder dest = new StringBuilder();

		for (int i = 0, n = strings.length; i < n; i++) {
			if (priznak[i] == 0) {
				strings[i] = strings[i].replace(symbol, "");
				dest.append(' ');
				dest.append(strings[i]);
			} else if (priznak[i] == 1) {
				dest.append(' ');
				for (int j = 0, l = strings[i].length(); j < l; j++) {
					dest.append(strings[i].charAt(j));
					if (strings[i].charAt(j) == k) {
						dest.append(k);
					}
				}
			} else {
				System.out.println("Word " + strings[i] + " doesn't contain " + word);
				dest.append(' ');
				dest.append(strings[i]);
			}
		}

		System.out.println("Result: ");
		System.out.println(dest);
	}

}
