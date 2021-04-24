@Smoke
Feature: Personal Details

  Background: 
    Given I enter valid username and valid password
    And I click on login button
    And I go to employee list
    And I find and click the employee using ID "00001"
@Smoke
  Scenario: Updating Personal Details
    When I click on edit button
    And I enter employee names
      | FirstName | MiddleName | LastName |
      | JAMES		  | RODIN      | STAR  |
    And I enter employee details
      | DLNumber | LEDate     |  OtherId | NickName    | MilitaryService | Nationality | DofB       | Gender | MaritalStatus |
      |  1234567 | 2019-05-13 |   23987  | mr.Star 		 | none            | American    | 1980-05-13 | Male   | Single        |
    Then I click on Save button
    And I click to be abel to add attachment from PC
    And I choose file from my PC
    And I click to save attached file from my PC

   @Smoke
     Scenario: Uploding Employee Photograph
     When I click on Image at the left
     And I choose Employee Photograph
     Then I click to Upload