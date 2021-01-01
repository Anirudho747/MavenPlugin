Feature: Address Update

Scenario: Updating Address
Given user is at Home Page
And they close the pop-up
When they click on the Sign-in Button
Then they are redirected to the Sign-in Page
When user provides their credentials and clicks on Login Button
Then user is redirected to Account Overview Page
When User clicks on start setting up challenge questions button
And user clicks on Addresses
And provides Street Address, City, State and Zip
And clicks on Add Address
Then user should gets pop-up to verify Address
When user clicks on Add Address as is button