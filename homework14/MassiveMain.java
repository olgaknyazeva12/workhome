package task14;

public class MassiveMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Massive massive = new Massive();

//try and catch
		try {
			massive.devisionForValues(25, 0);
		} catch (ArithmeticException exception) {
			System.out.println("The second value for devision is 0!");
		}

//try and several catches
		try {
			massive.squarePerimeter(-100);
		} catch (IllegalArgumentException exception1) {
			System.out.println("The square side is negative!");
		} catch (ArithmeticException exception2) {
			System.out.println("The square side is 0!");
		}

//multi catch

		try {
			massive.rectanglePerimeter(10, -12);
		} catch (IllegalArgumentException | ArithmeticException exeption) {
			System.out.println(exeption.getMessage());

		}

//try - catch - finally

		try {
			massive.circleSquare(0);
		} catch (ArithmeticException exeption) {
			System.out.println(exeption.getMessage());

		} finally {
			System.out.println("The program continues to work.");
		}
	}

}
