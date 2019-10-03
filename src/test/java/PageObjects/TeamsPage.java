package PageObjects;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Locators.Teams.locators;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import step_definitions.ConfigBrowser;

public class TeamsPage extends BrowserBot {

	public TeamsPage(WebDriver driver) {
		super(driver);
		driver = ConfigBrowser.driver;
	}

	private static final Logger logger = LogManager.getLogger(TeamsPage.class.getName());
	public String teamname;

	public void clickOnTeams() throws Exception {
		click(locators.TEAMS, "xpath");
	}

	public void clickOnAddTeams() throws Exception {
		waitForElementAppearance(locators.ADD_TEAMS, "xpath");
		click(locators.ADD_TEAMS, "xpath");
	}

	public void VerifyAddTeamPage() throws Exception {
		waitForElementAppearance(locators.ADD_TEAM_HEADER, "xpath");
		isElementPresent(locators.ADD_TEAM_HEADER, "xpath");
	}

	public void selectIOTeam() throws Exception {
		click(locators.SELECT_IO_TEAM, "xpath");
	}

	public void selectRepTeam() throws Exception {
		click(locators.SELECT_REPORTING_TEAM, "xpath");
	}

	public void selectReportingTeam() throws Exception {
		click(locators.SELECT_REPORTING_TEAM, "xpath");
	}

	public void enterTeamName() throws Exception {
		typeRandomNumbers(locators.TEAM_NAME, "css", "Team", 5);
		teamname = getAttributeValue(locators.TEAM_NAME, "css");
		System.out.println(teamname);
	}

	public void selectTeamlead(String Leadname) throws Exception {
		sendKeys(locators.SELECT_LEAD, "xpath", Leadname);
		clickByEnterKey(locators.SELECT_LEAD, "xpath");
	}

	public void selectIOmember(String Iomembername) throws Exception {
		sendKeys(locators.SELECT_MEMBER, "xpath", Iomembername);
		clickByEnterKey(locators.SELECT_MEMBER, "xpath");
	}

	public void clickonSumbit() throws Exception {
		click(locators.SUMBIT_BUTTON, "xpath");
	}

	public void verifyTeamSucessmsg(String msg) throws Exception {
		waitForElementAppearance(locators.SUCESS_MSG, "xpath");
		verifyGetText(locators.SUCESS_MSG, "xpath", msg);

	}

	public void verifyTeaminMangeTeams() throws Exception {
		System.out.println(locators.VERIFY_CREATED_TEAM + teamname + Locators.CreateNewCase.locators.CLOSE_XPATH);
		waitForElementAppearance(locators.VERIFY_CREATED_TEAM + teamname + Locators.CreateNewCase.locators.CLOSE_XPATH,
				"xpath");
		isElementPresent(locators.VERIFY_CREATED_TEAM + teamname + Locators.CreateNewCase.locators.CLOSE_XPATH,
				"xpath");

	}

}
