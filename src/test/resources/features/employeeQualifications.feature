
@Smoke
Feature: Employee Qualifications
 As an admin I should be able to add employee qualifications

  Background: 
Given I enter valid username and valid password
And I click on login button
And I go to employee list
And I find and click the employee using ID "00001"

 @Smoke
  Scenario: Add Work Experience
    When I click  on Qualification
    And I click  Add WorkExperience
    And I enter Work details
    Then I click on save button work Experience
    
    #When I click on Add education
    #And I enter education details
    #Then I click save button Education
    
    
 
    When I click on Add skill
    And I enter skill details
    Then I click save button Skill
    
   
    When I click on Add language
    And I enter language details
    Then I click save button language
    
    When I click on Add License
    And I enter license details
    Then I click save button license
   
    When I click on Add attachements
    And I enter attachements details
    Then I click save button Attachements
    
    
    