package task9_1;

public class Earth extends Planet {

	protected String earthMainColor;
	public int earthAgeInYear;

	public Earth() {
		super("Saturn");
		System.out.println("My constructor in the Earth class!");
	}

	public Earth(int earthAgeInYear) {
		super("Upiter");
		this.earthAgeInYear = earthAgeInYear;
	}

	public void printEarthColor() {
		System.out.println("The main Earth color is " + earthMainColor);

	}

	public void printEarthAgeInYearr() {
		System.out.println("The age of Earth is " + earthAgeInYear);

	}

	public int printEarthAgeInMonths(int earthAgeInYear) {
		int countOfMonths = 12;
		return earthAgeInYear * countOfMonths;

	}

	public void print() {
		System.out.println("Abstract method for Eatrh!");

	}

}
