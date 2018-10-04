package task2_4;

import java.util.Scanner;

public class Task2_4 {

	public static void main(String[] args) {

		System.out.println("Enter size:");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("Size: " + size);

		int[] mas = new int[size];
		for (int i = 0; i < size; i++) {
			mas[i] = in.nextInt();
		}

		System.out.print("Your massive: ");
		for (int i = 0; i < size; i++) {
			System.out.print(mas[i] + " ");
		}

		int count = 0;

		for (int i = 0; i < size; i++) {
			if (mas[i] == 0) {
				count++;
			}

		}
		System.out.println(" ");

		if (count != 0) {
			System.out.println("Number of 0 elements = " + count);

		} 
		else {
			System.out.println("There are no 0 elements.");
		}
	}

}
