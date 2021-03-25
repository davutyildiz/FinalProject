
Feature: Employee Membership
 As an admin I should be able to add employee membership

  Background: 
Given I enter valid username and valid password
And I click on login button
And I go to employee list
And I find and click the employee using ID "00001"


  @Membership
  Scenario: Add Assigned Membership
    When I click  on Membership
    And I click  Add Assigned Membership
    And I select Membership Fishing Club
    And I select Subscription Paid By Company
    And I send Subscription Amount 
    And I select Currency USD
    And I select Subscription Commence Date January 01,2020
    And I selectSubscription Renewal Date January 01,2021
    Then I click on save button Assigned Membership
    
    