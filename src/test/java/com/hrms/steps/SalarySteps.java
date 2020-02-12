package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;




public class SalarySteps  extends CommonMethods{
	@When("I navigate to assigned salary component page and click on add button")
	public void i_navigate_to_assigned_salary_component_page_and_click_on_add_button() throws InterruptedException {
	  click(salary.salarylink);
	  click(salary.addsalarybtn);
	  Thread.sleep(3000);
	}

	@When("I filled up all boxes and click on bank details")
	public void i_filled_up_all_boxes_and_click_on_bank_details(DataTable dataTable1) throws InterruptedException {
	  Select paygrade=new Select(salary.paygradeselect);
	  paygrade.selectByVisibleText("batuhan sutceker");
	   
	  Select period=new Select(salary.selectsalaryperiod);
	  period.selectByVisibleText("Monthly");
	  
	  Select currency= new Select(salary.selectcurrency);
	  currency.selectByVisibleText("United States Dollar");
	  
	 List<Map<String, String>> salarycomponent=dataTable1.asMaps();
		
		for(Map<String, String> map: salarycomponent) {
	
			sendText(salary.salarycomponent, map.get("SalaryCompenent"));
			sendText(salary.salaryamanount, map.get("Amount"));
			sendText(salary.salarycomment, map.get("Comments"));
			Thread.sleep(3000);
		}
		
	}

	@When("I click on deposit details and filled up all boxes and click on save button")
	public void i_click_on_deposit_details_and_filled_up_all_boxes_and_click_on_save_button(DataTable dataTable2) throws InterruptedException {
		
		click(salary.checkboxofdepositdetails);
		Select type= new Select (salary.selectaccounttype);
		type.selectByVisibleText("Checking");
		List<Map<String, String>> depositdetails=dataTable2.asMaps();
		
		for(Map<String, String> map: depositdetails) {
			sendText(salary.accountnumber, map.get("AccountNumber"));
			sendText(salary.directdepositamount, map.get("Amount"));
			sendText(salary.salarycomment, map.get("Comments"));
			Thread.sleep(3000);
			click(salary.salarysavebtn);
			
			
	}
	}
	
	@Then("I see successfully saved message")
	public void i_see_successfully_saved_message() {
		
		

	}

}
	
	
	
	
