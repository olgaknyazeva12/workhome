package task2_5;

import java.util.Scanner;

public class Task2_5 {

	public static void main(String[] args) {
		System.out.println("Enter size:");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("Size: " + size);
		int[] mas = new int[size];
		for (int i = 0; i < size; i++) {
			mas[i] = in.nextInt();
		}

		System.out.print("Massive: ");
		for (int i = 0; i < size; i++) {
			System.out.print(mas[i] + " ");
		}

		int count = 0;
		System.out.println(" ");
		for (int i = 0; i < size; i++) {
			if (mas[i] == 0) {
				System.out.println("Position of 0 element: " + i);
				count++;
			}
		}

		if (count == 0) {

			System.out.println("No 0 elements.");

		}
	}

}
