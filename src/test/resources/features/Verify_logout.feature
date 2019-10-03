Feature: testing logout functionlity for the application imagenecsi
@sanity
Scenario: Verify Valid User can login and logoutfrom  the imagenecsi web portal

Given User navigates to iMAGENEcsi portal login page
Then Verify the title of the imagenecsi application
And  User clicks on Login button
When User clicks on Logout button
Then Verify valid user is sucessfully able to logged out

