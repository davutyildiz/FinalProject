package com.hrms.steps;

import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddJobDetailssSteps extends CommonMethods{


	@When("I click on the Job Button on the Left")
	public void i_click_on_the_Job_Button_on_the_Left() throws InterruptedException {
		Thread.sleep(5000);
		jsClick(person.jobBtn);
		Thread.sleep(3000);
	}

	@Given("I click on Edit Button on the Bottom")
	public void i_click_on_Edit_Button_on_the_Bottom() throws InterruptedException {
		click(JobDetails.editSaveBtn);
		Thread.sleep(2000);
	}

	@Given("I click on the Job Title Dropdown Menu")
	public void i_click_on_the_Job_Title_Dropdown_Menu() {
	 click(JobDetails.jobTitleDD);
	}

	@Given("I click on the Employment Status Dropdown Menu")
	public void i_click_on_the_Employment_Status_Dropdown_Menu() {
	    Select select = new Select(JobDetails.jobTitleDD);
	    select.selectByIndex(2);
	    
	}

	@Given("I click on the Job Category Dropdown Menu")
	public void i_click_on_the_Job_Category_Dropdown_Menu() {
		 Select select = new Select(JobDetails.jobCatDD);
		    select.selectByIndex(2);
	}

	@Given("I click on the Calendar Button")
	public void i_click_on_the_Calendar_Button() {
	    click(JobDetails.joinedDateCal);
	}

	@Given("I pick the Date {string}")
	public void i_pick_the_Date(String string) throws InterruptedException {
		click(JobDetails.twoEleven2020);
		Thread.sleep(3000);
	}

	@Given("I click on the SubUnit and Select by index")
	public void i_click_on_the_SubUnit_and_Select_by_index() throws InterruptedException {
		jsClick(JobDetails.subUnitDD);
		Select sel = new Select(JobDetails.subUnitDD);
		sel.selectByIndex(2);
		Thread.sleep(1000);
	}

	@Given("I click on Start Date Calendar")
	public void i_click_on_Start_Date_Calendar() throws InterruptedException {
		Thread.sleep(2000);
		jsClick(JobDetails.startDateCalFeb20);
		Thread.sleep(2000);
	}

	@Given("I click on End Date Calendar")
	public void i_click_on_End_Date_Calendar() throws InterruptedException {
		click(JobDetails.endDateCal);
		click(JobDetails.yearDatePicker);
		Thread.sleep(2000);
		Select sel = new Select(JobDetails.yearDatePicker);
		sel.selectByVisibleText("2021");
		Thread.sleep(2000);
		click(JobDetails.feb202021);
		Thread.sleep(2000);
	}

	@Given("I click on Location and Select by index")
	public void i_click_on_Location_and_Select_by_index() throws InterruptedException {
		jsClick(JobDetails.locationDD);
		Select sel = new Select(JobDetails.locationDD);
		sel.selectByIndex(2);
		Thread.sleep(1000);
	}
	

	@Then("I click  Save Botton")
	public void i_click_Save_Botton() throws InterruptedException {
		Thread.sleep(2000);
		click(JobDetails.editSaveBtn);
		Thread.sleep(2000);
		//tearDown();
	}

	@Given("I click on the Add Button")
	public void i_click_on_the_Add_Button() throws InterruptedException {
		Thread.sleep(2000);
		click(JobDetails.addBtnAttachments);
	}

	@Given("I click on the Second Choose Button and download a file")
	public void i_click_on_the_Second_Choose_Button_and_download_a_file() throws InterruptedException {
		
		JobDetails.secondChooseBtn.sendKeys(Constants.UPLOAD_FILES_PATH+"Gru.jpg");
		 //empQualification.AttachementUploadFile.sendKeys(Constants.UPLOAD_FILES_PATH+"Gru.jpg");
		   Thread.sleep(1000); 
		   
	}

	@Given("I click on the Comment Box and type my message there")
	public void i_click_on_the_Comment_Box_and_type_my_message_there() {
		  sendText(JobDetails.commentBox,"Handsome Gruuuuuu");
	}

	@Then("I Hit Upload Button")
	public void i_Hit_Upload_Button() throws InterruptedException {
		Thread.sleep(2000);
		click(JobDetails.uploadBtn);
		Thread.sleep(2000);
		//tearDown();
	}

	
}
