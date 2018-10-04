
package task3_6;

import java.util.Scanner;

public class Task3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Size:");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("Your size: " + size);

		double[] mas = new double[size];
		printMassiv(mas);
		double sum;
		sum = summaAllElements(mas);
		System.out.println();
		System.out.println("Summa = " + sum);

	}

	public static double summaAllElements(double[] eteredMassiv) {
		double summaAllElements = 0;
		for (int i = 0; i < eteredMassiv.length; i++) {
			summaAllElements += eteredMassiv[i];
		}
		return summaAllElements;
	}

	public static void printMassiv(double myMassiv[]) {
		for (int i = 0; i < myMassiv.length; i++) {
			myMassiv[i] = Math.random() * 11;
			System.out.print(myMassiv[i] + "  ");
		}
	}
}
