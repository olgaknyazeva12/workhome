package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Methods {
	@FindBy(id = "mailbox:login")
	private WebElement loginField;

	@FindBy(id = "mailbox:password")
	private WebElement emailField;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement buttonEnter;

	@FindBy(xpath = "//a[@id='PH_logoutLink']")
	public WebElement logoutLink;

	@FindBy(xpath = "(//div[@class='b-checkbox__box'])[2]")
	public WebElement firstMessage;
	@FindBy(xpath = "(//span[text()='Спам'])[3]")
	public WebElement spamOption;

	@FindBy(xpath = "(//span[text()='Спам'])[1]")
	public WebElement spamButton;

	@FindBy(xpath = "(//div[@class='b-checkbox__box'])[8]")
	public WebElement notSpamCheckBox;

	@FindBy(xpath = "(//span[text()='Не спам'])[1]")
	public WebElement notSpamButton;

	@FindBy(xpath = "//span[text()='Написать письмо']")
	public WebElement writeLetterButton;

	@FindBy(xpath = "//textarea[@data-original-name='To']")
	public WebElement fieldTo;

	@FindBy(xpath = "//iframe[@id='toolkit-154246867834156composeEditor_ifr']")
	public WebElement fieldText;

	@FindBy(xpath = "//span[text()='Отправить']")
	public WebElement sendButton;

	@FindBy(xpath = "//span[text()='Открытки']")
	public WebElement cards;

	@FindBy(xpath = "(//div[@class='compose__decoration__slider__item__inner compose__decoration__slider__item__inner_big'])[2]")
	public WebElement card;

	@FindBy(xpath = "//a[text()='Перейти во Входящие']")
	public WebElement inputOption;

	@FindBy(xpath = "(//div[@class='b-dropdown__arrow'])[2]")
	public WebElement allCheck;

	@FindBy(xpath = "//a[@data-text='Выделить все письма']")
	public WebElement allLetters;

	@FindBy(xpath = "(//div[@class='b-dropdown__arrow'])[6]")
	public WebElement moreDropdown;

	@FindBy(xpath = "//span[text()='Пометить флажком']")
	public WebElement flag;

	@FindBy(xpath = "//span[text()='Снять флажок']")

	public WebElement noFlag;

	@FindBy(xpath = "(//div[@class='b-checkbox__box'])[1]")
	public WebElement allCheckbox;

	public Methods(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
	}

	public void enterLoginAndPass(String login, String password) {
		loginField.clear();
		loginField.sendKeys(login);
		emailField.clear();
		emailField.sendKeys(password);
	}

	public void clickEnterButton() {
		buttonEnter.click();
	}

	public void clickFirstCheckBox() {
		firstMessage.click();
	}

	public void clickSpam() {
		spamButton.click();
	}

	public void clickNotSpamCheckBox() {
		notSpamCheckBox.click();
	}

	public void clickNotSpamButton() {
		notSpamButton.click();
	}

	public void clickSpamOption() {
		spamOption.click();
	}

	public void clickWriteLetter() {
		writeLetterButton.click();
	}

	public void enterEmail() {
		fieldTo.sendKeys("olya.knyaz1997@mail.ru");
		fieldTo.sendKeys("  ");
		fieldTo.sendKeys("olya.knyaz1997@gmail.com");
		fieldTo.click();
	}

	public void clickSendButton() {
		sendButton.click();
	}

	public void clickCards() {
		cards.click();
	}

	public void chooseCard() {
		card.click();
	}

	public void inputClickOption() {
		inputOption.click();
	}

	public void all() {
		allCheck.click();
	}

	public void allSelect() {
		allLetters.click();
	}

	public void clickMore() {
		moreDropdown.click();
	}

	public void tickFlag() {
		flag.click();
	}

	public void tickNoFlag() {
		noFlag.click();
	}

}
