package task_8;

import java.util.Scanner;

public class Task2_8 {
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
		int min = mas[0];
		int max = mas[0];
		for (int i = 0; i < size; i++) {
			if (mas[i] < min)
				min = mas[i];
		}
		System.out.println(" ");
		System.out.println("Minimum: " + min);
		for (int i = 0; i < size; i++) {
			if (mas[i] > max)
				max = mas[i];
		}

		System.out.println("Maximum: " + max);

	}
}
