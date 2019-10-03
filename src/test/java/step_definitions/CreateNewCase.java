package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import BaseTest.BaseTest;
import Data.CaseData;
import PageObjects.CreateNewCasePage;
import PageObjects.LoginPage;
import Utility.DateAndTimeFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateNewCase extends BaseTest {

	public WebDriver driver;
	DateAndTimeFunctions dateAndTime;

	public CreateNewCase() throws Exception {
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, CreateNewCasePage.class);
	}

	LoginPage login                      		= PageFactory.initElements(driver, LoginPage.class);
	CreateNewCasePage createCase 				= PageFactory.initElements(driver, CreateNewCasePage.class);
	CaseData caseData 							= new CaseData();
	

	@Then("^Verify the Create New Case page is display$")
	public void verify_the_Create_New_Case_page_is_displayed() throws Throwable {
		createCase.verifyNewCasePage();
	}

	@When("^IO lead entres all case details to create New Case$")
	public void ioLeadCaseDetails() throws Throwable {
		createCase.enterIOLeadCaseDetails();
	}

	@When("^Reporting Lead entres all case details to create New Case$")
	public void repoLeadCaseDetails() throws Throwable {
		//createCase.enterReportingLeadCaseDetails();
	}
	
	@When("^Click on Save Button$")
	public void user_clicks_on_Save_Button() throws Throwable {
		createCase.clickSave();
		
	}

	@Then("^Verify case created success message$")
	public void verify_case_created_success_Message() throws Throwable {

	}

	@Then("^Verify created case is successfully dispalyed in Dashboard")
	public void verify_case_created_successfully_displayed_in_dashboard() throws Throwable {

	}
	
}
