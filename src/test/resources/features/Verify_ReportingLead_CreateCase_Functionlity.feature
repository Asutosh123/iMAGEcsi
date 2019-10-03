Feature: Verify Reporting Lead create case funcationalites

Background:
#Given User navigates to iMAGENEcsi portal login page
Given User navigates to iMAGENEcsi SIT portal login page
Then Verify the title of the imagenecsi application

@smoke12
Scenario Outline:: Verify Reporting lead should be able to create a Case
When Reporting Lead enters "<username>" and "<password>" to login page
And  User click on Login button
Then Verify Dashboard page is display
When Click on New Case in Dashboard page
Then Verify the Create New Case page is display
When Reporting Lead entres all case details to create New Case
And  Select "<IO Lead>"
When Click on Save Button
Then Verify case created success message
Then Verify case status should be in "<draft>"
And  User clicks on View Details link in card layout in dashboard for the created case
Then Verify user should be navigate to the case details page of particular case
Then Veify RL is able to Upload Documents
And  Upload fisheye images
Then Verify Sumbit button is not display

Examples:
|username||password||draft||Registered||reportingLead||ioMember|
|email462@mailinator.com||Test@123||Draft||Registered||Srini Reporting Lead||srinivasiomember@yopmail.com|

@smoke1
Scenario Outline: Verify IO Lead is able to Sumbit a case which is Created By Reporting Lead
When IO Lead enters "<username>" and "<password>" in login page
And  User click on Login button
Then Verify Dashboard page is display
Then Verify the case is displayed in Dashbaord which is created by RL
Then Verify case status should be in "<draft>"
And  User clicks on View Details link in card layout in dashboard for the created case
Then Click on Submit button
Then Verify Evidence Images or Sketches are not uploaded alert message
When User click on Proceed Button in pop up
Then Verify assign button is not display
When Click on Back button
Then Verify case status should be in "<Registered>"
Then Verify Case created lead name is display in Case Details page

Examples:
|username||password||processing||IOReviewing||draft|
|srinirepolead@mailinator.com||Test@123||Processing||IO Reviewing||Draft|




