package Data;

import Utility.ReaderAndWriteDataFromExcel;

public class EmailData {
	
	public EmailData() throws Exception{
	}
	ReaderAndWriteDataFromExcel readAndWriteToExcel = new ReaderAndWriteDataFromExcel();
	
	static String fileName                          =  "CaseData",
			      time_sec                          = ""+System.currentTimeMillis();
	
	public static final String USER_NAME            = "User_name",
			                   USER_EMAIL_ID		= "Emailid",
			                   MALINATOR_URL        = "https://www.mailinator.com/";
				              				              
    public static String USER_EMAIL                 = "Email"+ time_sec.substring(5, 8)+"@mailinator.com",
    		             USERNAME				    = "User"+ time_sec.substring(5, 8),
                         PHONE_NUMBER               = ""+time_sec.substring(1, 10),
                         PASSWORD                   = "password";

}
