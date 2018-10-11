package task7_4;

import java.util.Scanner;

public class Task7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of words: ");
		Scanner scanner = new Scanner(System.in);
		int numberOfString = scanner.nextInt();
		System.out.println("Number of your words: " + numberOfString);

		System.out.println("Enter your words:");
		String[] strings = new String[numberOfString];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = scanner.next();
		}
		System.out.print("Your words: ");
		System.out.println();

		for (String str : strings) {
			System.out.print(str + "   ");
		}
		String goal = strings[0];
		int min = findValueOfDifferentSymbols(strings[0]);
		System.out.println();

		for (int i = 0; i < strings.length; i++) {
			if (findValueOfDifferentSymbols(strings[i]) < min) {
				min = findValueOfDifferentSymbols(strings[i]);
				goal = strings[i];
			}
		}

		System.out.println("The word is " + goal + " with minimum of different symbols " + min);

	}

	public static int findValueOfDifferentSymbols(String myString) {
		StringBuilder line = new StringBuilder(); 
		String currentSymbol;
		for (int i = 0; i < myString.length(); i++) {
			currentSymbol = String.valueOf(myString.charAt(i));
			if (line.indexOf(currentSymbol) == -1) {
				line.append(currentSymbol);
			}

		}
		return line.length();
	}

}
