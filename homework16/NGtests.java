package task16;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NGtests {

	// Test 1
	@Test
	public void testForCountOfElementsInAllMassives() {
		Massive massive = new Massive();
		int expected_result = 1000;
		assertEquals(massive.countOfElementsInAllMassives(), expected_result);
	}

	// Test 2
	@Test
	public void testPrintMassive() {
		Massive massive = new Massive();
		Integer[] myMassive = { 2, 4, 6 };
		Integer[] actual_massive = massive.printMassive(myMassive);
		Integer[] expected_massive = { 2, 4, 6 };
		Assert.assertEqualsNoOrder(actual_massive, expected_massive);
	}

	// Test 3
	@Test
	public void testForSetMassiveTrue() {
		Massive massive = new Massive();
		assertTrue(massive.setMassiveTrue(), "This is True test for ForSetMassiveTrue method");
	}

	// Test 4
	@Test
	public void testForSetMassiveFalse() {
		Massive massive = new Massive();
		Assert.assertFalse(massive.setMassiveFalse(), "This is Fasle test for ForSetMassiveTrue method");
	}

//Test 5 exception
	@Test(expectedExceptions = IndexOutOfBoundsException.class)
	public void testForReturnException() {
		int[] expected_massive = { 4, 6, 5 };
		Massive massive = new Massive();
		assertEquals(massive.returnException(), expected_massive.length);

	}

//Test 6
	@Test

	public void testForFindSum() {
		Massive massive = new Massive();
		Integer[] myMassive = { 2, 4, 6 };
		Integer expectedSum = 12;
		assertEquals(massive.findSum(myMassive), expectedSum);
	}

//Test 7
	@Test(enabled = false)

	public void testForFindSumNotEquals() {
		Massive massive = new Massive();
		Integer[] myMassive = { 2, 4, 6 };
		Integer actualNotEquals = 16;
		Assert.assertNotEquals(massive.findSum(myMassive), actualNotEquals);
	}

//Test 8
	@Test(timeOut = 2 / 1000)
	public void testForTimeout() {
		Massive massive = new Massive();
		Integer[] myMassive = { 2, 4, 6 };
		Integer actualNotEquals = 16;
		Assert.assertNotEquals(massive.findSum(myMassive), actualNotEquals);
	}

//Test 9 exception
	@Test(expectedExceptions = ArithmeticException.class)
	public void testForReturnException2() {
		int[] myMassive = { 4, 6, 5 };
		Massive massive = new Massive();
		massive.findDivisionZero(myMassive);

	}

	// Test 10
	@Test

	public void testForFindMultiply() {
		Massive massive = new Massive();
		Integer[] myMassive = { 2, 4, 6 };
		Integer expectedMulti = 48;
		assertEquals(massive.findMultiply(myMassive), expectedMulti);
	}

	// Test 11
	@Test

	public void testForFindMultiNotEquals() {
		Massive massive = new Massive();
		Integer[] myMassive = { 2, 4, 6 };
		Integer actualNotEquals = 43;
		Assert.assertNotEquals(massive.findMultiply(myMassive), actualNotEquals);
	}

	// Test 12
	@Test

	public void testForFindSumNotNull() {
		Massive massive = new Massive();
		Integer[] myMassive = { 2, 4, 6 };

		Assert.assertNotNull(massive.findSum(myMassive));
	}

	// Test 13
	@Test

	public void testForFindSumNull() {

		Integer[] myMassive = null;

		Assert.assertNull(myMassive);
	}

	// Test 14
	@Test
	public void testPrintMassiveSame() {
		Massive massive = new Massive();
		Integer[] myMassive = { 2, 4, 6 };
		Assert.assertSame(massive.printMassive(myMassive), massive.printMassive(myMassive));
	}

	// Test 15
	@Test

	public void testForFindMultiNotNull() {
		Massive massive = new Massive();
		Integer[] myMassive = { 2, 4, 6 };

		Assert.assertNotNull(massive.findMultiply(myMassive));
	}

	// Test 16
	@Test
	public void testForFail() {
		fail("This is Fail!");
	}

	// Test 17
	@Test
	public void testForRevertMassiveWithEqualsNoOrder() {
		Massive massive = new Massive();
		Integer[] actual_massive = { 2, 4, 6 };
		Integer[] expected_massive = { 6, 4, 2 };

		Assert.assertEqualsNoOrder(massive.revertMassive(actual_massive), expected_massive, "With assertEqualsNoOrder");
	}

	// Test 18
	@Test
	public void testForRevertMassiveWithEquals() {
		Massive massive = new Massive();
		Integer[] actual_massive = { 2, 4, 6 };
		Integer[] expected_massive = { 6, 4, 2 };

		Assert.assertEquals(massive.revertMassive(actual_massive), expected_massive,
				"With testForRevertMassivewithEquals");
	}

	// Test 19
	@Test
	public void testForRevertMassiveTrue() {
		Massive massive = new Massive();
		Integer[] actual_massive = { 2, 4, 6 };
		Assert.assertNotNull(massive.revertMassive(actual_massive));
	}

	// Test 20
	@Test
	public void testFortestPrintMassiveNotNull() {
		Massive massive = new Massive();
		Integer[] myMassive = { 2, 4, 6 };

		assertNotNull(massive.printMassive(myMassive));
	}

	// Test 21
	@Test
	public void testForCountOfMassives() {
		Massive massive = new Massive();
		int countOfMassives_expected = 10;

		Assert.assertEquals(massive.countOfMassives, countOfMassives_expected);
	}

	// Test 22
	@Test
	public void testForCountOfElements() {
		Massive massive = new Massive();
		int countOfMassives_expected = 100;

		Assert.assertEquals(massive.countOfElements, countOfMassives_expected);
	}

	// Test 23
	@Test
	public void testForCountOfElementsNotNull() {
		Massive massive = new Massive();

		Assert.assertNotNull(massive.countOfElements);
	}

	// Test 24
	@Test
	public void testTwiceMassiveWithEqualsNoOrder() {
		Massive massive = new Massive();
		Integer[] actual_massive = { 2, 4, 6 };
		Integer[] expected_massive = { 4, 8, 12 };

		Assert.assertEqualsNoOrder(massive.twiceMassive(actual_massive), expected_massive);
	}

	// Test 25
	@Test(enabled = false)
	public void testForMassiveName() {
		Massive massive = new Massive();

		Assert.assertNotNull(massive.massiveName);
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is @BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is @AfterSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is @BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is @AfterTest");
	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("This is @BeforeGroups");
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("This is @AfterGroups");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is @BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is @AfterClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is @BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is @AfterMethod");
	}

}
