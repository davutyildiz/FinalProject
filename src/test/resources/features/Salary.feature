Feature: Salary
Background: 
Given I enter valid username and valid password
And I click on login button
And I go to employee list
And I find and click the employee using ID "13171"


@salim
Scenario: US 18804: As an admin I should be able to add employee's salary components

When I navigate to assigned salary component page and click on add button
And I filled up all boxes and click on bank details
      | SalaryCompenent | Amount |Comments|
      |  Management  | 9999 |Skilled Staff|
And I click on deposit details and filled up all boxes and click on save button
      | AccountNumber | RoutingNumber | Amount |
      | 1234567890|123456789| 9555 |
Then I see successfully saved message 

@salim
Scenario: As an admin I should be able to attach document on salary page
When I navigate to assigned salary component page
And I click on addbtn 
And I upload my document and fill in comment box and click on add button
Then I see uploaded succesfully message


@salim
Scenario: As an admin I can delete attached document
When I navigate to assigned salary component page
Then I see my file and choose it
And I click on delete button
Then I see deleted succesfully message