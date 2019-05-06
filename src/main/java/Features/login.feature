Feature: Login feature of application


@smoke
Scenario: Login with valid credentials
Given User is already on login page
When User enters username and password
And User click on login button
Then User user redirests to home page