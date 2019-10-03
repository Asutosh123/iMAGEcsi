package PageObjects;

import java.awt.AWTException;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Data.CaseData;
import Locators.Users.locators;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import step_definitions.ConfigBrowser;

public class UsersPage extends BrowserBot {

	public UsersPage(WebDriver driver) {
		super(driver);
		driver = ConfigBrowser.driver;
	}
	private static final Logger logger = LogManager.getLogger(UsersPage.class.getName());
	public String teamname;
	public String emailid;
	public String temppwd;
	public static String userName;
	public static String Pwd;

	public void clickOnAddUser() throws Exception {
		click(locators.ADD_USER, "xpath");
	}

	public void VerifyAddUserpage() throws Exception {
		isElementPresent(locators.ADD_USER_HEADER, "xpath");
	}

	public void selectHQ(String ReportingHQ) throws Exception {
		sendKeys(locators.SELECT_HQ, "xpath", ReportingHQ);
		clickByEnterKey(locators.SELECT_HQ, "xpath");
	}

	public void selecPoliceStation(String PoliceStation) throws Exception {
		sendKeys(locators.SELECT_POLICE_STATION, "xpath", PoliceStation);
		clickByEnterKey(locators.SELECT_POLICE_STATION, "xpath");
	}

	public void enterMilitryNumber() throws Exception {
		typeRandomNumbers(locators.SELECT_MILITRY_NUMBER, "xpath", "MiltaryNum", 5);
	}

	public void selectRole(String Role) throws Exception {
		sendKeys(locators.SELECT_ROLE, "xpath", Role);
		clickByEnterKey(locators.SELECT_ROLE, "xpath");
	}

	public void selectRank(String Rank) throws Exception {
		sendKeys(locators.RANK, "xpath", Rank);
		clickByEnterKey(locators.RANK, "xpath");
	}

	public void EnterUserName(String username) throws Exception {
		sendKeys(locators.USER_NAME, "xpath", username);
	}

	public void EnterUSerMailId(String Email) throws Exception {
		sendKeys(locators.EMAIL, "xpath", Email);
	}

	public void EnterPhoneNumber(String Email) throws Exception {
		sendKeys(locators.PHONE_NUMBER, "id", Email);
	}
	
	public void EnterusernameInMailinator(String useremailid) throws Exception {
		sendKeys(locators.EnterEmailIdMailinator, "xpath", useremailid);
	}

	public void clickOnGobtn() throws Exception {
		click(locators.GO_BUTTON, "xpath");
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
	}

	public void verifyWelcomeEmail() throws Exception {
		waitForElementAppearanceLongTime(locators.WELCOME_EMAIL, "xpath");
		isElementPresent(locators.WELCOME_EMAIL, "xpath");
		logger.info("Sucessfully Verified  Welcome Email for the new user");
		// click(locators.WELCOME_EMAIL, "xpath");
	}

	public void verifLoginEmailandTakeTemporaryPassword() throws Exception {
		isElementPresent(locators.lOGIN_DETAILS_EMAIL, "xpath");
		click(locators.lOGIN_DETAILS_EMAIL, "xpath");
		logger.info("Sucessfully Verified  USer recevied Login Details Email");
		switchToFrameById("msg_body");
		temppwd = getText(locators.TEMP_PASSWORD, "xpath");
		System.out.println(temppwd);
		Pwd = temppwd;
		String uname = getText(locators.Usrenamefrommailinator, "xpath");
		System.out.println(uname);
		userName = uname;
	}

	public void EnterusernameAndTemppwd() throws Exception {
		sendKeys(Locators.Login.locators.EMAIL_ID, "id", userName);
		sendKeys(Locators.Login.locators.PASSWORD, "id", Pwd);
	}

	public void VerifyUpdatePasswordPage() throws Exception {
		isElementPresent(locators.UPDATE_PASSWORD_PAGE, "xpath");
	}

	public void enterNewPassword(String newPwd) throws Exception {
		waitForElementAppearance(locators.NEW_PASSWORD, "id");
		sendKeys(locators.NEW_PASSWORD, "id", newPwd);
		sendKeys(locators.CONFIRM_PASSWORD, "id", newPwd);
	}

	public void clickOnUpdateBtn() throws Exception {
		click(locators.UPDATE_BUTTON, "xpath");
	}

	public void ClickOnAdminMenu() throws Exception {
		click(Locators.Menus.locators.ADMIN, "xpath");
	}

	public void ClickOnAddAdminButton() throws Exception {
		click(Locators.Menus.locators.ADD_ADMIN, "xpath");
	}

}
