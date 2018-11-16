package pack1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pack.Methods;

public class MyTests {
	@Before
	public void before() {
	}

	@Test
	public void test1() {
		Methods method = new Methods();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com");
		driver.findElement(By.xpath(".//input[@placeholder=\"Куда вы хотите поехать?\"]")).sendKeys("Париж");

		method.findYourElement("(.//button[@aria-label=\"Открыть календарь\"])[1]", driver);

		method.findYourElement(".//td[@data-date='" + method.getDate(0) + "']", driver);
		method.findYourElement(".//td[@data-date='" + method.getDate(3) + "']", driver);
		method.findYourElement(".//span[text()=\"Проверить цены\"]", driver);
		method.findYourElement("//a[@data-id='pri-1']", driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean cheapHotelsAre;
		if (driver.findElement(By.xpath("(//a[@class='hotel_name_link url'])[1]")) != null) {
			cheapHotelsAre = true;

		} else
			cheapHotelsAre = false;
		assertTrue(cheapHotelsAre);
		driver.close();
	}

	@Test
	public void test2() {
		Methods method = new Methods();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.booking.com");
		driver.findElement(By.xpath(".//input[@placeholder=\"Куда вы хотите поехать?\"]")).sendKeys("Париж");
		method.findYourElement("(.//button[@aria-label=\"Открыть календарь\"])[1]", driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		method.findYourElement(".//td[@data-date='" + method.getDate(0) + "']", driver);
		method.findYourElement(".//td[@data-date='" + method.getDate(3) + "']", driver);
		method.findYourElement(".//span[text()=\"Проверить цены\"]", driver);
		method.findYourElement("//a[@data-id='pri-2']", driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		method.findYourElement("//a[@data-category='review_score_and_price']", driver);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Integer actualPrice = (method.handlePrice(driver.findElement(By.xpath("(//div/strong/b)[1]"))));
		System.out.println(actualPrice);

		Integer firstExpectedPriceBoard = 100;
		Integer secondExpectedPriceBoard = 999;

		assertTrue(method.priceInTermsOfValues(actualPrice, firstExpectedPriceBoard, secondExpectedPriceBoard));
		driver.close();
	}

	@Test
	public void test3() {
		Methods method = new Methods();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.booking.com");
		driver.findElement(By.xpath(".//input[@placeholder=\"Куда вы хотите поехать?\"]")).sendKeys("Париж");
		method.findYourElement("(.//button[@aria-label=\"Открыть календарь\"])[1]", driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		method.findYourElement(".//td[@data-date='" + method.getDate(0) + "']", driver);
		method.findYourElement(".//td[@data-date='" + method.getDate(3) + "']", driver);
		method.findYourElement("//span[@class='xp__guests__count']", driver);
		Select oSelect1 = new Select(driver.findElement(By.xpath("//*[@id='no_rooms']")));
		oSelect1.selectByIndex(1);

		Select oSelect2 = new Select(driver.findElement(By.xpath("//*[@id='group_adults']")));
		oSelect2.selectByIndex(1);
		method.findYourElement(".//span[text()=\"Проверить цены\"]", driver);
		method.findYourElement("//a[@data-id='pri-3']", driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Integer actualPrice = (method
				.handlePrice(driver.findElement(By.xpath("(//b[@class='sr_gs_price_total'])[1]"))));
		System.out.println(actualPrice);

		Integer firstExpectedPriceBoard = 100;
		Integer secondExpectedPriceBoard = 5000;

		assertTrue(method.priceInTermsOfValues(actualPrice, firstExpectedPriceBoard, secondExpectedPriceBoard));
		driver.close();
	}

	@Test
	public void test4() {
		Methods method = new Methods();
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://secure.booking.com/book.html?nflt=pri%3D5&hotel_id=53195&aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaCWIAQGYASG4ARfIAQzYAQHoAQH4AQuIAgGoAgM&lang=ru&sid=ba405dab43ba0acc12a1537279610395&room1=A%2CA&room2=A%2CA&error_url=%2Fhotel%2Ffr%2Fplazatoureiffel.ru.html%3Faid%3D304142%3Blabel%3Dgen173nr-1FCAEoggI46AdIM1gEaCWIAQGYASG4ARfIAQzYAQHoAQH4AQuIAgGoAgM%3Bsid%3Dba405dab43ba0acc12a1537279610395%3Bsrpvid%3D83058c985eee00ec%26%3B&hostname=www.booking.com&stage=1&checkin=2018-11-15&interval=4&children_extrabeds=&hp_visits_num=1&rt_pos_selected=2&rt_pos_selected_within_room=3&rt_num_blocks=11&rt_num_rooms=4&from_source=hotel&bedPreference_5319502=-1&nr_rooms_5319502_123457629_1_1_0=1&bedPreference_5319516=-1");
		method.findYourElement("(//input[@type='radio'])[1]", driver);

		Select oSelect1 = new Select(driver.findElement(By.xpath("//*[@id='booker_title']")));
		oSelect1.selectByIndex(2);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Olya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Knyazeva");
		String youeEmail = "olya.knyaz1997@gmail.com";
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(youeEmail);
		driver.findElement(By.xpath("//input[@name='email_confirm']")).sendKeys(youeEmail);
		method.findYourElement("(//label[@class='segment-users-radio__radio-label'])[1]", driver);
		method.findYourElement("//button[@name='book']", driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String yourPhone = "2707712";
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(yourPhone);

		Select oSelect2 = new Select(driver.findElement(By.xpath("//*[@id='cc_type']")));
		oSelect2.selectByIndex(1);

		String cardNumber = "3232323232323232";
		driver.findElement(By.xpath("//input[@name='cc_number']")).sendKeys(cardNumber);
		driver.findElement(By.xpath("//input[@name='cc_cvc']")).click();
		// WebDriver driver = new ChromeDriver();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String actualError = driver.findElement(By.xpath(("//p[@id='bp_form_cc_number_msg']"))).getText();

		String expectedError = "Введите номер действительной кредитной карты";

		assertEquals("Compare", expectedError, actualError);
		driver.close();

	}

	@BeforeClass

	static public void beforeClass() {
	}

	@AfterClass
	static public void afterClass() {
	}

	@After
	public void after() {
	}

}
