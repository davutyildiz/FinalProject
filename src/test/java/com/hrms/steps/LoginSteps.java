package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends CommonMethods {

	@When("I enter valid username and valid password")
	public void i_enter_valid_usename_and_valid_password() {
		
		sendText(login.username, "Admin");
		sendText(login.password, "Syntax@123");

	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		click(login.loginBtn);

	}

	@Then("I succesfully logged in")
	public void i_succesfully_logged_in() {

		System.out.println("I am logged in");

	}

}
