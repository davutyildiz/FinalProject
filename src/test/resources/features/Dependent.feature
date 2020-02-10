Feature: Dependent

  Background: 
    Given I enter valid username and valid password
    And I click on login button
    And I go to employee list
    And I find and click the employee using ID "9099"

  @Dependent
  Scenario: Add a Chield on Employee Dependent
    #add chield
    When Click on Dependents Menu Item
    And Click Add on Assigned Dependents Page
    And Add Name of Dependent
    And Choose Child  Relationship Options
    And Add DOB of Dependent "2000-01-01"
    And Click Save on Add Dependent Page
    #add wife
    When Click Add on Assigned Dependents Page
    And Add Name of Dependent
    And Choose Other  Relationship Options
    And Add DOB of Dependent "1980-12-12"
    And Click Save on Add Dependent Page
