package task8_1;

public class Tester {

	public String name;
	String surname;
	protected int expirienceInYears;
	public String englishLevel;
	private int salary;

	public Tester() {

	}

	public Tester(String name) {
		this.name = name;
	}

	public Tester(String name, String surname) {
		this(name);
		this.surname = surname;
	}

	// The constructor is PUBLIC
	public Tester(String name, String surname, int intexpirienceInYears) {
		this(name, surname);
		this.expirienceInYears = expirienceInYears;
	}

	// Get and Set methods are FINAL because they should be available inside the
	// package only
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	int getExpirienceInYears() {
		return expirienceInYears;
	}

	void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	String getEnglishLevel() {
		return englishLevel;
	}

	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

//Method that returns salary*2 and available in the current class only

	private int calculateTwiceSalary(int salary) {
		int valueForMultiply = 2;
		return salary * valueForMultiply;
	}

	// Method that returns Expierence in months and available in the current package
	// only
	int calculateExpirienceInMonths(int expirienceInYears) {
		int numberOfMonths = 12;
		return expirienceInYears * numberOfMonths;
	}

//Method that prints name and surname and available for the current package and sub-classes
	protected void printNameWithSurname(String name, String surname) {
		System.out.println(name + " " + surname);
	}

//Method that prints all information and available anywhere
	public void printAllInformation(String name, String surname, int expirienceInYears, String englishLevel,
			int salary) {
		System.out.println(name + " " + surname + " " + expirienceInYears + " " + englishLevel + " " + salary);
	}

}
