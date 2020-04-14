Feature: Empirix Login

Scenario: Check Login Functionality with correct credentials
Given User is at Empirix home page
When User Enter User Name
And User Enter Password
And Click on Login
Then User should be able to login successfully