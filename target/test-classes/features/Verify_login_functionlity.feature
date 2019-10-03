Feature: Testing login functionlity for the application iMAGENEcsi

Background:
Given User navigates to iMAGENEcsi portal login page
Then Verify the title of the imagenecsi application


@login
Scenario Outline:: Verify Valid IO lead can login to the imagenecsi web portal
When IO lead enters "<username>" and "<password>" to login page
And  User click on Login button
Then  Verify Io lead is able to see home page Sucessfully

Examples:
|username||password|
|raviiolead@yopmail.com||Test@123|


@login
Scenario Outline:: Verify Valid IO Member can login to the imagenecsi web portal
When IO Member enters "<username>" and "<password>" to login page
And  User click on Login button
Then Verify Io Member is able to see home page Sucessfully

Examples:
|username||password|
|raviiomember@yopmail.com||Test@123|

@login
Scenario Outline:: Verify Valid Rep lead can login to the imagenecsi web portal
When Reporting Lead enters "<username>" and "<password>" to login page
And  User click on Login button
Then Verify Reporting Lead is able to see home page Sucessfully

Examples:
|username||password|
|ravireportlead@yopmail.com||Test@123|

@login
Scenario Outline:: Verify Valid Reporting Member can login to the imagenecsi web portal
When Reporting Member enters "<username>" and "<password>" to login page
And  User click on Login button
Then Verify Reporting Member is able to see home page Sucessfully
Examples:
|username||password|
|ravireportmember@yopmail.com||Test@123|

@login
Scenario Outline:: Verify Valid Admin can login to the imagenecsi web portal
When Admin enters "<username>" and "<password>" to login page
And  User click on Login button
Then Verify Admin Lead is able to see home page Sucessfully
Examples:
|username||password|
|raviadmin@yopmail.com||Test@123|

@smoke
Scenario: Verify Invalid user should not login to the imagenecsi web portal
When User enters Invalid Username "abcd@gmail.com" and password "Test@123"
And  User click on Login button
Then Verify Invalid should not be sucessfully loggd in and should see error message


@login
Scenario Outline:: Verify IT Config can Create a Admin
Given User navigates to iMAGENEcsi SIT portal login page
Then Verify the title of the imagenecsi application
When IT Config enters "<username>" and "<password>" to login page
And  User click on Login button
Then Verify IT Config is able to see home page Sucessfully

Examples:

|username||password|
|sripad@gmail.com||Test123!@|







