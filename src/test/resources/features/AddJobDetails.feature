@Andrei
Feature: Add Job Details

  Background: 
    Given I enter valid username and valid password
    And I click on login button
    And I go to employee list
    And I find and click the employee using ID "9099"

  @Andrei
  Scenario: Details
    Given I Find Don Tr and I click on the first name of employee
    And I click on the Job button on the left
    And I click on Edit button on the bottom
    And I click on the Job Title dropdown menu
    And I click on the Accountant
    And I click on the Employment Status dropdown menu
    And I click on the Job Category dropdown menu
    And I click on the Calendar button
    And I pick the date "February, 1"
    And I click on the SubUnit and select by index
    And I click on start date calendar
    And I click on end date calendar
    And I click on location and select by index
    Then I click  Save botton

  @Andrei
  Scenario: Attachments
    Given I click on the Add button
    And I click on the second Choose button and download a file
    And I click on the Comment box and type my message there
    Then I hit Upload button
