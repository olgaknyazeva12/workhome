package task2_11;

import java.util.Scanner;

public class Task2_11 {

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

		
		for (int i = 1; i < size - 1; i++) {
			mas[i] = (mas[i - 1] + mas[i + 1]) / 2;
		}
		;

		System.out.println(" ");
		System.out.print("Result massive: ");
		for (int i = 0; i < size; i++) {
			System.out.print(mas[i] + " ");
		}
		;

	}

}
