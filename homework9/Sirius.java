package task9_1;

public class Sirius extends Star {

	private String siriusMainColor;
	private int siriusAgeInYear;

	public void printSiriusColor() {
		System.out.println("The main Sirius color is " + siriusMainColor);

	}

	public void printSiriusAgeInYearr() {
		System.out.println("The age of Sirius is " + siriusAgeInYear);

	}

	public int printSiriusAgeInMonths(int siriusAgeInYear) {
		int countOfMonths = 12;
		return siriusAgeInYear * countOfMonths;

	}

}
