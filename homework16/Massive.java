package task16;

public class Massive {
	public int countOfMassives = 10;
	public int countOfElements = 100;
	public String massiveName = "MyFirstMassive";

//Method 1
	public int countOfElementsInAllMassives() {
		return this.countOfElements * this.countOfMassives;
	}

//Method 2
	public Integer[] printMassive(Integer[] myMassive) {
		return myMassive;
	}

//method 3
	public boolean setMassiveTrue() {
		int[] massives = { 9, 0, 0, 0 };
		int sum = 0;
		for (int i = 0; i < massives.length; i++) {
			sum += massives[i];
		}

		return sum == massives[0];
	}

	// method 4
	public boolean setMassiveFalse() {
		int[] massives = { 9, 9, 0, 0 };
		int sum = 0;
		for (int i = 0; i < massives.length; i++) {
			sum += massives[i];
		}

		return sum == massives[0];
	}

	// method 5

	public int returnException() {
		int[] massives = new int[3];

		return massives[5];

	}

	// method 6

	public Integer findSum(Integer[] actualMassive) {
		Integer sum = 0;
		for (int i = 0; i < actualMassive.length; i++) {
			sum += actualMassive[i];
		}
		return sum;
	}

	// method 7

	public int findDivisionZero(int[] actualMassive) {
		int div = 0;
		for (int i = 0; i < actualMassive.length; i++) {
			div = actualMassive[i] / 0;
		}
		return div;
	}

	// method 8

	public Integer findMultiply(Integer[] actualMassive) {
		Integer multi = 1;
		for (int i = 0; i < actualMassive.length; i++) {
			multi *= actualMassive[i];
		}
		return multi;
	}

	// method 9

	public Integer[] revertMassive(Integer[] myMassive) {
		Integer[] emptyMassive = new Integer[myMassive.length];
		for (int i = myMassive.length - 1; i >= 0; i--) {
			emptyMassive[myMassive.length - i - 1] = myMassive[i];
		}
		return emptyMassive;
	}

	// method 10

	public Integer[] twiceMassive(Integer[] myMassive) {
		Integer[] emptyMassive = new Integer[myMassive.length];
		int multiplyElement = 2;
		for (int i = myMassive.length - 1; i >= 0; i--) {
			emptyMassive[i] = myMassive[i] * multiplyElement;
		}
		return emptyMassive;
	}

}
