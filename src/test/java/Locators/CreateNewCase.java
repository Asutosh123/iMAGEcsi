package Locators;

public class CreateNewCase {
	
	public class locators{
		
		public static final String CREATE_NEW_CASE_PAGE           = "h4[class='head']",
				                   NEW_CASE                       = "a[href='#/io-lead/add-case']",
				                   CASE_NAME                      = "caseName",
				                   CASE_ID                        = "caseNumber",
				                   RE_ENTER_CASE_ID               = "confirmcaseNumber",
				                   DATE                           = "//div/label[text()='Date *']/parent::div//div/input",
				                   //INVISTIGATION_LEAD             = "//div/label[text()='Investigation Lead *']/parent::div//div/span[text()='",
				                   INVISTIGATION_TEAM             = "//div/div[text()='Investigation Team']/parent::div/parent::div//input",
				                   INVISTIGATION_LEAD             = "//div/div[text()='Investigation Lead']/parent::div/parent::div//input",
				                   COMPLEXITY                     = "//div/div[text()='Complexity']/parent::div/parent::div//input",
				                   DETAILS                        = "details",
				                   SAVE                           = "//button[text()='Save']",	
				                   DROUPDOWN_OPTION               = "//span[text()='",
				                   CLOSE_XPATH                    = "']",		                  
				                   MIN_FISHE_VALIDATION			  = "//div[@aria-live='polite'][contains(.,'Number of fish-eye image(s) for this case is 0. It should be equal to or greater than 4.')]",
				                   SELECT_DOC_TYPE				  = "//div[text()='Select Document Type']/parent::div//div/input",				                   
				                   PROCEED_BUTTON				  = "//button[text()='Proceed']",
				                   DOC_UPLOAD_SUCESS_MSG		  = "//div[contains(text(),'Document has been successfully uploaded!')]";
				   
	}
}
			
