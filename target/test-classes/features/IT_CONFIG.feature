Feature: To Verify IT Config is able to Create a Admin and Update his details

@ItConfig
Scenario Outline:: Verify IT Config can Create a Admin
Given User navigates to iMAGENEcsi SIT portal login page
Then Verify the title of the imagenecsi application
When IT Config enters "<username>" and "<password>" to login page
And  User click on Login button
Then Verify IT Config is able to see home page Sucessfully
And  Click on Admin in Menu
When Click on Add Admin sub menu
And Select Reporting HQ "<ReportingHQ>"
And Enter Military / Civilian Number
And Select Ranks "<Rank>"
And Enter User Name
And Enter Users Official Email Id

When Click on Submit button
Then Verify created User is displayed in Users List

Examples:
|username||password||ReportingHQ||Rank|
|sripad@gmail.com||Test123!@||AD Police GHQ 1||General|

@ItConfig
Scenario: Verify Email in mailinator.com for the particular user
Given User navigates to Mailinator.com
When Enter userEmail id and click on GoButton
Then Verify user should get Welcome email
Then Verify user should get login credentials email

@ItConfig
Scenario: Verify new User is able to login with temporary password and able to change
Given User navigates to iMAGENEcsi SIT portal login page
When Enter userame and temporay password
And  User click on Login button
Then Verify User should get into update password screen
When Enter new password
When Click on Update button
Then Verify User should be able to Dashboard on the screen