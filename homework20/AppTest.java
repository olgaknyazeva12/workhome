package pack1;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pack1.Methods;

public class AppTest {
	public static WebDriver driver;
	public static Methods loginPage;

	@BeforeClass
	public static void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://mail.ru");
		loginPage = new Methods(driver);
	}

	@Test
	public void test1() {
		loginPage.enterLoginAndPass("test-test-1953", "12345678asd");
		loginPage.clickEnterButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.clickFirstCheckBox();
		loginPage.clickSpam();
		loginPage.clickSpamOption();
		loginPage.clickNotSpamCheckBox();
		loginPage.clickNotSpamButton();
		loginPage.clickWriteLetter();
		loginPage.enterEmail();
		loginPage.clickCards();
		loginPage.chooseCard();
		loginPage.clickSendButton();
		loginPage.inputClickOption();
		loginPage.all();
		loginPage.allSelect();
		loginPage.clickMore();
		loginPage.tickFlag();
		loginPage.clickMore();
		loginPage.tickNoFlag();

	}

	@AfterClass
	public static void afterClass() {

		driver.close();
	}
}
