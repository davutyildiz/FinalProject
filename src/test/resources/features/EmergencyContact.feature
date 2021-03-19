
Feature: Emergency Contact

  Background: 
    Given I enter valid username and valid password
    And I click on login button
    And I go to employee list
    And I find and click the employee using ID "13171"
    And I click on emergency contact

  @smoke19
  Scenario Outline: Emergency Contact
    When I click on add contact to add contact information
    And I send "<Name>", "<Relationship>", "<Home Telephone>", "<Mobile>" and "<Work Telephone>"
    And I click on save to save emergency contact
		Then I click on add attachment for emergency contact
   And I click on upload file button
   And I click on upload file to save
   
    Examples: 
      | Name        | Relationship | Home Telephone | Mobile       | Work Telephone |
      | Monica Back | Wife         | 123-543-2324   | 987-654-2312 | 555-345-8679   |
	
	

