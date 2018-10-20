package task9_1;

public class Mars extends Planet {

	private String marsMainColor;
	private int marsAgeInYear;

	public Mars() {
		super("Uran");
		System.out.println("My constructor in the Mars class!");
	}

	public String getMarsMainColor() {
		return marsMainColor;
	}

	public void setMarsMainColor(String marsMainColor) {
		this.marsMainColor = marsMainColor;
	}

	public int getMarsAgeInYear() {
		return marsAgeInYear;
	}

	public void setMarsAgeInYear(int marsAgeInYear) {
		this.marsAgeInYear = marsAgeInYear;
	}

	public void printMarsColor() {
		System.out.println("The main Mars color is " + marsMainColor);

	}

	public void printMarsAgeInYearr() {
		System.out.println("The age of Mars is " + marsAgeInYear);

	}

	public int printMarsAgeInMonths(int marsAgeInYear) {
		int countOfMonths = 12;
		return marsAgeInYear * countOfMonths;

	}

}
