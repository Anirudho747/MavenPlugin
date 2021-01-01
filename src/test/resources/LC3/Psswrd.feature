Feature: Password Update

Scenario: Updating Password
Given user is at Home Page
And they close the pop-up
When they click on the Sign-in Button
Then they are redirected to the Sign-in Page
When user provides their credentials and clicks on Login Button
Then user is redirected to Account Overview Page
When User clicks on start setting up challenge questions button
And user provides old Password
And user enters New password and Confirm Password
Then user should get proper message for Password reset