package task2_2;

import java.util.Scanner;

public class Task2_2 {

	public static void main(String[] args) {
		
		System.out.println("Size:");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("Your size: " + size);
		
		int[] mas = new int[size];
		for (int i = 0; i < size; i++) {
			mas[i] = in.nextInt();
		}
		
		System.out.print("Your massive: ");
		for (int i = 0; i < size; i++) {
			System.out.print(mas[i] + " ");
		}
int p = 1;
int i = 0;
        while (i<=mas.length - 1) {
        	p*=mas[i];
        		i++	;
        }
        System.out.println(" ");
        System.out.println("Multiplying massive = "+p);
	}

}
