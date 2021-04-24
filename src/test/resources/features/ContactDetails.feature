
@Smoke
Feature: Title of your feature

  Background: 
    Given I enter valid username and valid password
    And I click on login button
    And I go to employee list
    And I find and click the employee using ID "00001"

 @Smoke
  Scenario: Contact Details
    When I click on Contact Details and Edit button
    And I add adress details
      | Address Street 1 | City       | State/Province | Zip/Postal Code | Country       |
      | Riverview Dr     | Wayne			 | New Jersey    | 07470 					 | United States |
    Then I insert mobile number
    And I insert work mail
    Then I click on conDet_Save button
