
@Smoke
Feature: Tax Exemption

Background: 
    Given I enter valid username and valid password
    And I click on login button
    And I go to employee list
    And I find and click the employee using ID "00001"
    And I click on tax exemptions
    

    Scenario: 
  When I click on edit employee tax exemption
  And I select Federal income tax status  
  And I send federal income tax exemptions
  And I select state income tax state 
  And I select state income tax status
  And I select state income tax exemptions
  And I select state income tax unemployment state
  And I select state income tax work state 
  Then I click on save tax exemption
  And I click on add attachment for tax exemption
  And I choose file from comtputer for employee tax exemption
  Then I click on save the attachment for employee tax exemption