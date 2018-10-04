package task2_10;

import java.util.Scanner;

public class Task2_10 {

	public static void main(String[] args) {

		System.out.println("Enter size:");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("Size: " + size);

		int[] mas = new int[size];
		for (int i = 0; i < size; i++) {
			mas[i] = in.nextInt();
		}

		System.out.print("Size: ");
		for (int i = 0; i < size; i++) {
			System.out.print(mas[i] + " ");
		}

		System.out.println(" ");

		for (int i = 0; i < size; i++) {
			if (i > 0) {
				if (mas[i - 1] >= mas[i]) {
					System.out.println("The specified array is not an incremental sequence.");
					break;
				}
			}
			if (i == size - 1) {
				System.out.println("The specified array is an incremental sequence.");
			}
		}

	}

}
