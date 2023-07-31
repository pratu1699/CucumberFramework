@All
Feature: Test Amazon Title Scenarios
Background:
Given open Amazon application

@Smoke
Scenario:Test for HomePage title
When I capture title for home page
Then Home page title should be match

@Regression
Scenario: Test for Bestsellers page title
When I open BestSellers page
When I capture title for Bestsellers page
Then Best sellers page title should be match

@Sanity
Scenario: Test for Mobiles page title
When I open mMobiles page
When I capture title for Mobiles page
Then Mobiles page title should be match

@Reset
Scenario: Test for Fashion page title
When I open Fashion page
When I capture title for Fashion page
Then Fashion page title should be match