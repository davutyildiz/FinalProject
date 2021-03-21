@Job
Feature: Add Job Detailss

  Background: 
    Given I enter valid username and valid password
    And I click on login button
    And I go to employee list
    And I find and click the employee using ID "00001"


  @job1
  Scenario: Details
    When I click on the Job Button on the Left
    And I click on Edit Button on the Bottom
    And I click on the Job Title Dropdown Menu
   # And I click on the Accountant
    And I click on the Employment Status Dropdown Menu
    And I click on the Job Category Dropdown Menu
    And I click on the Calendar Button
    And I pick the Date "February, 1"
    And I click on the SubUnit and Select by index
    And I click on Start Date Calendar
    And I click on End Date Calendar
    And I click on Location and Select by index
    Then I click  Save Botton

  @Job2
  Scenario: Attachments
    Given I click on the Add Button
    And I click on the Second Choose Button and download a file
    And I click on the Comment Box and type my message there
    Then I Hit Upload Button
    
