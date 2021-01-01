package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//span[text()='Sign In'])[1]")
	WebElement SignIn;

	@FindBy(xpath="(//a[@data-click='close'])[4]")
	WebElement closePopUp;

	@FindBy(id="signin-email")
	WebElement mailID;

	@FindBy(id="signin-password")
	WebElement passWord;

	@FindBy(id="signin-submit")
	WebElement signIn;

	@FindBy(xpath="//a[text()='Create an Account']")
	WebElement Accnt;

	@FindBy(id="registration-email")
	WebElement mailID2;

	@FindBy(id="newPasswordField")
	WebElement passWord2;

	@FindBy(id="registration-firstName")
	WebElement firstName;

	@FindBy(id="registration-lastName")
	WebElement lastName;

	@FindBy(id="registration-mobilePh")
	WebElement mobileNumber;

	@FindBy(xpath="//label[@for='checkbox-4']")
	WebElement addToMailListcBox;

	@FindBy(xpath="//label[@for='checkbox-4']")
	WebElement keepMeSignedIncbox;

	@FindBy(id="registration-submit")
	WebElement createAccount;

	public HomePage(WebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	public void closePopUp()
	{
	closePopUp.click();
	}
	
	public void clickSignIn()
	{
	SignIn.click();
	}

	public void clickNewAccount()
	{
	Accnt.click();
	}
	
	public void createAccount()
	{
	mailID2.sendKeys("alabama@grr.la");
	passWord2.sendKeys("Alabama@1");
	firstName.sendKeys("Harry");
	lastName.sendKeys("Potter");
	mobileNumber.sendKeys("1234567890");
	}
	
	public void saveAccount()
	{
	createAccount.click();
	}

}
