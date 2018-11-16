package pack;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Methods {

	public void findYourElement(String yourPath, WebDriver driver) {
		driver.findElement(By.xpath(yourPath)).click();
	}

	public boolean priceInTermsOfValues(Integer actualPrice, Integer firstExpectedPriceBoard,
			Integer secondExpectedPriceBoard) {

		if (actualPrice > firstExpectedPriceBoard && actualPrice <= secondExpectedPriceBoard) {
			return true;
		} else
			return false;
	}
	
	public int handlePrice(WebElement elementToHandle) {
		  return Integer.parseInt(elementToHandle.getText().replaceAll("[^0-9]", ""));
		 }
	
	

public String getDate(int increment) {
	  return LocalDate.from(new Date().toInstant().atZone(ZoneId.of("Europe/Moscow"))).plusDays(increment).toString();
	 }
}


