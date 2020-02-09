package com.hrms.steps;

import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PersonelDetailsPageSteps extends CommonMethods{

	@When("I click  on Qualification")
	public void i_click_on_Qualification() throws InterruptedException {
	   click(empQualification.Qualifications);
	   Thread.sleep(2000);
	}

	@When("I click  Add WorkExperience")
	public void i_click_Add_WorkExperience() throws InterruptedException {
		click(empQualification.WorkExperience);
		Thread.sleep(2000);
	}

	@When("I enter Work details")
	public void i_enter_Work_details() {
	 sendText(empQualification.companyName, "PioneerAcademy");
	 sendText(empQualification.jobtitle,"IT manager");
	 Select selectMonth = new Select(empQualification.WorkExpFromMonth);
	 selectMonth.selectByVisibleText("May");
//	 click(person.experienceDateFrom);
//	 click(person.WorkExpFromMonth);
	
	 
	 
	
	 
	 sendText(empQualification.companyName,"Hello");
	
	}

	@Then("I click on save button work Experience")
	public void i_click_on_save_button_work_Experience() {
	   click(empQualification.saveWorkExp);
	}
	
	
	
}
