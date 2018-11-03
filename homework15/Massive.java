package task15;

public class Massive {
	public String name = "Helen";
	public String surname = "Brown";

// method 1
	public int[] addTwoToMassiveElement() {
		int[] massives = { 2, 4, 6, 8, 10 };
		for (int i = 0; i < massives.length; i++) {
			massives[i] += 2;
		}
		return massives;
	}

// method 2
	public int[] multiplyMassiveElement() {
		int[] massives = { 2, 4, 6, 8, 10 };
		for (int i = 0; i < massives.length; i++) {
			massives[i] *= 2;
		}
		return massives;
	}

// method 3 
	public int[] printMassive() {
		int[] massives = { 2, 4, 6 };

		return massives;
	}

// method 4
	public int sumOfElements() {
		int[] massives = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < massives.length; i++) {
			sum += massives[i];
		}
		return sum;
	}

//method 5
	public int returnException() {
		int[] massives = new int[3];

		return massives[5];

	}

// method 6 
	public boolean setMassiveTrue() {
		int[] massives = { 9, 0, 0, 0 };
		int sum = 0;
		for (int i = 0; i < massives.length; i++) {
			sum += massives[i];
		}

		return sum == massives[0];
	}

// method 7
	public int[] revertMassive(int[] actual_massive) {
		int[] massive_empty = new int[actual_massive.length];
		for (int i = actual_massive.length - 1; i >= 0; i--) {
			massive_empty[actual_massive.length - i - 1] = actual_massive[i];
		}

		return massive_empty;
	}

}
