//Способ 2

package task2_3;
import java.util.Scanner;

public class Task2_3_2 {
	
			public static void main(String[] args) {

			System.out.println("Size:");
			Scanner in = new Scanner(System.in);
			int size = in.nextInt();
			System.out.println("Your size: " + size);

			int mas[] = new int[size];
			int a = 0;
			int b = 10;
			int k = 0;
			System.out.print("Massive: ");
			for (int i = 0; i < size; i++) {
				mas[i] = a + (int) (Math.random() * b);
				System.out.print(mas[i] + " ");
				k++;
			}
			if (k > 2) {
				System.out.println(" ");
				System.out.print("Massive after multiplaying: ");
				for (int i = 1; i < size; i++) {
					if(i%3==0) {

					System.out.print((mas[i-1] * 2) + " ");
				}
				}
			} else {
				System.out.println(" ");
				System.out.println("Massive has < 3 elements.");
			}
		}

	}

