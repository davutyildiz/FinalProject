package com.hrms.steps;

import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaxExemptionsSteps extends CommonMethods {
	
	@Given("I click on tax exemptions")
	public void i_click_on_tax_exemptions() {
	   click(taxExemptions.empTaxExemptions); 
		
	}

	@When("I click on edit employee tax exemption")
	public void i_click_on_edit_employee_tax_exemption() {
		click(taxExemptions.empTaxExemptionsEdit);  
		
	}

	@When("I select Federal income tax status")
	public void i_select_Federal_income_tax_status() throws InterruptedException {
	  Select federalStatus=new Select(taxExemptions.empTaxFederalStatus);
	  federalStatus.selectByVisibleText("Married");
	  Thread.sleep(1000);
	}

	@When("I send federal income tax exemptions")
	public void i_send_federal_income_tax_exemptions() throws InterruptedException {
		taxExemptions.empTaxFederalExemption.clear();
		sendText(taxExemptions.empTaxFederalExemption, "40");  
	 Thread.sleep(1000);
	}

	@When("I select state income tax state")
	public void i_select_state_income_tax_state() throws InterruptedException {
		taxExemptions.empTaxStateState.click();
		Select taxState=new Select(taxExemptions.empTaxStateState);
		taxState.selectByIndex(38);
		Thread.sleep(3000);  

	}

	@When("I select state income tax status")
	public void i_select_state_income_tax_status() throws InterruptedException {
		Select selectStatus=new Select(taxExemptions.empTaxStateStatus);
		selectStatus.selectByVisibleText("Married");
		  Thread.sleep(3000);  

	}

	@When("I select state income tax exemptions")
	public void i_select_state_income_tax_exemptions() throws InterruptedException {
		taxExemptions.empTaxStateExemption.clear();
		sendText(taxExemptions.empTaxStateExemption, "40");  
	 Thread.sleep(1000); 

	}

	@When("I select state income tax unemployment state")
	public void i_select_state_income_tax_unemployment_state() throws InterruptedException {
		taxExemptions.empTaxUnempState.click();
		Select taxUnState=new Select(taxExemptions.empTaxUnempState);
		taxUnState.selectByIndex(38);
		Thread.sleep(1000); 

	}

	@When("I select state income tax work state")
	public void i_select_state_income_tax_work_state() throws InterruptedException {
		taxExemptions.empTaxWorkState.click();
		Select taxWorkState=new Select(taxExemptions.empTaxWorkState);
		taxWorkState.selectByIndex(38);
		Thread.sleep(2000);	

	}

	@Then("I click on save tax exemption")
	public void i_click_on_save_tax_exemption() throws InterruptedException {
	  click(taxExemptions.empTaxExemptionsSave) ; 
	  Thread.sleep(2000);
	}
	
	@Then("I click on add attachment for tax exemption")
	public void i_click_on_add_attachment_for_tax_exemption() {
	   click(taxExemptions.empTaxExemptionsAddAttachment);

	}


	@Then("I choose file from comtputer for employee tax exemption")
	public void i_choose_file_from_comtputer_for_employee_tax_exemption() throws InterruptedException {
		taxExemptions.empTaxExemptionsChooseAttachment.sendKeys("/Users/user/Documents/hello.xlsx");
		Thread.sleep(3000);

	}

	@Then("I click on save the attachment for employee tax exemption")
	public void i_click_on_save_the_attachment_for_employee_tax_exemption() {
		click(taxExemptions.empTaxExemptionsSaveAttachment);  

	}

}
