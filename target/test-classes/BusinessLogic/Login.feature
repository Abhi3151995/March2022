Feature: Login Functionality

Background: User successfully clicked on Initial Login window
When user "Chrome" browser with exe 
When user open url as 
When user cancel initial Login window

@SmokeTest
Scenario: Login Functionality by using valid credentials
When user navigate on login button
When user click on Myprofile
When user enter "9595952980" as username
When user enter "8329046687" as password
When user click on Login button
Then Application shows user profile to user
Then Browser close

