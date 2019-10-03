package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseTest;
import Locators.CreateNewCase.locators;
import PageObjects.TeamsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Teams extends BaseTest {
	public WebDriver driver;
	
	public Step_Teams() throws Exception{
		driver = ConfigBrowser.driver;
		PageFactory.initElements(driver, TeamsPage.class);
		
	}
	
	TeamsPage teams = PageFactory.initElements(driver, TeamsPage.class);

	@When("^Click on Add Team in Admin Dashbaord$")
	public void admin_selects_Add_Team_From_Teams_Menu() throws Throwable {
	
		teams.clickOnAddTeams();    
	}
	@When("^Select Team Type Io Lead$")
	public void select_Team_Type_Io_Lead() throws Throwable {
		teams.selectIOTeam();    
	}
	@When("^Select Team Type Reporting Team$")
	public void Select_Team_ReportingTeam() throws Throwable {
		teams.selectReportingTeam();    
	}

	@When("^Enter team name$")
	public void enter_team_name() throws Throwable {
		teams.enterTeamName();	
	}

	@When("^Select Team \"(.*?)\" from the drop-down$")
	public void select_Team_from_the_drop_down(String Leadname) throws Throwable {
		teams.selectTeamlead(Leadname);
	   
	}

	@When("^Add \"(.*?)\" for the IO team$")
	public void add_for_the_IO_team(String Iomembername) throws Throwable {
		teams.selectIOmember(Iomembername);
	    
	}

	/*@When("^Click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
		teams.clickonSumbit();
	    
	}*/
	@When("^Verify Sucess messge of team creation$")
	public void verify_team_sucess_msg() throws Throwable {
		teams.verifyTeamSucessmsg(prop.getProperty("TeamSucessmsg"));
	    
	}
	
	

	@Then("^Select Manage Team and verify created team is displayed$")
	public void select_Manage_Team_and_verify_created_team_is_displayed() throws Throwable {
		//teams.verifyTeaminMangeTeams();
		
	   
	}

	@When("^Select Team Type Reporting Team Lead$")
	public void select_Team_Type_Reporting_Team_Lead() throws Throwable {
	   
	}

	@When("^Select Team Reporting Team from the drop-down$")
	public void select_Team_Reporting_Team_from_the_drop_down() throws Throwable {
	  
	}

	@When("^Add Reporting Team Members for the IO team$")
	public void add_Reporting_Team_Members_for_the_IO_team() throws Throwable {
	    
	}

	
	
	
	
}
