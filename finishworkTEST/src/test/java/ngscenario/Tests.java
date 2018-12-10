package ngscenario;

import ngscenariopack.MailSearchCafe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.allure.annotations.Attachment;

public class Tests {
	public MailSearchCafe searchCafe;
	private static final String MAIN_URL = "http://mail.ru";
	final int TIME_FOR_IMPLICITLY_WAIT = 10;

	private WebDriver webDriver;

	public Tests() {
		webDriver = new ChromeDriver();
		searchCafe = new MailSearchCafe(webDriver);

	}

	@Given("^I am on the main application page$")
	public void launchMail() {

		webDriver.manage().window().fullscreen();
		webDriver.manage().timeouts().implicitlyWait(TIME_FOR_IMPLICITLY_WAIT, TimeUnit.SECONDS);
		webDriver.get(MAIN_URL);

	}

	@When("^I fill in the search field text to find list of cafe sites$")
	public void enterSearchForCinemaSiteText() {
		searchCafe.enterSearchText();

	}

	@When("^ I click search button$")
	public void clickSearchButton() {
		searchCafe.clickElement();

	}

	@Then("^I see the first site in the result search list$")
	public void checkCafeIsFound() {
		assertTrue(searchCafe.elementIsDisplayed());
		makeScreenshot();
	}

	@Attachment(value = "Attachment Screenshot", type = "image/png")
	public byte[] makeScreenshot() {
		return ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);

	}

	@After
	public void afterClass() {
		makeScreenshot();
		webDriver.quit();
	}
}
