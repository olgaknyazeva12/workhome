package task7_3;

import java.util.Scanner;

public class Task7_3 {

	public static void main(final String[] args) {
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
		System.out.print("Your string: ");
		System.out.println();

		for (String str : strings) {
			System.out.println(str);
		}

		float average = 0;
		for (String item : strings) {
			average = average + item.length(); 
		}
		System.out.print("Full sum of length: " + average);
		System.out.println();
		average = average / strings.length;
		System.out.print("Average length: " + average);
		System.out.println();

		System.out.println("Strings < average value: ");
		for (int i = 0; i < numberOfString; i++) {
			if (strings[i].length() < average) {
				System.out.println(strings[i]);
			}
		}

		System.out.println("Strings > average value: ");
		for (int i = 0; i < numberOfString; i++) {
			if (strings[i].length() > average) {
				System.out.println(strings[i]);
			}
		}

	}
}
