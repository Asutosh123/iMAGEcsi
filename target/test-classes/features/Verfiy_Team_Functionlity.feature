Feature: To Verify admin is able to create a Team


Background:
Given User navigates to iMAGENEcsi SIT portal login page
Then Verify the title of the imagenecsi application

@SmokeTest @RegressionTest @Team
Scenario Outline:: Verify Admin can Create a IO Team
When Admin enters "<username>" and "<password>" to login page
And  User click on Login button
Then Verify Admin Lead is able to see home page Successfully
When Click on Add Team in Admin Dashbaord
And  Select Team Type Io Lead 
And  Enter team name
And Select Team "<IO lead>" from the drop-down
And Add "<Io Members>" for the IO team
When Click on Submit button
Then Verify Sucess messge of team creation
Then Select Manage Team and verify created team is displayed
Examples:
|username||password||IO lead||Io Members|
|raviadmin@yopmail.com||Test@123||User462||ravi io member|


@SmokeTest1 @RegressionTest @Functional @Team1
Scenario Outline:: Verify Valid Admin can Create a Reporting Team
When Admin enters "<username>" and "<password>" to login page
And  User click on Login button
Then Verify Dashboard page is display
When Click on Add Team in Admin Dashbaord
And  Select Team Type Reporting Team
And  Enter team name
And Select Team "<Rep lead>" from the drop-down
And Add "<Rep Members>" for the IO team
When Click on Submit button
Then Verify Sucess messge of team creation
Then Select Manage Team and verify created team is displayed
Examples:
|username||password||Rep lead||Rep Members|
|raviadmin@yopmail.com||Test@123||Srini Reporting Lead||srini repo member|
