package Data;

import Utility.ReadDataFromXMLFile;
public class CaseData {
	
	public CaseData() throws Exception{
	}
		

		
		
		static String fileName                        =  "CaseData",
	                  time_sec                        = ""+System.currentTimeMillis();
		ReadDataFromXMLFile readAndWriteXml           = new ReadDataFromXMLFile();
		
		public final static String CASE_ID                   = "Case_Id"+time_sec,
                      CASEID                    = "Case_Id",
                      INVISTIGATION_LEAD        = "Invistigation_lead",
                      CASE_NAME                 = "Case_name"+time_sec,
                      INVI_LEAD                 = "",
                     COMPLEXITY                = "TIER1",
                     Details                   = "IO Lead Details",
                     INVISTIGATION_TEAM        = "mohit io team",
					 USER_NAME               =   "User_name",
				     userEmailId				= "Emailid",
					UserName				=  "User"+time_sec.substring(5, 8),
					UserEmail              =  "Email"+time_sec.substring(5, 8)+"@mailinator.com",
					DRAFT                     = "Draft",		                           
			         FILE_TYPE_FISH_EYE        = "FISHEYE",
			          LOGINUSER_SHEETNAME       = "LoginData",
			          ADMIN_COLUMN              = "Reporting Lead";
					
		
		
		

		public String caseid                      = readAndWriteXml.read(CASEID, fileName);
		public String invistigation_lead          = readAndWriteXml.read(INVISTIGATION_LEAD, fileName);
		public String username                    = readAndWriteXml.read(USER_NAME, fileName);
		public String email                       = readAndWriteXml.read(userEmailId, fileName);
		
		 public void writeToTestDataXml(String strNewValue, String strNode) throws Exception {
				readAndWriteXml.write(fileName, strNewValue, strNode);
			}
		
	}
	
