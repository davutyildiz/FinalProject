package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class EmployeeBackgroundSteps extends CommonMethods {

	@Given("I enter valid username and valid password")
	public void i_enter_valid_usename_and_valid_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "Syntax@123");
	}

	@Given("I click on login button")
	public void i_click_on_login_button() {
		click(login.loginBtn);
	}

	@Given("I go to employee list")
	public void i_go_to_employee_list() {
		click(dash.pim);
	}

	@Given("I find and click the employee using ID {string}")
	public void i_find_and_click_the_employee_using_ID(String ID) throws InterruptedException {
		sendText(employeeList.empId, ID);
		click(employeeList.searchBtn);
		click(employeeList.tableCell);
		Thread.sleep(2000);
	}
	
/*	
  @When("I click on save button")
	public void i_click_on_save_button() {
	    click();
	}
	
*/
}
