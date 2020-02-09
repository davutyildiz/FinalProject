
@empQual
Feature: employee's qualifications
 As an admin I should be able to add employee's qualifications

  Background: 
Given I enter valid username and valid password
And I click on login button
And I go to employee list
And I find and click the employee using ID "9099"

  @smoke
  Scenario: Add Work Experience
    When I click  on Qualification
    And I click  Add WorkExperience
    And I enter Work details
    Then I click on save button work Experience
    #
    #Scenario: Add Education
    #When I click on Add education
    #And I enter education details
    #Then I click save button Education
    #
    #
    #Scenario: Add Skill
    #When I click on Add skill
    #And I enter skill details
    #Then I click save button Skill
    #
    #Scenario: Add Languages
    #When I click on Add language
    #And I enter language details
    #Then I click save button language
    #
    #Scenario: Add Attachements
    #When I click on Add attachements
    #And I enter attachements details
    #Then I click save button Attachements
    #
    #
    