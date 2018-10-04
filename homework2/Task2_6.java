package task2_6;

import java.util.Scanner;

public class Task2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size:");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("Size: " + size);

		int mas[] = new int[size];
		int a = 0;
		int b = 10;
		int k = 0;
		System.out.print("Massive: ");
		for (int i = 0; i < size; i++) {
			mas[i] = a + (int) (Math.random() * b);
			System.out.print(mas[i] + " ");
		}

		if (size % 2 == 0) {
			int temp;
			for (int i = 0; i < size; i += 2) {
				temp = mas[i];
				mas[i] = mas[i + 1];
				mas[i + 1] = temp;
			}
			System.out.println(" ");
			System.out.print("New massive: ");
			for (int i = 0; i < size; i++) {
				System.out.print(mas[i] + " ");
			}
		} else if (size % 2 != 0) {
			int temp;
			for (int i = 0; i < size - 1; i += 2) {
				temp = mas[i];
				mas[i] = mas[i + 1];
				mas[i + 1] = temp;
			}

			System.out.println(" ");
			System.out.print("New massive: ");
			for (int i = 0; i < size; i++) {
				System.out.print(mas[i] + " ");
			}
		}

	}
}
