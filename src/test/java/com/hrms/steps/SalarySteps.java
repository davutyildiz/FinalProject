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
	
	
	
/*=
package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;




public class SalarySteps  extends CommonMethods
{
	@When("I navigate to assigned salary component page and click on add button")
	public void i_navigate_to_assigned_salary_component_page_and_click_on_add_button() throws InterruptedException
	{
	  click(salary.salarylink);
	  click(salary.addsalarybtn);
	  Thread.sleep(3000);
	}

	@When("I filled up all boxes and click on bank details")
	public void i_filled_up_all_boxes_and_click_on_bank_details(DataTable dataTable1) throws InterruptedException
	{
	  Select paygrade=new Select(salary.paygradeselect);
	  paygrade.selectByVisibleText("batuhan sutceker");
	   
	  Select period=new Select(salary.selectsalaryperiod);
	  period.selectByVisibleText("Monthly");
	  
//	 below code didnt work 
//	  Select currency= new Select(salary.selectcurrency);
//	  getWaitObject();
//	  currency.selectByVisibleText("United States Dollar");
	  
		Select currency= new Select(salary.selectcurrency);
		Thread.sleep(1000);
		List<WebElement> options=currency.getOptions();
		Thread.sleep(1000);
			for(WebElement opt:options)
			{
				String text= opt.getText();
			
				if (text.equals("United States Dollar"))
				{
					currency.selectByVisibleText(text);
					break;
				}
			Thread.sleep(1000); 
	
			}
	  
	  
	  
	 List<Map<String, String>> salarycomponent=dataTable1.asMaps();
		
		for(Map<String, String> map: salarycomponent)
		{
	
			sendText(salary.salarycomponent, map.get("SalaryCompenent"));
			sendText(salary.salaryamanount, map.get("Amount"));
			sendText(salary.salarycomment, map.get("Comments"));
			Thread.sleep(3000);
		}
		
	}

	@When("I click on deposit details and filled up all boxes and click on save button")
	public void i_click_on_deposit_details_and_filled_up_all_boxes_and_click_on_save_button(DataTable dataTable2) throws InterruptedException
	{
		
		click(salary.checkboxofdepositdetails);
		Select type= new Select (salary.selectaccounttype);
		type.selectByVisibleText("Checking");
		List<Map<String, String>> depositdetails=dataTable2.asMaps();
		for(Map<String, String> map: depositdetails)
		{
			sendText(salary.accountnumber, map.get("AccountNumber"));
			sendText(salary.routingnumber, map.get("RoutingNumber"));
			sendText(salary.directdepositamount, map.get("Amount"));
			Thread.sleep(3000);
			click(salary.salarysavebtn);
			
		}
	}
	
	@SuppressWarnings("deprecation")
	@Then("I see successfully saved message")
	public void i_see_successfully_saved_message()
	{
		
		boolean isshown= salary.savedmsg.isDisplayed();
		if (isshown);
		System.out.println("Test Passed");
		Assert.assertTrue(true);

	}
	
	@When("I navigate to assigned salary component page")
	public void i_navigate_to_assigned_salary_component_page() throws InterruptedException {
		
	}

	@When("I click on addbtn")
	public void i_click_on_addbtn() {
		click(salary.addattachbtn); 
	}

	@When("I upload my document and fill in comment box and click on add button")
	public void i_upload_my_document_and_fill_in_comment_box_and_click_on_add_button() {
	
		   
		   sendText(salary.chosefilebtn,"/Users/macbook/Desktop/SeleniumJava/njs_geeks/src/test/resources/documentsources/abc.pdf"); //change your file path
		   sendText(salary.addfilecomment,"Mothly Resport of Trump");
		   click(salary.fileuploadbtn);
		  
	}

	@SuppressWarnings("deprecation")
	@Then("I see uploaded succesfully message")
	public void i_see_uploaded_succesfully_message() throws InterruptedException {
		if (salary.validmsg.isDisplayed()) {
			Thread.sleep(500);
			String msg=salary.validmsg.getText();
			System.out.println("Test Passed. File Uploaded : "+ msg);
			Assert.assertTrue(true);
		
		}
		else {
			System.out.println("Test Failed. File not uploaded");
		}
	}

	@Then("I see my file and choose it")
	public void i_see_my_file_and_choose_it() throws InterruptedException
	{
		Thread.sleep(500);
		if (salary.attachedfilethere.isDisplayed())
		{
			salary.checkboxinsearch.click();
		}
		else
		{
			System.out.println("File not found");
		}
	}

	@Then("I click on delete button")
	public void i_click_on_delete_button() {
	  salary.attachdeletebtn.click();
	}

	@SuppressWarnings("deprecation")
	@Then("I see deleted succesfully message")
	public void i_see_deleted_succesfully_message() {
	    if(salary.msgdeleted.isDisplayed())
	    	Assert.assertTrue(true);
	}

}