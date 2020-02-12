Feature: Salary
Background: 
Given I enter valid username and valid password
And I click on login button
And I go to employee list
And I find and click the employee using ID "9099"

Scenario: US 18804: As an admin I should be able to add employee's salary components

When I navigate to assigned salary component page and click on add button
And I filled up all boxes and click on bank details
      | SalaryCompenent | Amount | Comments          |
      |  Management  | 11111 |Skilled Staff|
      
And I click on deposit details and filled up all boxes and click on save button
      | AccountNumber | RoutingNumber | Amount        |
      | ACC111111     | Routing9999     | 9500 |
Then I see successfully saved message 



