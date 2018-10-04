package task4;

public class MassiveMain {

	public static void main(String[] args) {
		Massive massive = new Massive();
		int size = 5;
		int board = 11;
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (int) (Math.random() * board);
		}
		System.out.print("Initial massive: ");
		massive.printMassiveAsLine(array);
		System.out.println();
		System.out.print("Reverse massive: ");
		massive.printReverseMassiveAsLine(array);

		System.out.println();
		System.out.print("Sum of elements: " + massive.getSumOfElements(array));

		System.out.println();
		massive.multiplyBy3(array);

		System.out.println("Multiplaying massive in direct order: ");
		massive.printMassiveAsLine(array);

		System.out.println();
		System.out.println("Multiplying massive in reverse order: ");
		massive.printReverseMassiveAsLine(array);

	}

}
