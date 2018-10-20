package task9_1;

public class Sun extends Star {

	private String sunMainColor;
	private int sunAgeInYear;

	public void printSunColor() {
		System.out.println("The main Sun color is " + sunMainColor);

	}

	public void prinSunAgeInYearr() {
		System.out.println("The age of Sun is " + sunAgeInYear);

	}

	public int printSunAgeInMonths(int sunAgeInYear) {
		int countOfMonths = 12;
		return sunAgeInYear * countOfMonths;

	}

}
