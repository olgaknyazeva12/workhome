package task14;

public class Massive {

	int firstValueForDivision;
	int secondValueForDivision;
	int squareSide;
	int rectangleFirstSide;
	int rectangleSecondSide;
	int radius;
	final double PI = 3.14;

	protected int devisionForValues(int firstValue, int secondValue) {
		if (secondValue == 0)
			throw new ArithmeticException("The second value is ZERO!");
		return firstValue / secondValue;
	}

	protected int squarePerimeter(int squareSide) {
		if (squareSide == 0)
			throw new ArithmeticException("The square side is 0!");
		if (squareSide < 0)
			throw new IllegalArgumentException("The square side is negative!");
		return 4 * squareSide;
	}

	protected int rectanglePerimeter(int rectangleFirstSide, int rectangleSecondSide) {
		if (rectangleFirstSide == 0 || rectangleSecondSide == 0)
			throw new ArithmeticException("One rectangle side is 0!");
		if (rectangleFirstSide < 0 || rectangleSecondSide < 0)
			throw new IllegalArgumentException("One rectangle side is negative!");
		return 2 * (rectangleFirstSide + rectangleSecondSide);
	}

	protected double circleSquare(int radius) {
		if (radius == 0)
			throw new ArithmeticException("The radius is 0!");
		return 2 * PI * Math.pow(radius, 2);
	}
}
