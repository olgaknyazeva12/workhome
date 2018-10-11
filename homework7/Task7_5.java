package task7_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of words: ");
		Scanner scanner = new Scanner(System.in);
		int numberOfString = scanner.nextInt();

		System.out.println("Enter a word:");
		String[] strings = new String[numberOfString];
		for (int i = 0; i < strings.length; i++) {

			strings[i] = scanner.next();
		}

		System.out.println();

		ArrayList<String> ar = new ArrayList<>();
		int number = 0;

		int p = 0;

		for (int i = 0; i < strings.length; i++) {
			if (CheckLatin(strings[i]) == true) { 
				p = p + 1;
				ar.add(strings[i]); 
				number = p;
			}
		}

		System.out.println("Words with latin symbols only: ");
		for (String words : ar) {
			System.out.println(words);
		}

		System.out.println("Number of words with latin symbols: " + number);

		Task7_5 str = new Task7_5();
		int k = 0;
		System.out.println("Words with latin symbols: ");
		for (String words : ar) {
			if (words.length() - str.vocal(words) == str.vocal(words)) { 
																			
				k = k + 1;
				System.out.println(words); 
			}
		}

		System.out.println("Number of words with the same count of vowels and consonants letters: " + k);

	}

	static boolean CheckLatin(String str) {
		return str.matches("[a-zA-Z]+");
	}

	public int vocal(String s)
	{
		char[] g = { 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u', 'Y', 'y' };
		char[] arrayOfChar = s.toCharArray();
		int c = 0, i = 0, j = 0;
		while (i < arrayOfChar.length)
		{
			if (g[j] == arrayOfChar[i]) {
				c++;
				i++;
				j = 0;
			}
			if (j >= g.length - 1) {
				j = 0;
				i++;
			}
			j++;
		}
		return c; 
	}
}
