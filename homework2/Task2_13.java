package task2_13;

import java.util.Scanner;

public class Task2_13 {

	public static void main(String[] args) {
		System.out.println("Enter size:");
		Scanner in = new Scanner(System.in);
		int size1 = in.nextInt();
		int size2 = in.nextInt();
		System.out.println("Size: " + size1 + " x " + size2);

		int mas[][] = new int[size1][size2];
		int a = 0;
		int b = 10;
		int k = 0;
		System.out.print("Massive: ");
		System.out.println();
		for (int i = 0; i < size1; i++) {

			for (int j = 0; j < size2; j++) {
				mas[i][j] = a + (int) (Math.random() * b);
				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}

		int min = mas[0][0];
		int max = mas[0][0];

		for (int i = 0; i < size1; i++) {

			for (int j = 0; j < size2; j++) {
				if (mas[i][j] < min) {
					min = mas[i][j];
				}

				if (mas[i][j] > max) {
					max = mas[i][j];
				}
			}
		}

		System.out.println("Max element: " + max);
		System.out.println("Min element: " + min);

	}
}
