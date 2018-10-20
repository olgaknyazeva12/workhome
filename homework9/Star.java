package task9_1;

public class Star extends StarSystem {

	private String starName;
	private double averageDistanceFromEarth;
	private double averageTimeFromEarth;

	public void printPlanetDetails() {
		System.out.println("All details about the star: " + starName + " " + averageDistanceFromEarth + " "
				+ averageTimeFromEarth);

	}

	public double printAverageSpeed(double averageDistanceFromSun, double averageTimeFromSun) {

		return averageDistanceFromEarth / averageTimeFromEarth;

	}

	public void printTheGreeting() {
		System.out.println("HELLO, Star!");

	}

	public void print() {
		System.out.println("Abstract method for Star!");

	}

	public double findNewSpeed(double newDistance, double newTime) {
		return newDistance / newTime;
	}

}
