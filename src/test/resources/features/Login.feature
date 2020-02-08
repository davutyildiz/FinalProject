@sprint1 @login
Feature: Login

  @smoke
  Scenario: Valid  login
    When I enter valid username and valid password
    And I click on login button
    Then I succesfully logged in