package step_definitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import Data.CaseData;
import Data.EmailData;
import Locators.CreateNewCase.locators;
import PageObjects.DashboardPage;
import PageObjects.TeamsPage;
import PageObjects.UsersPage;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Users extends BaseTest {
	public WebDriver driver;

	public Users() throws Exception {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, UsersPage.class);
	}

	CaseData caseData                			= new CaseData();
	EmailData emailData 						= new EmailData();
	UsersPage user 								= PageFactory.initElements(driver, UsersPage.class);
	DashboardPage dashboard 					= PageFactory.initElements(driver, DashboardPage.class);
	ReaderAndWriteDataFromExcel readAndWrite 	= new ReaderAndWriteDataFromExcel();
	String filePath 							= "F://imageneCsi.Automation//src//test//resources//TestData//Files//TestData.xls";
	

	@When("^Click on Add User in Dashbaord$")
	public void click_on_Add_User_in_Dashbaord() throws Throwable {
		user.clickOnAddUser();
	}

	@When("^Select Reporting HQ \"(.*?)\"$")
	public void select_Reporting_HQ(String ReportingHQ) throws Throwable {
		user.selectHQ(ReportingHQ);
	}

	@When("^Select Police Station \"(.*?)\"$")
	public void select_Police_Station(String PoliceStation) throws Throwable {
		user.selecPoliceStation(PoliceStation);
	}

	@When("^Select Ranks \"(.*?)\"$")
	public void select_Ranks(String Rank) throws Throwable {
		user.selectRank(Rank);
	}

	@When("^Select User role \"(.*?)\"$")
	public void select_User(String Role) throws Throwable {
		user.selectRole(Role);
	}

	@When("^Enter Military / Civilian Number$")
	public void enter_Military_Civilian_Number() throws Throwable {
		user.enterMilitryNumber();
	}

	@When("^Enter User Name$")
	public void enter_UserName() throws Throwable {
		user.EnterUserName(EmailData.USERNAME);		
	}
	
	@When("^Enter Users Official Email Id$")
	public void enter_Official_Email_Id() throws Throwable {
		user.EnterUSerMailId(EmailData.USER_EMAIL);
		//readAndWrite.writeUserEmailIDToExcel(EmailData.USER_EMAIL, sheetName, filePath);
	}

	@When("^Enter official Phone Number$")
	public void enter_Official_PhoneNumber() throws Throwable {
		user.EnterPhoneNumber(EmailData.PHONE_NUMBER);
	}
	
	@Then("^Verify created User is displayed in Users List$")
	public void verify_Created_User_is_displayed_in_Dashboard() throws Throwable {
		dashboard.verifyUserNameIsDisplayInDashboard(EmailData.USERNAME);
	}

	@When("^Enter user Email id and click on GoButton$")
	public void enter_userEmail_id_and_click_on_GoButton() throws Throwable {
		//String emailId = readAndWrite.readingExcel(filePath);
		user.EnterusernameInMailinator(/*emailId*/"email480@malinator.com");
		user.clickOnGobtn();
	}

	@Then("^Verify user should get Welcome email$")
	public void verify_user_should_get_Welcome_email() throws Throwable {
		user.verifyWelcomeEmail();
	}

	@Then("^Verify user should get login credentials email$")
	public void verify_user_should_get_login_credentials_email() throws Throwable {
		user.verifLoginEmailandTakeTemporaryPassword();
	}

	@When("^Enter userame and temporay password$")
	public void enter_userame_and_temporay_password() throws Throwable {
		user.EnterusernameAndTemppwd();
	}

	@Then("^Verify User should get into update password screen$")
	public void verify_User_should_get_into_update_password_screen() throws Throwable {
		user.VerifyUpdatePasswordPage();
	}

	@When("^Click on Update button$")
	public void Click_Update_button() throws Throwable {
		user.clickOnUpdateBtn();
	}

	@When("^Enter new password$")
	public void enter_new_password() throws Throwable {
		user.enterNewPassword("Test@123");
	}

	@Then("^Verify User should be able to Dashboard on the screen$")
	public void verify_User_should_be_able_to_Dashboard_on_the_screen() throws Throwable {
		dashboard.verifyDashboardPageIsDisplay();
	}

	@Then("^Click on Admin in Menu$")
	public void click_on_Admin_in_Menu() throws Throwable {
		user.ClickOnAdminMenu();
	}

	@When("^Click on Add Admin sub menu$")
	public void click_on_Add_Admin() throws Throwable {
		user.ClickOnAddAdminButton();

	}

}
