package pack;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pack.Booking;

public class AppTest {
	public static WebDriver driver;
	public static Booking book;
	private static final int LINK_PRESENSE_TIMEOUT = 10;
	@Before
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(LINK_PRESENSE_TIMEOUT, TimeUnit.SECONDS);
		driver.get("https://www.booking.com");
		book = new Booking(driver);
	}

	@Test
	public void test1() {
		book.enterCity();
		book.click(book.countField);
		Select oSelect1 = new Select(book.room);
		oSelect1.selectByIndex(1);
		Select oSelect2 = new Select(book.adult);
		oSelect2.selectByIndex(1);
		book.click(book.calendar);
		book.click(book.firstDate);
		book.click(book.secondDate);
		book.click(book.findHotels);
		assertTrue(book.bestDisplay());
	}

	@Test
	public void test2() {
		book.enterCity();
		book.click(book.countField);
		Select oSelect1 = new Select(book.room);
		oSelect1.selectByIndex(1);
		Select oSelect2 = new Select(book.adult);
		oSelect2.selectByIndex(1);
		book.click(book.calendar);
		book.click(book.firstDate);
		book.click(book.secondDate);
		book.click(book.findHotels);
		book.click(book.sortByPriceAndFeedback);

		(new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT)).until(ExpectedConditions
				.invisibilityOfAllElements(driver.findElement(By.xpath(".//*[@id='utag_59_iframe']"))));
		(new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT)).until(ExpectedConditions.invisibilityOfAllElements(
				driver.findElement(By.xpath(".//div [@class=\"sr-usp-overlay sr-usp-overlay--wide\"]"))));

		book.click(book.buttonToOpenHotel);
		assertTrue(book.compareRaiting(book.raiting));

	}

	@After
	public void after() {
		driver.close();
	}

}
