package task8_2;

import task8_1.Tester;

public class SecondTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Constructor
		Tester tester2 = new Tester("Olya", "Knyazeva", 12);

		// Set methods
		tester2.setName("Vova");// not available as Set methods have Friendly access
		tester2.setSurname("Ivanov");
		tester2.setExpirienceInYears(12);
		tester2.setEnglishLevel("beginner");
		tester2.setSalary(1700);

		// Get methods
		System.out.println(tester2.getName());/// not available as Get methods have Friendly access
		System.out.println(tester2.getSurname());
		System.out.println(tester2.getExpirienceInYears());
		System.out.println(tester2.getEnglishLevel());
		System.out.println(tester2.getSalary());

		Tester tester3 = new Tester();
		// calculateTwiceSalary
		int twiceSalary = tester3.calculateTwiceSalary(1200);// calculateTwiceSalary is not available as this method can
																// be used in the Tester class only

		// calculateExpirienceInMonths
		int expirienceInMonths = tester3.calculateExpirienceInMonths(13);// mistake because this method is Friendly and
																			// available in the task8_1 package

		// printNameWithSurname
		tester3.printNameWithSurname("Misha", "Nazarov");// mistake because this method is Protected and available in the
															// task8_1 package and for the sub-classes

		// printAllInformation
		tester3.printAllInformation("Mary", "Hotter", 2, "advanced", 2500);
	}

}
