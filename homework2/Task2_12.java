package task2_12;

import java.util.Scanner;

public class Task2_12 {

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
		System.out.println(" ");
		System.out.print("Result: ");
		System.out.print(mas[size - 2] + " " + mas[size - 1] + " ");

		for (int i = 0; i <= size - 3; i++) {
			System.out.print(mas[i] + " ");
		}
		;

	}

}
