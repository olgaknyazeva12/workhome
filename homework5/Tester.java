package task5;

public class Tester {
	String name;
	String surname;
	int expirienceInYears;
	String englishLevel;
	int salary;

	public Tester() {

	}

	public Tester(String name) {
		this.name = name;
	}

	public Tester(String name, String surname) {
		this(name);
		this.surname = surname;
	}

	public Tester(String name, String surname, int salary) {
		this(name, surname);
		this.salary = salary;
	}

	public void print() {
		System.out.println("Name = " + this.name + ", Surname = " + this.surname + ", Salary = " + this.salary);
	}

	public static int salaryForYear(int salary) {
		int numberOfMonths = 12;
		return numberOfMonths * salary;
	}

	public void printMyData(String name) {
		System.out.println("My name is " + name);
	}

	public void printMyData(String name, String surname) {
		System.out.println("My name and surname are " + name + " " + surname);
	}

	public void printMyData(String name, String surname, int salary) {
		System.out.println("My name, surname and salary are " + name + " " + surname + " " + salary);
	}

}
