package task7_2;

import java.util.Scanner;

public class Task7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of lines: ");
		Scanner scanner = new Scanner(System.in);
		int numberOfString = scanner.nextInt();
		System.out.println("Number of your strings: " + numberOfString);

		System.out.println("Enter your strings:");
		String[] strings = new String[numberOfString];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = scanner.next();
		}
		System.out.print("Your strings: ");
		System.out.println();
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}

		myResultmassive(strings);

	}

	public static void myResultmassive(String[] myMassive) {
		for (int i = myMassive.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (myMassive[j].length() > myMassive[j + 1].length()) {
					String tmp = myMassive[j];
					myMassive[j] = myMassive[j + 1];
					myMassive[j + 1] = tmp;
				}
			}
		}
		System.out.print("Your result: ");
		for (int i = 0; i < myMassive.length; i++) {
			System.out.print(myMassive[i] + " ");
		}

	}

}
