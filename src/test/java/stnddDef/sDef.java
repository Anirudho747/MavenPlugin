package stnddDef;

import pageObjects.HomePage;
import pageObjects.Overview;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class sDef {
	
	WebDriver driver ;
	HomePage hp;
	Overview ov;
	
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.buybuybaby.com/");
		driver.manage().timeouts().implicitlyWait(250,TimeUnit.SECONDS);
	}
	
	@Given("user is at Home Page")
	public void user_is_at_home_page() {
		org.junit.Assert.assertEquals("https://www.buybuybaby.com/", driver.getCurrentUrl());
	}

	@Given("they close the pop-up")
	public void they_close_the_pop_up() throws InterruptedException {
		hp = new HomePage(driver);
		Thread.sleep(2500);
		//hp.closePopUp();
	}

	@When("they click on the Sign-in Button")
	public void they_click_on_the_sign_in_button() {
	    hp.clickSignIn();
	}

	@Then("they are redirected to the Sign-in Page")
	public void they_are_redirected_to_the_sign_in_page() {
		org.junit.Assert.assertEquals("https://www.buybuybaby.com/store/account/Login", driver.getCurrentUrl());
		ov = new Overview(driver);
	}

	@When("user clicks on Create Account Button")
	public void user_clicks_on_create_account_button() {
		hp.clickNewAccount();
	}

	@Then("user is redirected to Create Account Page")
	public void user_is_redirected_to_create_account_page() {
		org.junit.Assert.assertEquals("https://www.buybuybaby.com/store/account/Registration", driver.getCurrentUrl());
	}

	@When("user provide valid Values")
	public void user_provide_valid_values() {
		hp.createAccount();
	}

	@When("clicks on Create An Account Page")
	public void clicks_on_create_an_account_page() {
		hp.saveAccount();
	}

	@Then("the user will be redirected to Account overview Page")
	public void the_user_will_be_redirected_to_account_overview_page() throws InterruptedException {
		Thread.sleep(2500);
		org.junit.Assert.assertEquals("https://www.buybuybaby.com/store/account/myaccount", driver.getCurrentUrl());
	}
	
	@When("user provides their credentials and clicks on Login Button")
	public void user_provides_their_credentials_and_clicks_on_login_button() {
	 ov.signIn("alabama@grr.la","Alabama@5");   
	}

	@Then("user is redirected to Account Overview Page")
	public void user_is_redirected_to_account_overview_page() throws InterruptedException {
		Thread.sleep(2500);
		org.junit.Assert.assertEquals("https://www.buybuybaby.com/store/account/myaccount", driver.getCurrentUrl());
	}


	@When("User clicks on start setting up challenge questions button")
	public void user_clicks_on_start_setting_up_challenge_questions_button() {
	    ov.clickStartNow();
	}

	@When("provides alternate values for first and Last name")
	public void provides_alternate_values_for_first_and_last_name() {
	    ov.setFname("Shruti");
	    ov.setLname("Saundriyal");
	}

	@When("clicks on update button")
	public void clicks_on_update_button() {
	    ov.updatename();
	}

	@Then("user should get proper message")
	public void user_should_get_proper_message() {
		org.junit.Assert.assertEquals("User Profile has been updated successfully.", ov.getToastMessage());
	}
	
	@When("user provides old Password")
	public void user_provides_old_password() {
	    ov.setCrrntPsswrd("Alabama@4");
	}

	@When("user enters New password and Confirm Password")
	public void user_enters_new_password_and_confirm_password() {
		ov.setNewPsswrd("Alabama@5");
		ov.setCnfrmPsswrd("Alabama@5");
		ov.updatepsswrd();
	}

	@Then("user should get proper message for Password reset")
	public void user_should_get_proper_message_for_password_reset() {
		org.junit.Assert.assertEquals("Password Changed Successfully.", ov.getToastMessage());
	}
	
	@When("user clicks on Addresses")
	public void user_clicks_on_addresses() {
	    ov.navigateToAddrss();
	}

	@When("provides Street Address, City, State and Zip")
	public void provides_street_address_city_state_and_zip() {
	    ov.updateStreetCityStateZip("Strt", "City", "12345");
	}

	@When("clicks on Add Address")
	public void clicks_on_add_address() {
	    ov.saveAddress();
	    
	}

	@Then("user should gets pop-up to verify Address")
	public void user_should_gets_pop_up_to_verify_address() throws InterruptedException {
		//ov.useAddress();
		//Thread.sleep(3400);
	}

	@When("user clicks on Add Address as is button")
	public void user_clicks_on_add_address_as_is_button() {	
		//org.junit.Assert.assertEquals("Success! You've created a new address.", ov.getAddrssToast());
	}
}
