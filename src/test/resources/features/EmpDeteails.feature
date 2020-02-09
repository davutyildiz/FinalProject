@smoke123
Feature: Modify Employee Personal Details

  Background: 
    Given I enter valid username and valid password
    And I click on login button
    And I go to employee list
    And I find and click the employee using ID "9099"

  Scenario: Step3
    When I click on edit button
    And I enter employee names
      | FirstName | MiddleName | LastName |
      | Kobe      | J          | Bryant   |
    And I enter employee deteails
      | DLNumber | LEDate | SSN    | OtherId | SIN        | NickName    | MilitaryService | Nationality | DofB       | Gender | MaritalStatus |
      |  1234567 | 567890 | 098765 |   23987 | 1209873645 | Black Mamba | none            | Mexican     | 1980-05-13 | Male   | Married       |
    Then I click on Save button
