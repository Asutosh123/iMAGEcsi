package PageObjects;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Locators.CaseDetails;
import Locators.CreateNewCase;
import Locators.Dashboard;
import Locators.Dashboard.locators;

import Utility.ReaderAndWriteDataFromExcel;
import step_definitions.ConfigBrowser;

public class DashboardPage extends BrowserBot {

	public DashboardPage(WebDriver driver) throws Exception{
		super(driver);

		driver = ConfigBrowser.driver;
	}

	private static final Logger logger = LogManager.getLogger(LoginPage.class.getName());
	ReaderAndWriteDataFromExcel txtFileWriter = new ReaderAndWriteDataFromExcel();
	
	
	public void selectNewCase() throws Exception {
		waitForElementAppearance(locators.NEW_CASE, "css");
		click(locators.NEW_CASE, "css");
	}

	public void verifyiCaseID(String caseID) throws Exception {
		waitForElementAppearance(locators.CASEID +caseID+ locators.CLOSE_XPATH, "xpath");
		verifyTextIsPresent(locators.CASEID +caseID+ locators.CLOSE_XPATH, "xpath", "Error Info: Case Id is not display");
	}

	public void selectViewDetails(String caseID) throws Exception {
     click(locators.VIEW_DETAILS_PART1 +caseID+ locators.VIEW_DETAILS_PART2, "xpath");
	}
	
	public void verifyDashboardPageIsDisplay() throws Exception {
		waitForElementAppearance(locators.DASHBOARD , "xpath");
		verifyTextIsPresent(locators.DASHBOARD, "xpath", "Error Info: Dashboard page is not display");
	}

	public void verifyCaseStatus(String caseID, String status) throws Exception {
		waitForElementAppearance(locators.DRAFT_STATUS_PART1 +caseID+ locators.DRAFT_STATUS_PART2, "xpath");
		String fullStatus[] = getText(locators.DRAFT_STATUS_PART1 +caseID+ locators.DRAFT_STATUS_PART2, "xpath").split(":");
		String actualStatus = fullStatus[fullStatus.length -1];
        assertEquals(actualStatus, status);
	}
	
	public void clickOnViewDetailsButton(String caseId) throws Exception {
		waitForElementAppearance(locators.VIEW_DETAILS_PART1 +caseId+ locators.VIEW_DETAILS_PART2, "xpath");
		click(locators.VIEW_DETAILS_PART1 +caseId+ locators.VIEW_DETAILS_PART2, "xpath");
	}

	public void verifyAssignedCaseID(String caseId) throws Exception {
		waitForElementAppearance(locators.CASE_ID +caseId+ CreateNewCase.locators.CLOSE_XPATH, "xpath");
		verifyTextIsPresent(locators.CASE_ID +caseId+ CreateNewCase.locators.CLOSE_XPATH, "xpath", "Error Info: Assigned Case Id is not display");
	}
	
	public void verifyCaseIsNotDisplay(String caseID) throws Exception {
		verifyTextIsNotPresent(Dashboard.locators.DRAFT_STATUS_PART1 + caseID + Dashboard.locators.DRAFT_STATUS_PART2,
				"xpath", "case is dispaled in dashbaord");
	}
	
	public void verifyUserNameIsDisplayInDashboard(String userName) throws Exception {
		waitForElementAppearance(locators.USER_NAME +userName+ CreateNewCase.locators.CLOSE_XPATH, "xpath");
		verifyTextIsPresent(locators.USER_NAME +userName+ CreateNewCase.locators.CLOSE_XPATH, "xpath", "Error Info: User Name is not display");		
	}
}
