package task2_9;

import java.util.Scanner;

public class Task2_9 {

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
		int i_min = 0;
		int i_max = 0;
		for (int i = 0; i < size; i++) {
			if (mas[i] < min) {
				min = mas[i];
				i_min = i;
			}
			if (mas[i] > max) {
				max = mas[i];
				i_max = i;
			}

		}
		System.out.println(" ");
		System.out.println("Position of minimum: " + i_min);
		System.out.println("Position of maximum: " + i_max);

	}

}
