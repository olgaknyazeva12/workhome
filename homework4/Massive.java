package task4;

public class Massive {

	public void printMassiveAsLine(int[] myMassive) {
		for (int i = 0; i < myMassive.length; i++) {
			System.out.print(myMassive[i] + " ");
		}
	}

	public void printReverseMassiveAsLine(int[] myMassive) {
		for (int i = myMassive.length - 1; i >= 0; i--) {
			System.out.print(myMassive[i] + " ");
		}
	}

	public int getSumOfElements(int[] myMassive) {
		int summa = 0;
		for (int i = 0; i < myMassive.length; i++) {
			summa += myMassive[i];
		}
		return summa;
	}

	public int[] multiplyBy3(int[] myMassive) {

		for (int i = 0; i < myMassive.length; i++) {
			myMassive[i] = myMassive[i] * 3;
		}
		return myMassive;
	}

}
