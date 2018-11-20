package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking {
	public String city = "Москва";

	@FindBy(xpath = ".//input[@placeholder=\"Куда вы хотите поехать?\"]")
	public WebElement whereToGoField;

	@FindBy(xpath = ".//span[@class=\"xp__guests__count\"]")
	public WebElement countField;

	@FindBy(xpath = "//*[@id='group_adults']")
	public WebElement adult;

	@FindBy(xpath = "//*[@id='no_rooms']")
	public WebElement room;

	@FindBy(xpath = "(.//button[@aria-label=\"Открыть календарь\"])[1]")
	public WebElement calendar;

	@FindBy(xpath = "(.//td[contains(text(),\"26\")])[1]")
	public WebElement firstDate;

	@FindBy(xpath = "(.//td[contains(text(),\"20\")])[2]")
	public WebElement secondDate;

	@FindBy(xpath = ".//span[text()=\"Проверить цены\"]")
	public WebElement findHotels;

	@FindBy(xpath = "//a[@data-category='popularity']")
	public WebElement bestVariants;

	@FindBy(xpath = ".//a[@data-category='review_score_and_price']")
	public WebElement sortByPriceAndFeedback;

	@FindBy(xpath = "(.//a[@class='hotel_name_link url'])[1]")
	public WebElement firstFoundedHotel;

	@FindBy(xpath = "//a[text()='Великолепное расположение — показать на карте']")
	public WebElement waitForElement;

	@FindBy(xpath = "(.//div[@class='bui-review-score__badge'])[1]")
	public WebElement raiting;

	@FindBy(xpath = "(//span[@class='b-button__text'])[1]")
	public WebElement buttonToOpenHotel;

	@FindBy(xpath = ".//*[@id='utag_59_iframe")
	public WebElement frameToWait;

	@FindBy(xpath = ".//div [@class=\"sr-usp-overlay sr-usp-overlay--wide\"]")
	public WebElement notDisplayedElementToWait;

	public Booking(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	public void enterCity() {
		whereToGoField.sendKeys(city);
	}

	public void click(WebElement element) {
		element.click();
	}

	public boolean bestDisplay() {
		return bestVariants.isDisplayed();
	}

	public boolean compareRaiting(WebElement element) {
		return (Integer.parseInt(element.getText()) >= 9);
	}

}
