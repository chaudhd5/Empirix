Feature: Performance Page Functionality


 Background:
   Given User is at Performance Page
    
    
Scenario: Check Language Switch to Japanese
When User Click on Profile Drop down
And User Select Japanese Language
Then User Language should be changed to Japanese


Scenario: Check Language Switch Back to English
When User Click on Profile Drop down
And User Select English Language
Then User Language should be changed to English

Scenario: Check User navigation to Alert Tab
When User Navigate to Alert tab
Then User should be Navigated to alert tab successfully


Scenario: Check User navigation to Test Tab
When User Navigate to Test tab
Then User should be Navigated to Test tab successfully


Scenario: Check User navigation to Variables Tab
When User Navigate to Variables tab
Then User should be Navigated to Variables tab successfully


Scenario: Check User navigation to Notifications Tab
When User Navigate to Notifications tab
Then User should be Navigated to Notifications tab successfully


