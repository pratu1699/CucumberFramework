Feature: Test OpenCart application
Scenario: Test Login for OpenCart with valid data
Given Open Opencart application
When I enter valid email id "test@gmail.com"
When I enter valid password "test123"
When I click on cart login button
Then I should get Login and dashboard should be open