package task9_1;

public class SystemPlanetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Constructor that is related with others
		Planet planet = new Planet("Saturn", 12323, 74653);
		planet.printPlanetDetails();

		Mars mars = new Mars();
		mars.setMarsMainColor("Red");
		System.out.println("Mars color: " + mars.getMarsMainColor());
		mars.setMarsAgeInYear(12345);
		System.out.println("Mars color: " + mars.getMarsAgeInYear());

		Earth earth = new Earth(12345);
		System.out.println("Example of constructor that is not related with others: " + earth.earthAgeInYear);
		Star star = new Star();

//Abstract methods
		System.out.println();
		planet.print();
		star.print();

		System.out.println("findNewSpeed for Planet: " + planet.findNewSpeed(1000, 5));
		System.out.println("findNewSpeed for Star: " + star.findNewSpeed(1000, 5));

	}

}
