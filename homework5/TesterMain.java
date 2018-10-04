package task5;

public class TesterMain {

	public static void main(String[] args) {

		// Constructor Overloading
		int salaryInMonth = 12;
		Tester tester1 = new Tester();
		Tester tester2 = new Tester("Nic");
		Tester tester3 = new Tester("Sarra", "Brown");
		Tester tester4 = new Tester("Olya", "Howard", 32333);
		tester1.print();
		tester2.print();
		tester3.print();
		tester4.print();

		// Static method

		System.out.println("Salary for one year = " + Tester.salaryForYear(salaryInMonth));

		// Method Overloading

		Tester tester5 = new Tester();

		tester5.printMyData("Oleg");
		tester5.printMyData("Oleg", "Ivanov");
		tester5.printMyData("Oleg", "Ivanov", 3443);

	}
}
