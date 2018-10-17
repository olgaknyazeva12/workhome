package task8_1;

public class MainTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Constructor
		Tester tester = new Tester("Olya", "Knyazeva");

//Set methods
		tester.setName("Vova");
		tester.setSurname("Ivanov");
		tester.setExpirienceInYears(12);
		tester.setEnglishLevel("beginner");
		tester.setSalary(1700);

//Get methods
		System.out.println(tester.getName());
		System.out.println(tester.getSurname());
		System.out.println(tester.getExpirienceInYears());
		System.out.println(tester.getEnglishLevel());
		System.out.println(tester.getSalary());

		Tester tester1 = new Tester();
//calculateTwiceSalary
		int twiceSalary = tester1.calculateTwiceSalary(1200);// calculateTwiceSalary is not available as this method can
																// be used in the Tester class only (private)

//calculateExpirienceInMonths
		int expirienceInMonths = tester1.calculateExpirienceInMonths(13);

//printNameWithSurname
		tester.printNameWithSurname("Misha", "Nazarov");

//printAllInformation
		tester.printAllInformation("Mary", "Hotter", 2, "advanced", 2500);
	}
}
