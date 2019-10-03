package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import Data.CaseData;
import PageObjects.DashboardPage;
import PageObjects.LoginPage;
import Utility.ReaderAndWriteDataFromExcel;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dashboard extends BaseTest {
	public WebDriver driver;
	
	public Dashboard() throws Exception{
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, DashboardPage.class);
	}
		
		LoginPage login                             = PageFactory.initElements(driver, LoginPage.class);
		DashboardPage dashboard                     = PageFactory.initElements(driver, DashboardPage.class);
        ReaderAndWriteDataFromExcel readData        = new ReaderAndWriteDataFromExcel();
        String filePath                             = "F:\\imageneCsi.Automation\\src\\test\\resources\\TestData\\Files\\TestData.xls";
  
        
	@When("^Verify Dashboard page is display$")
	public void verifyDashboardPageIsDisplay() throws Throwable {
		dashboard.verifyDashboardPageIsDisplay();
	}
	
	@When("^Click on New Case in Dashboard page$")
	public void clickNewCaseButton() throws Throwable {
		dashboard.selectNewCase();			    
	}
	
	@Then("^Verify case status should be in \"(.*?)\"$")
	public void verifyStatus(String status) throws Throwable {		
	    //  String caseId = readData.readingExcel(filePath);
		dashboard.verifyCaseStatus(CaseData.CASE_ID, status);
	}
	
	@When("^User clicks on View Details link in card layout in dashboard for the created case$")
	public void clickOnViewDetailsButton() throws Throwable {
	   	dashboard.clickOnViewDetailsButton(CaseData.CASE_ID);
	}
	
	@When("^Verify Assignd case is displayed in his Dashboard$")
	public void verifyAssignedCase() throws Throwable {	     
		dashboard.verifyAssignedCaseID(CaseData.CASE_ID);
	}
	
	@Then("^Verify case is not displayed in Dashboard$")
	public void user_should_not_see_the_case_in_his_dashboard() throws Throwable {
		dashboard.verifyCaseIsNotDisplay(CaseData.CASE_ID);

	}
}