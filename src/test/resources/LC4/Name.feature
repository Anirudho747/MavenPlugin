Feature: First and Last Name Update

Scenario: Updating first and Last name
Given user is at Home Page
And they close the pop-up
When they click on the Sign-in Button
Then they are redirected to the Sign-in Page
When user provides their credentials and clicks on Login Button
Then user is redirected to Account Overview Page
When User clicks on start setting up challenge questions button
And provides alternate values for first and Last name
And clicks on update button
Then user should get proper message