package task9_1;

public class Planet extends StarSystem {

	private String planetName;
	private double averageDistanceFromSun;
	private double averageTimeFromSun;

	public Planet(String planetName) {
		this.planetName = planetName;
	}

	public Planet(String planetName, double averageDistanceFromSun) {
		this(planetName);
		this.averageDistanceFromSun = averageDistanceFromSun;
	}

	// The constructor is PUBLIC
	public Planet(String planetName, double averageDistanceFromSun, double averageTimeFromSun) {
		this(planetName, averageDistanceFromSun);
		this.averageTimeFromSun = averageTimeFromSun;
	}

	public void printPlanetDetails() {
		System.out.println("All details about the planet: " + this.planetName + " " + this.averageDistanceFromSun + " "
				+ this.averageTimeFromSun);

	}

	public double printAverageSpeed(double averageDistanceFromSun, double averageTimeFromSun) {

		return averageDistanceFromSun / averageTimeFromSun;

	}

	public void print() {
		System.out.println("Abstract method for Planet!");

	}

	public double findNewSpeed(double newDistance, double newTime) {
		int addingValue = 100;
		return newDistance / newTime + addingValue;
	}
}
