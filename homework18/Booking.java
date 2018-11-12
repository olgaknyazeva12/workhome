package task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromeserver\\chromedriver_win32 ver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com");
		driver.findElement(By.xpath(".//input[@placeholder=\"Куда вы хотите поехать?\"]")).sendKeys("Москва");

		findYourElement(".//span[@class=\"xp__guests__count\"]", driver);
		findYourElement(".//select[@name = \"group_adults\"]", driver);
		findYourElement("(.//option[@value=\"2\"])[2]", driver);
		findYourElement("(.//option[@value=\"1\"])[1]", driver);
		findYourElement("(.//button[@aria-label=\"Открыть календарь\"])[1]", driver);
		findYourElement("(.//td[contains(text(),\"26\")])[1]", driver);
		findYourElement("(.//td[contains(text(),\"20\")])[2]", driver);
		findYourElement(".//span[text()=\"Проверить цены\"]", driver);
		driver.close();
	}

	public static void findYourElement(String yourPath, WebDriver driver) {
		driver.findElement(By.xpath(yourPath)).click();
	}
}
