package Locators;

public class CaseDetails {
	public class locators {

 		public static final String CASE_DETAILS_PAGE                   = "//div/h4[text()='Case Details']",
				                   CASE_ID                             = "//div/h5[text()='",
                                   MIN_FISHEYE_VALIDATION_MSG          = "//div[@aria-live='polite'][contains(.,'Number of fish-eye image(s) for this case is 0. It should be equal to or greater than 4.')]",
                                   UPLOAD_BUTTON                       = "//button[text()='Upload']",
                                   SPINNER                             = "//div[@class='visible spinner center']/img",
                                   FISHEYE_IMAGES_COUNT_PART1          = "//div[@id='headingOne']/h5[contains(text(),'Fish Eye Images')]/span[text()='",
                                   FISHEYE_IMAGES_COUNT_PART2          = " Files)']",
                                   IMAGE_NAME_PART1                    =  "//div/span[text()='",
                                   SUBMIT                              = "//button[text()='Submit']",
                                   PROCESSED                           = "//button[text()='Proceed']",
                                   ASSIGN                              = "//button[text()='Assign']",
                                   REPORTING_LEAD_INPUT                = "//div/div[text()='Reporting Lead']/parent::div/parent::div//input",
                                   REPORTING_OFFICER                   = "//span[text()='Reporting Officer']/parent::li/span[text()='",
                                   SELECT_FILE_TYPE				       = "//div[text()='Select Document Type']/parent::div//div/input",
                                   BROWSE                              = "fileUpload",
                                   UPLOAD_FILE                         = "//button[text()='Upload']",
                                   ACCEPT                              = "Accept",
                                   DOWNLOAD                            = "download",
                                   DATA_NON_COMPLIANCE                 = "NonCompliance",
                                   FILE_UPLOADED_SUCCESS_MESSAGE       = "//div[text()='Document has been successfully uploaded!']",
                                   EVIDENCE_IMAGES_SKETCHES_ALERT      = "//div[contains(text(),'Evidence Images or Sketches are not uploaded, if you still want to proceed please click on PROCEED')]",
                                   THANK_YOU_FOR_SUBMITTING            = "//div[text()='Thank you for submitting the case.']",
                                   BACK                                = "//button[text()='Back']",
                                   ASSIGN_DROUP_DOWN                   = "//div[text()='Reporting Lead']/parent::div/parent::div//span/span",
                                   REPORTING_LEAD                      = "//ng-dropdown-panel//span[text()='",
                                   DOWNLOAD_IS_IN_PROGRESS             = "//div[text()=' Download is in progress!!! ']",
                                   REPORT                              = "//button[text()='Reports']",
                                   UPLOAD_REPORT                       = "//button[text()='Upload Report']",
                                   FILE_UPLOAD_BROWSE                  = "fileUploadReport",
                                   UPLOAD_ZIP_FOLDER_SUCCESS_MSG       = "//div[text()='This is only a preview. In order to upload the report and submit it to IO Lead review, please click on the Submit Report button']",
                                   SUBMIT_REPORT                       = "Approval",
                                   REPORT_SUBMITED_SUCCESS_MESSAGE     = "//div[@aria-label='Report has been successfully submitted to the Investigation Lead!']",
                                   REPORTS_LOG_STATUS                  = "(//div/h5[text()='Reports Log']/parent::div//a/span)[1]",
                                   CLOSE  		 		   		       = "//button[text()='Close']",
                                   STATUS_PART1                        = "//div/span[text()='Status:']/parent::div/span[text()=' ", 		
 		      					   CLOSE_BUTTON						   =  "//button[text()='Close Case']",
 		      					   CLOSECASE_COMMENT				   = "//textarea[@name='addCommnet']",
			                       COMMENT_BOX_MESSAGE				   = "//div[contains(text(),'Are you sure you want to Close the case? If yes, please enter your comments below.')]",
				                   REVISE_REPORT_BUTTON		           = "//button[text()='Revise']";
                                   
	}
}
