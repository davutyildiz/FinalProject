package com.hrms.steps;

import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddJobsDetailsSteps extends CommonMethods {
	@Given("I Find Don Tr and I click on the first name of employee")
	public void i_Find_Don_Tr_and_I_click_on_the_first_name_of_employee() throws InterruptedException {

		click(trumpElementInTable.trump);
		Thread.sleep(2000);
	}

	@Given("I click on the Job button on the left")
	public void i_click_on_the_Job_button_on_the_left() throws InterruptedException {

		jsClick(person.jobBtn);
		Thread.sleep(2000);

	}

	@Given("I click on Edit button on the bottom")
	public void i_click_on_Edit_button_on_the_bottom() throws InterruptedException {

		click(donaldJTrumpJob.editSaveBtn);
		Thread.sleep(2000);

	}

	@Given("I click on the Job Title dropdown menu")
	public void i_click_on_the_Job_Title_dropdown_menu() {

		click(donaldJTrumpJob.jobTitleDD);

	}

	@Given("I click on the Accountant")
	public void i_click_on_the_Accountant() throws InterruptedException {
		Select sel = new Select(donaldJTrumpJob.jobTitleDD);
		sel.selectByIndex(1);
		Thread.sleep(2000);

	}

	@Given("I click on the Employment Status dropdown menu")
	public void i_click_on_the_Employment_Status_dropdown_menu() throws InterruptedException {
		Select sel = new Select(donaldJTrumpJob.empStatusDD);
		sel.selectByIndex(1);
		Thread.sleep(2000);

	}

	@Given("I click on the Job Category dropdown menu")
	public void i_click_on_the_Job_Category_dropdown_menu() throws InterruptedException {
		Select sel = new Select(donaldJTrumpJob.jobCatDD);
		sel.selectByIndex(1);
		Thread.sleep(2000);

	}

	@Given("I click on the Calendar button")
	public void i_click_on_the_Calendar_button() {

	}

	@Given("I pick the date {string}")
	public void i_pick_the_date(String string) {

	}

	@Given("I click Start date calendar")
	public void i_click_Start_date_calendar() {

	}

	@Given("I click End date calendar")
	public void i_click_End_date_calendar() {

	}

	@Given("I click on the Choose button and download a file")
	public void i_click_on_the_Choose_button_and_download_a_file() {

	}

	@Then("I click  Save botton")
	public void i_click_Save_botton() {

	}

	@Given("I click on the Add button")
	public void i_click_on_the_Add_button() {

	}

	@Given("I click on the second Choose button and download a file")
	public void i_click_on_the_second_Choose_button_and_download_a_file() {

	}

	@Given("I click on the Comment box and type my message there")
	public void i_click_on_the_Comment_box_and_type_my_message_there() {

	}

	@Then("I hit Upload button")
	public void i_hit_Upload_button() {

	}

}
