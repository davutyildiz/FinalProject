package com.hrms.steps;

import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PersonelDetailsPageSteps extends CommonMethods{

	@When("I click  on Qualification")
	public void i_click_on_Qualification() throws InterruptedException {
	   click(person.Qualifications);
	   Thread.sleep(2000);
	}

	@When("I click  Add WorkExperience")
	public void i_click_Add_WorkExperience() throws InterruptedException {
		click(person.WorkExperience);
		Thread.sleep(2000);
	}

	@When("I enter Work details")
	public void i_enter_Work_details() {
	 sendText(person.companyName, "PioneerAcademy");
	 sendText(person.jobtitle,"IT manager");
	 Select selectMonth = new Select(person.WorkExpFromMonth);
	 selectMonth.selectByVisibleText("May");
//	 click(person.experienceDateFrom);
//	 click(person.WorkExpFromMonth);
	
	 
	 
	
	 
	 sendText(person.companyName,"Hello");
	
	}

	@Then("I click on save button work Experience")
	public void i_click_on_save_button_work_Experience() {
	   click(person.saveWorkExp);
	}
	
	
	
}
