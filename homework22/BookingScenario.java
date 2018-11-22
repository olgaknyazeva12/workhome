package pack;

import static org.junit.Assert.*;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingScenario {

	private static final String MAIN_URL = "https://www.booking.com";
	private String cityForSearch = "Москва";
	public WebDriver driver;
	public BookingPageObject book;

	public BookingScenario() {
		driver = new ChromeDriver();
		book = new BookingPageObject(driver);
	}

	@Given("^I am on main application page$")
	public void loadBookingSite() {
		driver.manage().window().fullscreen();
		driver.get(MAIN_URL);
	}

	@When("^I enter city name into the search field$")
	public void enterYourCity() {
		book.enterCity(cityForSearch);
	}

	@When("^I click the count field for adults and children$")
	public void clickFieldForAdultsAndChildren() {
		book.click(book.countField);
	}

	@When("^I choose 2 adults$")
	public void chooseAdults() {
		Select oSelect1 = new Select(book.adult);
		oSelect1.selectByIndex(1);
	}

	@When("^I choose 1 room$")
	public void chooseRooms() {
		Select oSelect1 = new Select(book.room);
		oSelect1.selectByIndex(1);
	}

	@When("^I click the calendar$")
	public void clickCalendar() {
		book.click(book.calendar);
	}

	@When("^I choose a start date$")
	public void chooseStartDate() {
		book.click(book.firstDate);
	}

	@When("^I choose an end day$")
	public void chooseEndDate() {
		book.click(book.secondDate);
	}

	@When("^I click the search button$")
	public void clickSearch() {
		book.click(book.findHotels);
	}

	@When("^I sort hotels by price and feedback$")
	public void clickSortByPriceAndFeedback() {
		book.click(book.sortByPriceAndFeedback);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@When("I open the first hotel$")
	public void chooseTheFirstHotel() {
		book.click(book.buttonToOpenHotel);
	}

	@Then("I see various of hotels for entered city")
	public void seeLogoutLink() {
		assertTrue(book.bestDisplay());
	}

	@Then("I confirm that rate >= 9")
	public void seeLogoutLinkForScenario2() {
		assertTrue(book.compareRaiting(book.raiting));
	}

	@After
	public void after() {
		driver.close();
	}
}
