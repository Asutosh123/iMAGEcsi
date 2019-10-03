package step_definitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import Data.CaseData;
import PageObjects.CaseDetialsPage;
import Utility.ReadPropertyFiles;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseDetails extends BaseTest {
	public WebDriver driver;

	public CaseDetails() throws Exception {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, CaseDetialsPage.class);

	}

	ReaderAndWriteDataFromExcel readAndWrite = new ReaderAndWriteDataFromExcel();
	String filePath = "F://imageneCsi.Automation//src//test//resources//TestData//Files//TestData.xls";
	CaseDetialsPage caseDetails = PageFactory.initElements(driver, CaseDetialsPage.class);
	ReadPropertyFiles readPropertyFiles = new ReadPropertyFiles();
	String caseId = readAndWrite.readingExcel(filePath);
	String image1 = readPropertyFiles.pathToUploadFile("fisheyeimg1");
	String image2 = readPropertyFiles.pathToUploadFile("fisheyeimg2");
	String image3 = readPropertyFiles.pathToUploadFile("fisheyeimg3");
	String image4 = readPropertyFiles.pathToUploadFile("fisheyeimg4");
	String zipFile = readPropertyFiles.pathToUploadFile("zip");

	String fisheyeUpload[] = {image1, image2, image3, image4};

	@Then("^Verify user should be navigate to the case details page of particular case$")
	public void verifyCaseDetails() throws Throwable {
		caseDetails.verifyCaseDetailsPageisDisplay(caseId);
	}

	@Then("^Verify error message for registering a case it must have minimum 4 fish eye image is mandatory$")
	public void verifyFourFishEyeImagesMandatoryErrorMsg() throws Throwable {
		caseDetails.verifyErrorMessageForFishEyeImages();
	}

	@When("^Click on Submit button$")
	public void clickOnploadButton() throws Throwable {
		caseDetails.selectSubmitButton();
	}

	@When("^Verify all fisheye images are uploaded successfully$")
	public void verifyUploadedFiles(String[] fisheyeUpload) throws Throwable {
		caseDetails.verifyUploadedFishEyeImages(fisheyeUpload);
	}

	@When("^User clicks on Submit button$")
	public void clickOnSubmitButton() throws Throwable {
		caseDetails.clickSubmit();
	}

	@When("^User click on Proceed Button in pop up$")
	public void clickOnProcessedButton() throws Throwable {
		caseDetails.clickProcessed();
	}

	@When("^User selects Reporting lead from the dropdown \"(.*?)\"$")
	public void selectReportingLead(String reportingLead) throws Throwable {
		caseDetails.selectReportingLead(reportingLead);
	}

	@When("^User clicks on Assign Button$")
	public void selectAssign() throws Throwable {
		caseDetails.clickAssign();
	}

	@Then("^Verify the Case is Assigned To \"(.*?)\" Reporting Lead$")
	public void verifyAssignedReportingLead(String reportingOfficer) throws Throwable {
		caseDetails.verifyAssignedRepoOfficer(reportingOfficer);
	}

	@Then("^Upload fisheye images$")
	public void uploadFishEyeImages() throws Throwable {
		caseDetails.uploadFishEyeImages(CaseData.FILE_TYPE_FISH_EYE, fisheyeUpload);
	}

	@Then("^Verify Download/Accept/Data Non Compliance buttons are displayed in case details page$")
	public void verifyDNCAcceptAndDownloadButtons() throws Throwable {
		caseDetails.verifyAcceptDNCDownloadButtons();
	}

	@Then("^Verify Evidence Images or Sketches are not uploaded alert message$")
	public void verifyAlertMessage() throws Throwable {
		caseDetails.verifyAlertMessageBody();
	}

	@When("^Click on Back button$")
	public void selectBackButton() throws Throwable {
		caseDetails.clickOnBack();
	}

	@When("^Users Click on Download button$")
	public void download() throws Throwable {
		caseDetails.clickOnDownload();
	}

	@When("^Users Click on Accept button$")
	public void accept() throws Throwable {
		caseDetails.clickOnAccept();
	}

	@Then("^Verify Accept button is not display$")
	public void assignButtonIsNotDisplay() throws Throwable {
		caseDetails.verifyAcceptButtonIsNotDisplay();
	}

	@When("^User click on Report button$")
	public void reports() throws Throwable {
		caseDetails.clickOnReportsButton();
	}

	@When("^Clicks on Upload Report Button$")
	public void clickOnUploadReports() throws Throwable {
		caseDetails.clickOnUploadReport();
	}

	@When("^User select a valid .zip Report file$")
	public void uploadZipFolder() throws Throwable {
		caseDetails.clickOnBrowseInUploadReport();
		caseDetails.uploadZIPFolder(zipFile);
	}

	@When("^Click on Upload button on Popup$")
	public void clickOnUpload() throws Throwable {
		caseDetails.clickOnUploadButton();		
	}
	
	@Then("^Verify the report should be uploaded and uploaded preview message is display$")
	public void verifyPreviewMessageIsDisplay() throws Throwable {
		caseDetails.verifyPreviewMsg();		
	}
	
	@Then("^User Clicks on Submit Report$")
	public void clickOnReportSubmit() throws Throwable {
		caseDetails.submitReport();		
	}
	
	@Then("^Verify report submitted success message$")
	public void verifyReportSubmitedMessage() throws Throwable {
		caseDetails.reportSubmitedSuccessMessage();		
	}
	
	@Then("^Verify case status should be in \"(.*?)\" in case details page$")
	public void verifyCaseStatusInDetailsPage(String status) throws Throwable {
		caseDetails.verifyCaseStatusInCaseDetailsPage(status);
	}
	
	@Then("^Verify Reports Log status in \"(.*?)\" Reports page$")
	public void verifyReportLogStatus(String status) throws Throwable {
		caseDetails.verifyReportLogstatusInReportsPage(status);
	}
	
	@When("^Click on Close Case Button$")
	public void clickOnCloseButton() throws Throwable {
		caseDetails.clickOnCloseCaseButton();
	}
	
	@Then("^Verify Comment-box pop-up is displayed$")
	public void verify_Comment_box_displayed() throws Throwable {
		caseDetails.VerifyCommentBox();
	}

	@Then("^Enter the appropriate Comment and click on Close button on comment box$")
	public void clickCloseButtonInCommentBox() throws Throwable {
		caseDetails.Entercomment();
		caseDetails.ClicKonCloseButton();
	}

	@When("^Clicks on Revise Report Button$")
	public void clickOnReviseButton() throws Throwable {
		caseDetails.ReviseReportButton();
	}

	@Then("^Enter the appropriate Comment and click on Revise button on comment box$")
	public void enterCommentAndclikcOnReviseButton() throws Throwable {
		caseDetails.Entercomment();
		caseDetails.ReviseReportButton();

	}
}