package task7_8;

import java.util.Scanner;

public class Task7_8 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("Enter the count of numbers: ");
		Scanner scanner = new Scanner(System.in);
		int numberOfString = scanner.nextInt();

		int[] mas = new int[numberOfString];
		System.out.println("Enter words with numbers:");
		Scanner scannerInt = new Scanner(System.in);
		for (int i = 0; i < numberOfString; i++) {
			mas[i] = scannerInt.nextInt();
		}

		int k = 0;
		for (int c : mas) {
			if (isPolindrom(c))
				k = k + 1;
			if (k == 2) {
				System.out.println("The second palindrom word is" + c);
				System.exit(0);
			}

		}
	}

	private static boolean isPolindrom(Integer s) {
		String targetStr = s.toString();
		if (targetStr.length() == 1)
			return true;
		for (int i = 0; i < targetStr.length() / 2; i++) {
			if (targetStr.toLowerCase().charAt(i) != targetStr.toLowerCase().charAt(targetStr.length() - 1 - i))
				return false;
		}
		return true;
	}
}