Feature: To Verify admin is able to create a User
@SmokeTest212 @RegressionTest @Functional @User
Scenario Outline:: Verify Valid Admin can Create a User
Given User navigates to iMAGENEcsi SIT portal login page
Then Verify the title of the imagenecsi application
When Admin enters "<username>" and "<password>" to login page
And  User click on Login button
Then Verify Admin Lead is able to see home page Sucessfully
When Click on Add User in Dashbaord
And Select Reporting HQ "<ReportingHQ>"
And Select Police Station "<PoliceStation>"
And Enter Military / Civilian Number
And Select Ranks "<Rank>"
And Enter User Name
And Select User role "<Role>"
And Enter Users Official Email Id
When Click on Submit button
Then Verify created User is displayed in Users List

Examples:
|username||password||ReportingHQ||PoliceStation||Rank||Role|
|sriniitconfig@mailinator.com||Test@123||AD Police GHQ 1||Police Station GHQ||Lt. General||IO Member|

@SmokeTest @RegressionTest @Functional @User
Scenario: Verify Email in mailinator.com for the particular user
Given  User navigates to Mailinator.com
When  Enter user Email id and click on GoButton
Then Verify user should get Welcome email
Then Verify user should get login credentials email

@SmokeTest @RegressionTest @Functional @User
Scenario: Verify new User is able to login with temporary password and able to change
Given  User navigates to iMAGENEcsi SIT portal login page
When  Enter userame and temporay password
And  User click on Login button
Then Verify User should get into update password screen
When Enter new password
When Click on Update button
Then Verify User should be able to Dashboard on the screen
