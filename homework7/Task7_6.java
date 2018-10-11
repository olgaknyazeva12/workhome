package task7_6;

import java.util.Scanner;

public class Task7_6 {
	public static void main(String[] args) {
//TODO Auto-generated method stub
		System.out.println("Enter number of words: ");
		Scanner scanner = new Scanner(System.in);
		int numberOfString = scanner.nextInt();

		System.out.println("Enter a word:");
		String[] strings = new String[numberOfString];
		for (int i = 0; i < strings.length; i++) {

			strings[i] = scanner.next();
		}
		System.out.print("Your words: ");
		System.out.println();

		for (String str : strings) {
			System.out.println(str);
		}

		System.out.println("Words with increasing code of symbols: ");
		for (int i = 0; i < strings.length; i++) {
			if (searchCode(strings[i]) > 0) {
				System.out.println(strings[i]);
				System.exit(0);
			} 

		}
		System.out.println("");
	}

	private static int searchCode(String st) {
		int ascii = 0;
		for (int i = 0; i < st.length(); i++) {
			char word = st.charAt(i);
			ascii = (int) word;
			if (st.charAt(0) > st.charAt(i)) {
				return 0;
			}
		}
		return ascii; 

	}
}