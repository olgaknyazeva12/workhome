package task9_1;

import java.util.Arrays;

abstract public class StarSystem {

	private String starSystemName;
	private int countOfPlanet;
	private double countOfSubSystems;

	public void printPlanetNames(String... systems) {

		Arrays.asList(systems).stream().forEach(system -> System.out.println(system));
	}

	public void printNameAndCount() {
		System.out.println(
				"System Name: " + starSystemName + " , " + "count: " + countOfPlanet + " " + countOfSubSystems);

	}

	public abstract void print();

	public abstract double findNewSpeed(double distance, double time);

}
