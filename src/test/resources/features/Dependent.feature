Feature: Dependent

  Background: 
    Given I enter valid username and valid password
    And I click on login button
    And I go to employee list
    And I find and click the employee using ID "00001"

  @Dependent
  Scenario: Add a Chield on Employee Dependent
    #add child
    When Click on Dependents Menu Item
    And Click Add on Assigned Dependents Page
    And Add Name of Dependent "Baran star"
    And Choose Child  Relationship Options
    And Add DOB of Dependent "2000-01-01"
    And Click Save on Add Dependent Page
    
