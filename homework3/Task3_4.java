

package task3_4;

import java.util.Scanner;

public class Task3_4 {

	public static void main(String[] args) {
		System.out.println("Size:");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("Your size: " + size);

		int[] mas = new int[size];
		for (int i = 0; i < size; i++) {
			mas[i] = in.nextInt();
		}
		print(mas);
	}

	public static void print(int[] masToPrint) {

		for (int i = 0; i < masToPrint.length; i++) {
			System.out.print(masToPrint[i] + " ");
		}
	}
}