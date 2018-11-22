package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingPageObject {
	private WebDriver webdriver;
	private static final int LINK_PRESENSE_TIMEOUT = 20;

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

	@FindBy(xpath = "//a[contains(.,'Оценка по отзывам и цена')]")
	public WebElement sortByPriceAndFeedback;

	@FindBy(xpath = "(.//a[@class='hotel_name_link url'])[1]")
	public WebElement firstFoundedHotel;

	@FindBy(xpath = "//a[text()='Великолепное расположение — показать на карте']")
	public WebElement waitForElement;

	@FindBy(xpath = "(//div[@aria-label='10'])[1]")
	public WebElement raiting;

	@FindBy(xpath = "(//span[@class='b-button__text'])[1]")
	public WebElement buttonToOpenHotel;

	@FindBy(xpath = "//span[@xpath='1']")
	public WebElement hotelList;

	@FindBy(xpath = ".//*[@id='utag_59_iframe")
	public WebElement frameToWait;

	@FindBy(xpath = ".//div [@class=\"sr-usp-overlay sr-usp-overlay--wide\"]")
	public WebElement notDisplayedElementToWait;

	public BookingPageObject(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	public void enterCity(String city) {
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

	public void waiting() {
		(new WebDriverWait(webdriver, LINK_PRESENSE_TIMEOUT))
				.until(ExpectedConditions.invisibilityOfAllElements(frameToWait));
		(new WebDriverWait(webdriver, LINK_PRESENSE_TIMEOUT))
				.until(ExpectedConditions.invisibilityOfAllElements(notDisplayedElementToWait));
	}

	public void clickWithWaiting() {
		sortByPriceAndFeedback.click();
	}
}
