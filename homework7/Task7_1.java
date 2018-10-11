package task7_1;

import java.util.Scanner;

public class Task7_1 {

	public static void main(String[] args) {

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

		findLongestAndShortestStrings(strings);

	}

	public static void findLongestAndShortestStrings(String[] stringMassive) {
		String shortest = stringMassive[0];
		String longest = stringMassive[0];
		for (int i = 0; i < stringMassive.length; i++) {
			shortest = (shortest.length() > stringMassive[i].length()) ? stringMassive[i] : shortest;
			longest = (longest.length() < stringMassive[i].length()) ? stringMassive[i] : longest;
		}

		System.out.println(
				"The shortest string: " + shortest + ". The length of the shortest string: " + shortest.length());
		System.out
				.println("The longest string: " + longest + ". The length of the longest string: " + longest.length());

	}

}
