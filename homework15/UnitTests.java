package pack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import task15.Massive;

public class UnitTests {
	@Before
	public void before() {
		System.out.println("This is Before");
	}

	// Test 1
	@Test
	public void testForAddTwoToMassiveElement() {
		int[] expected_massive = { 4, 6, 8, 10, 12 };
		Massive massive = new Massive();
		assertArrayEquals("This test is for AddTwoToMassiveElement method", expected_massive,
				massive.addTwoToMassiveElement());
	}

	// Test 2
	@Test
	public void testForSetMassiveTrue() {
		Massive massive = new Massive();
		assertTrue("This is NotNull test for AddTwoToMassiveElement method", massive.setMassiveTrue());
	}

	// Test 3 exception
	@Test(expected = IndexOutOfBoundsException.class)
	public void testForReturnException() {
		int[] expected_massive = { 4, 6, 5 };
		Massive massive = new Massive();
		assertEquals(expected_massive.length, massive.returnException());
	}

	// Test 4
	@Test
	public void testForMultiplyMassiveElement() {
		Massive massive = new Massive();
		int[] expected_massive = { 4, 8, 12, 16, 20 };
		assertArrayEquals(expected_massive, massive.multiplyMassiveElement());
	}

	// Test 5
	@Test
	public void testForPrintMassive() {
		Massive massive = new Massive();
		int[] expected_massive = { 2, 4, 6 };
		assertArrayEquals(expected_massive, massive.printMassive());
	}

	// Test 6
	@Test
	public void testForSumOfElements() {
		Massive massive = new Massive();
		int expected_result = 15;
		assertEquals(expected_result, massive.sumOfElements());
	}

	// Test 7
	@Test
	public void testForFail() {
		fail("This is Fail!");
	}

	// Test 8
	@Test
	public void testForName() {
		Massive massive = new Massive();
		String expected_result = "Helen";
		assertEquals(expected_result, massive.name);
	}

	// Test 9
	@Test
	@Ignore
	public void testForSurname() {
		Massive massive = new Massive();
		String expected_result = "Brown";
		assertEquals(expected_result, massive.surname);
	}

	// Test 10
	@Test
	public void testForNameSize() {
		Massive massive = new Massive();
		int expected_result = 5;
		assertEquals(expected_result, massive.name.length());
	}

	// Test 11
	@Test
	@Ignore
	public void testForSurnameSize() {
		Massive massive = new Massive();
		int expected_result = 5;
		assertEquals(expected_result, massive.surname.length());
	}

	// Test 12
	@Test
	public void testNameAndSurname() {
		Massive massive = new Massive();
		String expected_result = "HelenBrown";
		assertEquals(expected_result, massive.name.concat(massive.surname));
	}

	// Test 13
	@Test
	public void testPrintMassive() {
		Massive massive = new Massive();
		int[] expected_massive = { 2, 4, 6 };
		assertArrayEquals(expected_massive, massive.printMassive());
	}

	// Test 14
	@Test
	public void testRevertMassive() {
		Massive massive = new Massive();
		int[] expected_massive = { 2, 4, 6, 8, 10 };
		int[] actual_massive = { 10, 8, 6, 4, 2 };

		assertArrayEquals(expected_massive, massive.revertMassive(actual_massive));
	}

	@BeforeClass

	static public void beforeClass() {
		System.out.println("This is BeforeClass");
	}

	@AfterClass
	static public void afterClass() {
		System.out.println("This is AfterClass");
	}

	@After
	public void after() {
		System.out.println("This is After");
	}

}
