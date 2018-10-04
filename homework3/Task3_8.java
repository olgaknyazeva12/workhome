
package task3_8;

public class Task3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int board = 16;
		int firstNumber = (int) (Math.random() * board);
		int secondNumber = (int) (Math.random() * board);
		int thirdNumber = (int) (Math.random() * board);

		printValue(firstNumber);
		printValue(secondNumber);
		printValue(thirdNumber);

		int result1 = findMinValue(firstNumber, secondNumber);
		boolean result2 = chetnoeNochetnoe(firstNumber);
		int result3 = inKvadrat(thirdNumber);
		int result4 = cub(secondNumber);

		System.out.println("Minimum: " + result1);
		System.out.println("Chetnoe the first vakue?: " + result2);
		System.out.println("Square of the third value: " + result3);
		System.out.println("Cub of the second value: " + result4);

	}

	public static void printValue(int printNumber) {
		System.out.println("Random value = " + printNumber);
	}

	public static int findMinValue(int firstValue, int secondValue) {

		if (firstValue < secondValue)
			return firstValue;
		else
			return secondValue;
		
	}

	public static boolean chetnoeNochetnoe(int chetnoeOrNecetnoe) {

		return chetnoeOrNecetnoe % 2 == 0;
	}

	public static int inKvadrat(int myValue) {
		myValue = (int) (Math.pow(myValue, 2));
		return myValue;
	}

	public static int cub(int myValue) {
		myValue = (int) (Math.pow(myValue, 3));
		return myValue;
	}
}
