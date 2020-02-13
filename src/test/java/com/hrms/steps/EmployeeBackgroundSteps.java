package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class EmployeeBackgroundSteps extends CommonMethods {

	@Given("I enter valid username and valid password")
	public void i_enter_valid_usename_and_valid_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "Syntax@123");
	}
	@Given("I click on login button")
	public void i_click_on_login_button() throws InterruptedException {
		click(login.loginBtn);
		Thread.sleep(2000);
	}

	@Given("I go to employee list")
	public void i_go_to_employee_list() throws InterruptedException {
		click(dash.pim);
		Thread.sleep(2000);
	}

	@Given("I find and click the employee using ID {string}")
	public void i_find_and_click_the_employee_using_ID(String ID) throws InterruptedException {
		Thread.sleep(1000);
		sendText(employeeList.empId, ID);
		click(employeeList.searchBtn);
		Thread.sleep(1000);
		click(employeeList.tableCell);
		Thread.sleep(1000);
	}

	/*
	 * @When("I click on save button") public void i_click_on_save_button() {
	 * click(); }
	 * 
	 */
}

/*
package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;

public class EmployeeBackgroundSteps extends CommonMethods {

	@Given("I enter valid username and valid password")
	public void i_enter_valid_usename_and_valid_password() {
		sendText(login.username, "Admin");
		sendText(login.password, "Syntax@123");
	}

	@Given("I click on login button")
	public void i_click_on_login_button() throws InterruptedException {
		click(login.loginBtn);
		Thread.sleep(2000);
	}

	@Given("I go to employee list")
	public void i_go_to_employee_list() throws InterruptedException {
		click(dash.pim);
		Thread.sleep(2000);
	}

	@Given("I find and click the employee using ID {string}")
	public void i_find_and_click_the_employee_using_ID(String ID) throws InterruptedException {
		Thread.sleep(1000);
		sendText(employeeList.empId, ID);
		click(employeeList.searchBtn);
		Thread.sleep(1000);
		click(employeeList.tableCell);
		Thread.sleep(1000);
	}

	/*
	 * @When("I click on save button") public void i_click_on_save_button() {
	 * click(); }
	 * 
	 */



