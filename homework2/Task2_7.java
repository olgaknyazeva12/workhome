package task2_7;

import java.util.Scanner;

public class Task2_7 {
	public static void main(String[] args) {

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

		for (int i = 0; i < (size / 2); i++) {
			int temp = mas[i];
			mas[i] = mas[size - i - 1];
			mas[size - i - 1] = temp;
		}

		System.out.println(" ");
		System.out.print("New massive: ");
		for (int i = 0; i < size; i++) {
			System.out.print(mas[i] + " ");
		}

	}
}
