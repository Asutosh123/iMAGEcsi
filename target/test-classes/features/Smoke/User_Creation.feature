Feature: To Verify IT Config is able to Create a Admin and Update his details

@smokesrin232
Scenario Outline:: Verify IT Config can Create a new Admin User
Given User navigates to iMAGENEcsi SIT portal login page
When User enters Admin User name and Password
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
And Enter official Phone Number
When Click on Submit button
Then Verify created User is displayed in Users List
When User clicks on Logout button

Examples:
|username||password||ReportingHQ||Rank|
|azamitconfig@yopmail.com||Test@123||AD Police GHQ 1||General|

@smokesrin
Scenario: Verify Email in mailinator.com for the particular user
Given User navigates to Mailinator.com
When Enter user Email id and click on GoButton
Then Verify user should get Welcome email
Then Verify user should get login credentials email

#@smokesrin
#Scenario: Verify Admin is able to login with temporary password
Given User navigates to iMAGENEcsi SIT portal login page
When Enter userame and temporay password
And  User click on Login button
Then Verify User should get into update password screen
When Enter new password
When Click on Update button
Then Verify User should be able to Dashboard on the screen

@smokesrin
Scenario: Verify Admin can Create a new User
Given User navigates to iMAGENEcsi SIT portal login page
Then Verify the title of the imagenecsi application
When User enters Admin User name and Password
And  User click on Login button
Then Verify Admin Lead is able to see home page Successfully
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

