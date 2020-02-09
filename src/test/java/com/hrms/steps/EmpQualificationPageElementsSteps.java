package com.hrms.steps;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmpQualificationPageElementsSteps extends CommonMethods {

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
		sendText(empQualification.jobtitle, "IT manager");
		
		click(empQualification.experienceDateFrom);

		Select fromMonth = new Select(empQualification.WorkExpFromMonth);
		fromMonth.selectByVisibleText("May");
		Select fromYear=new Select(empQualification.WorkExpFromYear);
		fromYear.selectByVisibleText("2000");
		
		List<WebElement> fromDays= empQualification.WorkExpFromDay;
		for (WebElement fromCell : fromDays) {
			String Day = fromCell.getText();
			if (Day.equals("10")) {
				fromCell.click();
				break;
			}
		}
		
	click(empQualification.experienceDateTo);
	
	Select toMonth = new Select(empQualification.WorkExpFromMonth);
	toMonth.selectByVisibleText("Apr");
	Select toYear=new Select(empQualification.WorkExpFromYear);
	toYear.selectByVisibleText("2010");
	
	List<WebElement> toDays= empQualification.WorkExpFromDay;
	for (WebElement fromCell : toDays) {
		String fromDay = fromCell.getText();
		if (fromDay.equals("21")) {
			fromCell.click();
			break;
		}
	}
	
	
	
	
	
	
	
	
		
		sendText(empQualification.companyName, "Hello");

	}

	@Then("I click on save button work Experience")
	public void i_click_on_save_button_work_Experience() {
		click(empQualification.saveWorkExp);
	}

}
