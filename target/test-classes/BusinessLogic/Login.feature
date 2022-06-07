Feature: Login Functionality

Background: User successfully clicked on Initial Login window
When user "Chrome" browser with exe 
When user open url as "http://primusbank.qedgetech.com/"


@SmokeTest
Scenario: Login Functionality by using valid credentials
When user enters "admin" as username
When user enters "admin" as password
When user click on Login button
Then user is on "PrimusBank" main page and get msg aswecome to Admin
