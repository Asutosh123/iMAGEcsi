package step_definitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import Data.EmailData;
import PageObjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends BaseTest {

	public WebDriver driver;

	public Login() {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, LoginPage.class);

	}

	LoginPage login = PageFactory.initElements(driver, LoginPage.class);

	@Given("^User navigates to iMAGENEcsi portal login page$")
	public void user_navigates_to_the_login_page() throws Throwable {

		navigate("imgcsIDev");
		waitForPageToLoad();
	}

	@Given("^User navigates to iMAGENEcsi SIT portal login page$")
	public void user_navigates_to_the_SIT_page() throws Throwable {
		navigate("imgcsiSIT");
		waitForPageToLoad();
	}
	
	@Given("^User navigates to Mailinator\\.com$")
	public void user_navigates_to_Mailinator_com() throws Throwable {
		navigate("malinator");
	}
	
	@Then("^Verify the title of the imagenecsi application$")
	public void verify_the_title_of_the_imagenecsi_application() throws Throwable {
		//login.verifyTitle();
	}
	

	@When("^IO Lead enters \"(.*?)\" and \"(.*?)\" in login page$")
	public void io_lead_enters_and_to_login_page(String username, String password) throws Throwable {
		login.UserEntersUsernamePassword(username, password);

	}
	@When("^User clicks on Logout button$")
	public void User_clicks_on_logout_button() throws Throwable {
		login.clickonlogout();		 
	}
	@When("^User click on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		login.clickonLogin();
	}

	@Then("^Verify Io lead is able to see home page Sucessfully$")
	public void verify_Io_lead_is_able_to_see_home_page() throws Throwable {
		login.verifyhomepage();

	}

	@When("^IO Member enters \"(.*?)\" and \"(.*?)\" to login page$")
	public void io_Member_enters_and_to_login_page(String username, String password) throws Throwable {
		login.UserEntersUsernamePassword(username, password);

	}

	@Then("^Verify Io Member is able to see home page Sucessfully$")
	public void verify_Io_Member_is_sucessfully_to_see_home_page() throws Throwable {
		login.verifyhomepage();

	}

	@When("^Reporting Lead enters \"(.*?)\" and \"(.*?)\" to login page$")
	public void reporting_Lead_enters_and_to_login_page(String username, String password) throws Throwable {
		login.UserEntersUsernamePassword(username, password);
	}

	@When("^Reporting Member enters \"(.*?)\" and \"(.*?)\" to login page$")
	public void reporting_Member_enters_and_to_login_page(String username, String password) throws Throwable {
		login.UserEntersUsernamePassword(username, password);
	}

	@When("^Admin enters \"(.*?)\" and \"(.*?)\" to login page$")
	public void admin_enters_and_to_login_page(String username, String password) throws Throwable {
		login.UserEntersUsernamePassword(username, password);
	}

	@Then("^Verify Reporting Member is able to see home page Sucessfully$")
	public void verify_Reporting_Member_is_sucessfully_to_see_home_page() throws Throwable {
		login.verifyhomepage();	
	}

	@Then("^Verify Admin Lead is able to see home page Sucessfully$")
	public void verify_Admin_Lead_is_sucessfully_to_see_home_page() throws Throwable {
		login.verifyhomepage();
	}

	@When("^User enters Invalid Username \"(.*?)\" and password \"(.*?)\"$")
	public void user_enters_Invalid_Username_and_password(String username, String password) throws Throwable {

		login.UserEntersUsernamePassword(username, password);
	}

	@Then("^Verify Invalid should not be sucessfully loggd in and should see error message$")
	public void verify_Invalid_should_not_be_sucessfully_loggd_in_and_should_see_error_message() throws Throwable {
		//login.verifyinvalidlogin();

	}
	@When("^IT Config enters \"(.*?)\" and \"(.*?)\" to login page$")
	public void itconfig_enters_and_to_login_page(String username, String password) throws Throwable {
		login.UserEntersUsernamePassword(username, password);
	    
	}

	@Then("^Verify IT Config is able to see home page Sucessfully$")
	public void verify_IT_Config_is_able_to_see_home_page_Sucessfully() throws Throwable {
		login.verifyhomepage();
	   
	}

}
