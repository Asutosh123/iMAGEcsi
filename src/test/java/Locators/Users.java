package Locators;

public class Users {
	
	public class locators{
		
		public static final String ADD_USER                     = "//a[text()='Add User']",
                                   SELECT_HQ                    = "//ng-select[@id='reportingHQ']//input[@type='text']",
                                   SELECT_POLICE_STATION        = "//ng-select[@id='policeStation']//input[@type='text']",
                                   SELECT_MILITRY_NUMBER        = " //input[@id='militaryNumber']",
                                   RANK							= " //ng-select[@id='rank']//input[@type='text']",
                                   USER_NAME				    = "//input[@id='name']",
                                   EMAIL             			= "//input[@id='email']",
                                   PHONE_NUMBER                 = "phone",
                                   SELECT_ROLE					= "//ng-select[@id='role']//input[@type='text']",
                                   ADD_USER_HEADER				= "//h4[@class='head ng-star-inserted']",
								   SUCESS_MSG					= "//div[contains(text(),'User has been added successfully')]",
								   EnterEmailIdMailinator       =  "//input[@type='text'][@id='inboxfield']",
								   GO_BUTTON					= "//button[contains(text(),'Go!')]",
								   WELCOME_EMAIL				= "//td[contains(text(),'Welcome to iMAGENEcsi')]",
								   lOGIN_DETAILS_EMAIL			= "//td[contains(text(),'iMAGENEcsi - Login details')]",
								   TEMP_PASSWORD				= "(//span[contains(@style,'font-weight: normal ; color: #d1322e')])[2]",
								   Usrenamefrommailinator		= "(//a[contains(@target,'_other')])[1]",
								   UPDATE_PASSWORD_PAGE		    = "//div[text()='Update Password']",
								   NEW_PASSWORD				    = "newpassword",
							       CONFIRM_PASSWORD			    = "confirmPassword",
							       UPDATE_BUTTON				= "//button[text()='Update']";
		
                                   
	}

}
