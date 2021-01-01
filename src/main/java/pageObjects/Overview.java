package pageObjects;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;

public class Overview {

	public WebDriver driver;
	
	@FindBy(xpath="(//a[text()='Start Now'])[1]")
	WebElement Start_Now;
	
	@FindBy(id="email")
	WebElement eMail;
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(xpath="(//button[@type='submit' and text()='Update'])[1]")
	WebElement updateName;
	
	@FindBy(id="currentPassword")
	WebElement crrntPsswrd;
	
	@FindBy(id="newPasswordField")
	WebElement newPsswrd;
	
	@FindBy(id="confirmPassword")
	WebElement cnfrmPsswrd;
	
	@FindBy(xpath="(//button[@type='submit' and text()='Update'])[3]")
	WebElement updatePsswrd;
	
	@FindBy(xpath="(//a[text()='Addresses'])[1]")
	WebElement Address;
	
	@FindBy(xpath="//div[@class='center']")
	WebElement Addressplus;
	
	@FindBy(id="addressLine1")
	WebElement Street;
	
	@FindBy(id="city")
	WebElement City;
	
	@FindBy(id="state-button")
	WebElement State;

	@FindBy(id="zip")
	WebElement Zip;
	
	@FindBy(xpath="//button[text()='CA']")
	WebElement Ca;
	
	@FindBy(xpath="//button[@type='submit' and text()='Add Address']")
	WebElement addAddrss;
	
	@FindBy(id="signin-email")
	WebElement signInMail;
	
	@FindBy(id="signin-password")
	WebElement signInPsswrd;
	
	@FindBy(id="signin-submit")
	WebElement signInSubmit;
	
	@FindBy(xpath="//div[@class=\"cell large-11 small-10 GlobalNotification_1Kdgun\"]//p[1]")
	WebElement toastMessage;
	
	@FindBy(xpath="//button[text()='Use Address as Entered']")
	WebElement addrssToastMssg;
	
	@FindBy(xpath="//span[@class='flex-auto']")
	WebElement useAddress;
	
	public Overview(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickStartNow()
	 {
		Start_Now.click(); 
	 }
	
	  public void setFname(String fName)
	 {
		 firstName.clear();
		 firstName.sendKeys(fName);
	 }
	 
	 public void setLname(String lName)
	 {
		 lastName.clear();
		 lastName.sendKeys(lName);
	 }
	 
	 public void updatename()
	 {
	     updateName.click();
	 }
	 
	public void setCrrntPsswrd(String cpsswrd)
	{
		crrntPsswrd.clear();
		crrntPsswrd.sendKeys(cpsswrd);
	}
	
	public void setNewPsswrd(String npsswrd)
	{
		newPsswrd.clear();
		newPsswrd.sendKeys(npsswrd);
	}
	
	public void setCnfrmPsswrd(String cnfrmpsswrd)
	{
		cnfrmPsswrd.clear();
		cnfrmPsswrd.sendKeys(cnfrmpsswrd);
	}
	
	 public void updatepsswrd()
	 {
		 updatePsswrd.click();
	 }
	 
	 public void navigateToAddrss()
	 {
		 Address.click();
		 Addressplus.click();
	 }
	 
	 public void useAddress()
	 {
		 useAddress.click();
	 }
	 
	 public void updateStreetCityStateZip(String Strt, String Cty,String Zp)
	 {
		 Street.clear();
		 Street.sendKeys(Strt);
		 City.clear();
		 City.sendKeys(Cty);
		 updateState();
		 Zip.clear();
		 Zip.sendKeys(Zp); 
	 }
	 
	 public void updateState()
	 {
		 State.click();
		 Ca.click();
	 }
	 
	 public void saveAddress()
	 {
		 addAddrss.click();
	 }
	 
	 public void signIn(String sMail,String sPsswrd)
		{
			signInMail.clear();
			signInPsswrd.clear();
			
			signInMail.sendKeys(sMail);
			signInPsswrd.sendKeys(sPsswrd);
			
			signInSubmit.click();
		}
	
	 public String getToastMessage()
		{
			return(toastMessage.getText());
		}
	 
	 public String getAddrssToast()
	 {
		 return(addrssToastMssg.getText()); 
	 }
	 
	
}
