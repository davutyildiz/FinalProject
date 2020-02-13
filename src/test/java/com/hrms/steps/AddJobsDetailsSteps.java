package com.hrms.steps;

import org.openqa.selenium.By;
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
		Thread.sleep(2000);
		click(person.jobBtn);

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
		driver.manage().window().maximize();

	}

	@Given("I click on the Job Category dropdown menu")
	public void i_click_on_the_Job_Category_dropdown_menu() throws InterruptedException {
		Select sel = new Select(donaldJTrumpJob.jobCatDD);
		sel.selectByIndex(1);
		Thread.sleep(2000);

	}

	@Given("I click on the Calendar button")
	public void i_click_on_the_Calendar_button() {

		click(donaldJTrumpJob.joinedDateCal);
	}

	@Given("I pick the date {string}")
	public void i_pick_the_date(String string) {

		click(donaldJTrumpJob.twoEleven2020);
	}

	@Given("I click on the SubUnit and select by index")
	public void i_click_on_the_SubUnit_and_select_by_index() throws InterruptedException {
		// click(donaldJTrumpJob.subUnitDD);
		// Select sel = new Select(donaldJTrumpJob.subUnitDD);
		// sel.selectByIndex(0);
		// Thread.sleep(1000);
	}

	@Given("I click on location and select by index")
	public void i_click_on_location_and_select_by_index() throws InterruptedException {
		// click(donaldJTrumpJob.locationDD);
		// Select sel = new Select(donaldJTrumpJob.locationDD);
		// sel.selectByIndex(0);
		// Thread.sleep(1000);
	}

	@Given("I click on start date calendar")
	public void i_click_on_start_date_calendar() throws InterruptedException {
		Thread.sleep(2000);
		jsClick(donaldJTrumpJob.startDateCalFeb20);
		Thread.sleep(2000);
	}

	@Given("I click on end date calendar")
	public void i_click_on_end_date_calendar() throws InterruptedException {
		click(donaldJTrumpJob.endDateCal);
		click(donaldJTrumpJob.yearDatePicker);
		Thread.sleep(2000);
		Select sel = new Select(donaldJTrumpJob.yearDatePicker);
		sel.selectByVisibleText("2021");
		Thread.sleep(2000);
		click(donaldJTrumpJob.feb202021);
		Thread.sleep(2000);
	}

	@Given("I click on the Choose button and download a file")
	public void i_click_on_the_Choose_button_and_download_a_file() throws InterruptedException {
		Thread.sleep(2000);
		donaldJTrumpJob.cntrDetailsChooseFile.sendKeys("C:\\Users\\andre\\Documents\\TestingPractice");
		Thread.sleep(2000);
	}

	@Then("I click  Save botton")
	public void i_click_Save_botton() throws InterruptedException {
		Thread.sleep(2000);
		click(donaldJTrumpJob.editSaveBtn);
		Thread.sleep(2000);
		tearDown();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

	@Given("I click on the Add button")
	public void i_click_on_the_Add_button() throws InterruptedException {
		Thread.sleep(2000);
		click(donaldJTrumpJob.addBtnAttachments);

	}

	@Given("I click on the second Choose button and download a file")
	public void i_click_on_the_second_Choose_button_and_download_a_file() throws InterruptedException {
		Thread.sleep(2000);
		donaldJTrumpJob.secondChooseBtn.sendKeys("‪C:\\Users\\andre\\Downloads\\TestNG Class 1_Notes");
		Thread.sleep(2000);
	}

	@Given("I click on the Comment box and type my message there")
	public void i_click_on_the_Comment_box_and_type_my_message_there() {

		donaldJTrumpJob.commentBox.sendKeys("I am against Trump");
	}

	@Then("I hit Upload button")
	public void i_hit_Upload_button() throws InterruptedException {
		Thread.sleep(2000);
		click(donaldJTrumpJob.uploadBtn);
		Thread.sleep(2000);
		tearDown();
	}

}
