Feature: New User creation Functionality 

Scenario: Creating new user
Given user is at Home Page
And they close the pop-up
When they click on the Sign-in Button
Then they are redirected to the Sign-in Page
When user clicks on Create Account Button
Then user is redirected to Create Account Page
When user provide valid Values
And clicks on Create An Account Page
Then the user will be redirected to Account overview Page