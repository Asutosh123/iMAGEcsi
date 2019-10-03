package PageObjects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Data.CaseData;
import Data.EmailData;
import step_definitions.ConfigBrowser;
import Locators.Login.locators;
import Utility.ReaderAndWriteDataFromExcel;

public class LoginPage extends BrowserBot {

	public LoginPage(WebDriver driver) throws Exception {
		super(driver);
		driver = ConfigBrowser.driver;
	}
	ReaderAndWriteDataFromExcel readAndWrite    = new ReaderAndWriteDataFromExcel();
	private static final Logger logger          = LogManager.getLogger(LoginPage.class.getName());
	
	String filePath 							= "F://imageneCsi.Automation//src//test//resources//TestData//Files//TestData.xls";

	public void UserEntersAdminUserNameAndPassword() throws Exception {				
		sendKeys(locators.EMAIL_ID, "id", EmailData.USER_EMAIL);
		sendKeys(locators.PASSWORD, "id", EmailData.PASSWORD);
		
	}
	
	public void entersITConfigUserNameAndPassword(String userName, String password) throws Exception {				
		sendKeys(locators.EMAIL_ID, "id", userName);
		sendKeys(locators.PASSWORD, "id", password);
		
	}
	public void UserEntersUsernamePassword(String username, String password) throws Exception {
		sendKeys(locators.EMAIL_ID, "id", username);
		sendKeys(locators.PASSWORD, "id", password);
		logger.info("Sucessfully entered Username is " + username + "and Password is " + password);
	}

	public void clickonLogin() throws Exception {
       click(locators.LOGIN, "xpath");
       logger.info("Clicked on Login");
	}

	public void clickonlogout() throws Exception {
		waitForElementAppearance(locators.LOGOUT, "xpath");
		 click(locators.LOGOUT, "xpath");
	}

	public void VerifyLogout() throws Exception {
		waitForElementAppearance(locators.LOGOUT, "xpath");
		verifyTextIsPresent(locators.LOGOUT_SUCCESS_MESSAGE, "xpath", "Error info: Logout is not success");
	}

	public void verifyhomepage() throws Exception {
		waitForElementAppearance(locators.HOME_PAGE, "xpath");
		verifyTextIsPresent(locators.HOME_PAGE, "xpath", "Error info: Home page is not display");
	}

	public void enterAdminUserNamePassword() throws Exception {
		String adminUserName = readAndWrite.readingExcel(filePath);
		String adminPassword = readAndWrite.readingExcel(filePath);
		waitForElementAppearance(locators.EMAIL_ID, "id");
		sendKeys(locators.EMAIL_ID, "id", adminUserName);
		sendKeys(locators.EMAIL_ID, "id", adminPassword);

	}

}
