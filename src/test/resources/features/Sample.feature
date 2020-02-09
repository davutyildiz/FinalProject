Feature: Sample
Background: 
Given I enter valid username and valid password
And I click on login button
And I go to employee list
And I find and click the employee using ID "9099"

  @smoke
  Scenario: Modify Empoyee Personal Details
    When I click on save button
    
    