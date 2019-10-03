package PageObjects;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import Data.CaseData;
import Utility.DateAndTimeFunctions;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.When;
import step_definitions.ConfigBrowser;
import Locators.CreateNewCase;
import Locators.CreateNewCase.locators;

public class CreateNewCasePage extends BrowserBot {

	public CreateNewCasePage() throws Exception {
		super(driver);
		driver = ConfigBrowser.driver;
	}

	ReaderAndWriteDataFromExcel readAndWrite    = new ReaderAndWriteDataFromExcel();
	private static final Logger logger          = LogManager.getLogger(LoginPage.class.getName());
	ReadPropertyFiles readPropertyFiles 		= new ReadPropertyFiles();
	String issueDate 							= DateAndTimeFunctions.getCurrentDate("dd-MM-yyyy");
	CaseData caseData 							= new CaseData();

	public void verifyNewCasePage() throws Exception {
		waitForElementAppearance(locators.CREATE_NEW_CASE_PAGE, "css");
		verifyTextIsPresent(locators.CREATE_NEW_CASE_PAGE, "css", "Error Info: Create new Case page is not display");
	}

	public void selectNewCase() throws Exception {
		waitForElementAppearance(locators.NEW_CASE, "css");
		click(locators.NEW_CASE, "css");
	}

	public void enterCaseID(String caseID) throws Exception {
		sendKeys(locators.CASE_ID, "id", caseID);
		//readAndWrite.writeCaseIDToExcel(CaseData.CASE_ID, filePath);
		caseData.writeToTestDataXml(CaseData.CASE_ID, CaseData.CASEID);
		System.out.println(caseID);
		
		
		//user.EnterUSerMailId(CaseData.UserEmail);
		//caseData.writeToTestDataXml(CaseData.UserEmail, CaseData.userEmailId);
	}

	public void enterCaseName(String caseName) throws Exception {
		sendKeys(locators.CASE_NAME, "id", caseName);
	}

	public void verifyCurrentDate(String date) throws Exception {
		String currentDate = getAttributeValue(locators.DATE, "xpath");
		assertEquals(currentDate, date);
	}

	public void verifyInvestigationLead(String invistigationLead) throws Exception {
		System.out.println(locators.INVISTIGATION_LEAD + invistigationLead + locators.CLOSE_XPATH);
		verifyTextIsPresent(locators.INVISTIGATION_LEAD + invistigationLead + locators.CLOSE_XPATH, "xpath", "Error info: ");
	}

	public void selectInvistigationTeam(String invistigationTeam) throws Exception {
		sendKeys(locators.INVISTIGATION_TEAM, "xpath", invistigationTeam);
		waitForElementAppearance(locators.DROUPDOWN_OPTION + invistigationTeam + locators.CLOSE_XPATH, "xpath");
		click(locators.DROUPDOWN_OPTION + invistigationTeam + locators.CLOSE_XPATH, "xpath");
	}

	public void selectComplexity(String complexity) throws Exception {
		sendKeys(locators.COMPLEXITY, "xpath", complexity);
		waitForElementAppearance(locators.DROUPDOWN_OPTION + complexity + locators.CLOSE_XPATH, "xpath");
		click(locators.DROUPDOWN_OPTION + complexity + locators.CLOSE_XPATH, "xpath");
	}

	public void enterDetails(String details) throws Exception {
		sendKeys(locators.DETAILS, "id", details);
	}

	public void clickSave() throws Exception {
		clickByJS(locators.SAVE, "xpath");
	}

	public void selectDocType() throws Exception {
		sendKeys(locators.SELECT_DOC_TYPE, "xpath", "FISHEY");
	}

	public void clickOnProceedButton() throws Exception {
		click(locators.PROCEED_BUTTON, "xpath");
	}

	public void verifyDocumentUploadSucessMsg() throws Exception {
		click(locators.DOC_UPLOAD_SUCESS_MSG, "xpath");
	}

	public void verifyCaseDetailsPageisDisplay(String caseId) throws Exception {
		waitForElementAppearance(locators.CASE_ID +caseId+ CreateNewCase.locators.CLOSE_XPATH, "xpath");		
		verifyTextIsPresent(locators.CASE_ID +caseId+ CreateNewCase.locators.CLOSE_XPATH,"xpath", "Error Info: Case Details page is not dispaly");
	}

	public void enterIOLeadCaseDetails() throws Throwable {
		enterCaseID(CaseData.CASE_ID);		
		enterCaseName(CaseData.CASE_NAME);
		verifyCurrentDate(issueDate);
		//createCase.verifyInvestigationLead(caseData.invistigation_lead);
		selectInvistigationTeam(CaseData.INVISTIGATION_TEAM);
		selectComplexity(CaseData.COMPLEXITY);
		enterDetails(CaseData.Details);

		
	}
	
	/*public void enterReportingLeadCaseDetails() throws Throwable {
		enterCaseID(CaseData.CASE_ID);		
		enterCaseName(CaseData.CASE_NAME);
		verifyCurrentDate(issueDate);
		String invistigationLead = readAndWrite.readingExcel(filePath);
		selectInvestigationLead(invistigationLead);
		selectInvistigationTeam(CaseData.INVISTIGATION_TEAM);
		selectComplexity(CaseData.COMPLEXITY);
		enterDetails(CaseData.Details);
		clickSave();
	}*/
	
	public void selectInvestigationLead(String leadName) throws Exception {
		sendKeys(locators.INVISTIGATION_LEAD, "xpath", leadName);
		waitForElementAppearance(locators.DROUPDOWN_OPTION + leadName + locators.CLOSE_XPATH, "xpath");
		click(locators.DROUPDOWN_OPTION + leadName + locators.CLOSE_XPATH, "xpath");
	}

}
