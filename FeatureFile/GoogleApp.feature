Feature: Test Google application
Background:
Given Open Google Application

Scenario: Test Google Application Title
When User Capture Title of google
Then Title should be Google

Scenario: test Search Feature with valid keyword
When user enter valid keyword in search
Then User should get valid result