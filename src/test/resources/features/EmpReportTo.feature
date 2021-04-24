@Smoke
Feature: Employee Assinged Supervisors

  Background: 
    Given I enter valid username and valid password
    And I click on login button
    And I go to employee list
    And I find and click the employee using ID "00001"

  Scenario: Updating Employee Supervisors
    When ReportTo link
    Then I click on Add button
    And I enter supervisorName;
    And I select Reporting Method
    Then I click on Save