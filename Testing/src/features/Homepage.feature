Feature: Empirix Login
This feature verify the Login Functionality

Scenario: Check Login Functionality with correct credentials
Given User is at Empirix home page
When User Enter User Name
And User Enter Password
Then User should be able to login successfully
