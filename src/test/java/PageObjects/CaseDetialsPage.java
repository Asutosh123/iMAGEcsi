package PageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import Locators.CaseDetails.locators;
import Locators.CreateNewCase;
import Locators.Dashboard;
import step_definitions.ConfigBrowser;

public class CaseDetialsPage extends BrowserBot {

	public CaseDetialsPage(WebDriver driver) {
		super(driver);
		driver = ConfigBrowser.driver;
	}

	public void verifyCaseDetailsPageisDisplay(String caseId) throws Exception {
		waitForElementAppearance(locators.CASE_DETAILS_PAGE, "xpath");
		waitForElementAppearance(locators.CASE_ID + caseId + CreateNewCase.locators.CLOSE_XPATH, "xpath");
		verifyTextIsPresent(locators.CASE_ID + caseId + CreateNewCase.locators.CLOSE_XPATH, "xpath",
				"Error Info: Case Details page is not dispaly");
	}

	public void verifyErrorMessageForFishEyeImages() throws Exception {
		waitForElementAppearance(locators.MIN_FISHEYE_VALIDATION_MSG, "xpath");
		verifyTextIsPresent(locators.MIN_FISHEYE_VALIDATION_MSG, "xpath", "Error Info: Error message is not dispaly");
	}

	public void selectSubmitButton() throws Exception {
		waitForElementAppearance(locators.SUBMIT, "xpath");
		clickByJS(locators.SUBMIT, "xpath");
	}

	public void selectFishEyeImages(String imageCount) throws Exception {
		waitForElementAppearance(locators.FISHEYE_IMAGES_COUNT_PART1 + imageCount + locators.FISHEYE_IMAGES_COUNT_PART2,
				"xpath");
		clickByJS(locators.FISHEYE_IMAGES_COUNT_PART1 + imageCount + locators.FISHEYE_IMAGES_COUNT_PART2, "xpath");
	}

	public void verifyUploadedFishEyeImages(String[] imagesName) throws Exception {
		for (int i = 0; i < imagesName.length; i++) {
			waitForElementAppearance(locators.IMAGE_NAME_PART1 + i + CreateNewCase.locators.CLOSE_XPATH, "xpath");
			verifyTextIsPresent(locators.IMAGE_NAME_PART1 + i + CreateNewCase.locators.CLOSE_XPATH, "xpath",
					"Uploaded images are not display");
		}
	}

	public void clickOnUploadButton() throws Exception {
		waitForElementAppearance(locators.UPLOAD_BUTTON, "xpath");
		click(locators.UPLOAD_BUTTON, "xpath");
	}

	public void clickSubmit() throws Exception {
		waitForElementAppearance(locators.SUBMIT, "xpath");
		waitForElementToBeClickable(locators.SUBMIT, "xpath");
		clickByJS(locators.SUBMIT, "xpath");
	}

	public void clickProcessed() throws Exception {
		waitForElementToBeClickable(locators.PROCESSED, "xpath");
		clickByJS(locators.PROCESSED, "xpath");
		waitForElementAppearance(locators.THANK_YOU_FOR_SUBMITTING, "xpath");
		verifyTextIsPresent(locators.THANK_YOU_FOR_SUBMITTING, "xpath",
				"Error info: success message is not display in the top");
	}

	public void clickAssign() throws Exception {
		waitForElementAppearance(locators.ASSIGN, "xpath");
		click(locators.ASSIGN, "xpath");
	}

	public void verifyAssignedRepoOfficer(String reportingOfficer) throws Exception {
		waitForElementAppearance(locators.REPORTING_OFFICER + reportingOfficer + CreateNewCase.locators.CLOSE_XPATH,"xpath");
		verifyTextIsPresent(locators.REPORTING_OFFICER + reportingOfficer + CreateNewCase.locators.CLOSE_XPATH, "xpath",
				"Error Info: Reporting Lead is not display");
	}

	public void selectFileType(String fileType) throws Exception {
		waitForElementAppearance(locators.SELECT_FILE_TYPE, "xpath");
		sendKeys(locators.SELECT_FILE_TYPE, "xpath", fileType);
		clickByEnterKey(locators.SELECT_FILE_TYPE, "xpath");
	}

	public void clickOnBrowse() throws Exception {
		waitForElementAppearance(locators.BROWSE, "id");
		click(locators.BROWSE, "id");
	}

	public void clickOnBrowseInUploadReport() throws Exception {
		waitForElementAppearance(locators.FILE_UPLOAD_BROWSE, "id");
		click(locators.FILE_UPLOAD_BROWSE, "id");
	}

	public void uploadFile() throws Exception {
		waitForElementAppearance(locators.UPLOAD_FILE, "xpath");
		clickByJS(locators.UPLOAD_FILE, "xpath");
		waitForInvisibleOfElement(locators.SPINNER, "xpath");
	}

	public void verifyFileUploadedSuccessMessage() throws Exception {
		waitForElementAppearance(locators.FILE_UPLOADED_SUCCESS_MESSAGE, "xpath");
		verifyTextIsPresent(locators.FILE_UPLOADED_SUCCESS_MESSAGE, "xpath",
				"Error info: File Uploaded Success message is not display");
		waitForInvisibleOfElement(locators.FILE_UPLOADED_SUCCESS_MESSAGE, "xpath");
	}

	public void uploadFishEyeImages(String fileType, String[] fisheyeUpload) throws Exception {
		for (int i = 0; i < fisheyeUpload.length; i++) {
			selectFileType(fileType);
			clickOnBrowse();
			uploadFileUsingRobot(fisheyeUpload[i]);
			uploadFile();
		}
	}

	public void verifyAcceptDNCDownloadButtons() throws Exception {
		waitForElementAppearance(locators.DATA_NON_COMPLIANCE, "id");
		verifyTextIsPresent(locators.DATA_NON_COMPLIANCE, "id",
				"Error info: Data Non Compliance button is not display");
		verifyTextIsPresent(locators.ACCEPT, "id", "Error info: Accept button is not display");
		verifyTextIsPresent(locators.DOWNLOAD, "id", "Error info: Data Non Compliance button is not display");
	}

	public void verifyAlertMessageBody() throws Exception {
		waitForElementAppearance(locators.EVIDENCE_IMAGES_SKETCHES_ALERT, "xpath");
		verifyTextIsPresent(locators.EVIDENCE_IMAGES_SKETCHES_ALERT, "xpath",
				"Error info: Alert Pop up is not display");
		clickByJS(locators.EVIDENCE_IMAGES_SKETCHES_ALERT, "xpath");
	}

	public void clickOnBack() throws Exception {
		waitForElementAppearance(locators.BACK, "xpath");
		clickByJS(locators.BACK, "xpath");
	}

	public void selectReportingLead(String reportingLead) throws Exception {
		waitForElementAppearance(locators.ASSIGN, "xpath");
		sendKeys(locators.REPORTING_LEAD_INPUT, "xpath", reportingLead);
		waitForElementAppearance(locators.REPORTING_LEAD + reportingLead + CreateNewCase.locators.CLOSE_XPATH, "xpath");
		clickByJS(locators.REPORTING_LEAD + reportingLead + CreateNewCase.locators.CLOSE_XPATH, "xpath");
	}

	public void clickOnDownload() throws Exception {
		waitForElementAppearance(locators.DOWNLOAD, "id");
		clickByJS(locators.DOWNLOAD, "id");
		// waitForInvisibleOfElement(locators.DOWNLOAD_IS_IN_PROGRESS, "xpath");
	}

	public void clickOnAccept() throws Exception {
		waitForElementAppearance(locators.ACCEPT, "id");
		clickByJS(locators.ACCEPT, "id");
	}

	public void verifyAcceptButtonIsNotDisplay() throws Exception {
		verifyTextIsNotPresent(locators.ACCEPT, "id", "Error Info: Accept Button is display");
	}

	public void uploadZipFolder(String zipFile) throws Exception {
		clickOnUploadReport();
		selectBrowse();
		uploadZIPFolder(zipFile);
		clickOnUploadButton();
	}

	public void clickOnReportsButton() throws Exception {
		waitForElementAppearance(locators.REPORT, "xpath");
		clickByJS(locators.REPORT, "xpath");
	}

	public void clickOnUploadReport() throws Exception {
		waitForElementAppearance(locators.UPLOAD_REPORT, "xpath");
		clickByJS(locators.UPLOAD_REPORT, "xpath");
	}

	public void selectBrowse() throws Exception {
		waitForElementAppearance(locators.FILE_UPLOAD_BROWSE, "id");
		clickByJS(locators.FILE_UPLOAD_BROWSE, "id");
	}

	public void uploadZIPFolder(String zipFile) throws Exception {
		uploadFileUsingRobot(zipFile);
	}

	public void verifyPreviewMsg() throws Exception {
		waitForElementAppearance(locators.UPLOAD_ZIP_FOLDER_SUCCESS_MSG, "xpath");
		verifyTextIsPresent(locators.UPLOAD_ZIP_FOLDER_SUCCESS_MSG, "xpath", "Error info: Preview message is not display");
	}

	public void submitReport() throws Exception {
		waitForElementAppearance(locators.SUBMIT_REPORT, "id");
		clickByJS(locators.SUBMIT_REPORT, "id");
	}

	public void reportSubmitedSuccessMessage() throws Exception {
		waitForElementAppearance(locators.REPORT_SUBMITED_SUCCESS_MESSAGE, "xpath");
		verifyTextIsPresent(locators.REPORT_SUBMITED_SUCCESS_MESSAGE, "xpath", "Error info: Report Submited Success message is not display");
	}

	public void verifyCaseStatusInCaseDetailsPage(String status) throws Exception {
		waitForElementAppearance(locators.STATUS_PART1 + status + CreateNewCase.locators.CLOSE_XPATH, "xpath");
		verifyTextIsPresent(locators.STATUS_PART1 + status + CreateNewCase.locators.CLOSE_XPATH, "xpath", "Error info: Appropriate statsus is not display");
	}
	
	public void verifyReportLogstatusInReportsPage(String status) throws Exception {
		System.out.println(locators.REPORTS_LOG_STATUS);
		String status1 =getText(locators.REPORTS_LOG_STATUS, "xpath");
		assertEquals(status1, status);		
	}
	
	public void clickOnCloseCaseButton() throws Exception {
		waitForElementAppearance(locators.CLOSE_BUTTON ,"xpath");
		clickByJS(locators.CLOSE_BUTTON ,"xpath");	
	}

	public void VerifyCommentBox() throws Exception {
		isElementPresent(locators.COMMENT_BOX_MESSAGE, "XPATH");
	}

	public void Entercomment() throws Exception {
		sendKeys(locators.CLOSECASE_COMMENT, "xpath", "Your report is accepted/Revised");
	}

	public void ClicKonCloseButton() throws Exception {
		isElementPresent(locators.CLOSE, "XPATH");
		clickByJS(locators.CLOSE, "xpath");
	}
	
	public void ReviseReportButton() throws Exception {
		isElementPresent(locators.REVISE_REPORT_BUTTON, "xpath");
		clickByJS(locators.REVISE_REPORT_BUTTON, "xpath");
	}

}
