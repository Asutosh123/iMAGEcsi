Feature: To Verify Case Complete flow from Creation to Completion

Background:
Given User navigates to iMAGENEcsi SIT portal login page
Then Verify the title of the imagenecsi application

@smoke @createCase
Scenario Outline:: Verify Io lead should be able to create a Case
When IO Lead enters "<username>" and "<password>" in login page
And  User click on Login button
Then Verify Dashboard page is display
When Click on New Case in Dashboard page
Then Verify the Create New Case page is display
When IO lead entres all case details to create New Case
When Click on Save Button
Then Verify case created success message
Then Verify case status should be in "<draft>"
When User clicks on Logout button

When IO Lead enters "<username>" and "<password>" in login page
And  User clicks on View Details link in card layout in dashboard for the created case
Then Verify user should be navigate to the case details page of particular case
When User clicks on Submit button
Then Verify error message for registering a case it must have minimum 4 fish eye image is mandatory
When Upload fisheye images
Then Click on Submit button
Then Verify Evidence Images or Sketches are not uploaded alert message
When User click on Proceed Button in pop up
When Click on Back button
Then Verify case status should be in "<Registered>"
When User clicks on View Details link in card layout in dashboard for the created case
When User selects Reporting lead from the dropdown "<reportingLead>"
And  User clicks on Assign Button
Then Verify the Case is Assigned To "<reportingLead>" Reporting Lead
When User clicks on Logout button

Examples:
|username||password||draft||Registered||reportingLead||ioMember|
|email462@mailinator.com||Test@123||Draft||Registered||Srini Reporting Lead||srinivasiomember@yopmail.com|

@smoke1
Scenario Outline: Verify Reporting lead/Reporting member must be able to upload the final report.  
When Reporting Lead enters "<username>" and "<password>" to login page
And  User click on Login button
Then Verify Assignd case is displayed in his Dashboard
And  User clicks on View Details link in card layout in dashboard for the created case
Then Verify Download/Accept/Data Non Compliance buttons are displayed in case details page
When Users Click on Accept button
Then Verify case status should be in "<processing>" in case details page
Then Verify Accept button is not display

When User click on Report button
When Clicks on Upload Report Button
And  User select a valid .zip Report file
When Click on Upload button on Popup
Then Verify the report should be uploaded and uploaded preview message is display 
Then Verify Reports Log status in "<draft>" Reports page
When User Clicks on Submit Report
Then Verify report submitted success message
Then Verify case status should be in "<IOReviewing>" in case details page

Examples:
|username||password||processing||IOReviewing||draft|
|srinirepolead@mailinator.com||Test@123||Processing||IO Reviewing||Draft|

@SmokeTestdra
Scenario Outline:: Verify As an IO Lead,User must be able to review the final report and accept the report  
When IO Lead enters "<username>" and "<password>" in login page
And  User click on Login button
Then Verify case status should be in "<Reviewing>"
And  User clicks on View Details link in card layout in dashboard for the created case
When User click on Report button
When Users Click on Accept button
When Click on Close Case Button
Then Verify Comment-box pop-up is displayed
And Enter the appropriate Comment and click on Close button on comment box
Then Verify case is not displayed in Dashboard
Examples:
|username||password||Reviewing|
|raviiolead@yopmail.com||Test@123||Reviewing|




#When IO Member enters "<ioMember>" and "<password>" in login page
#And  User click on Login button
#Then Verify Dashboard page is display
#Then Verify case status should be in "<draft>"
#And  User clicks on View Details link in card layout in dashboard for the created case
#When Upload fisheye images
#Then Click on Submit button
#When User clicks on Logout button