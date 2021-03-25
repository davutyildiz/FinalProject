package com.hrms.steps;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmployeeMembershipSteps extends CommonMethods {
	

@When("I click  on Membership")
public void i_click_on_Membership() {
 click( EmpMembership.Membership);
}

@When("I click  Add Assigned Membership")
public void i_click_Add_Assigned_Membership() {
   click(EmpMembership.AddMembership);
}

@When("I select Membership Fishing Club")
public void i_select_Membership_Fishing_Club() throws InterruptedException {
	Select select=new Select(EmpMembership.SelectMembership);
  select.selectByValue("78");
  Thread.sleep(2000);
}

@When("I select Subscription Paid By Company")
public void i_select_Subscription_Paid_By_Company() throws InterruptedException {
	Select select=new Select(EmpMembership.subscriptionPaidBy);
	  select.selectByValue("Company");
	  Thread.sleep(2000);

}

@When("I send Subscription Amount")
public void i_send_Subscription_Amount() throws InterruptedException {
	EmpMembership.subscriptionAmount.sendKeys("200");
   Thread.sleep(2000);
}

@When("I select Currency USD")
public void i_select_Currency_USD() throws InterruptedException {
    Select select=new Select(EmpMembership.membership_currency);
    select.selectByValue("USD");
    Thread.sleep(2000);
}

@When("I select Subscription Commence Date January {double}")
public void i_select_Subscription_Commence_Date_January(Double double1) throws InterruptedException {
    click(EmpMembership.subscriptionCommenceDate);
    
    

	Select fromMonth = new Select(EmpMembership.CommenceMonth);
	fromMonth.selectByVisibleText("Jan");
	Select fromYear=new Select(EmpMembership.CommenceYear);
	fromYear.selectByVisibleText("2000");
	
	List<WebElement> fromDays= EmpMembership.CommenceDay;
	for (WebElement fromCell : fromDays) {
		String Day = fromCell.getText();
		if (Day.equals("1")) {
			fromCell.click();
			break;
		}
	}
    

Thread.sleep(4000);
}


@When("I selectSubscription Renewal Date January {double}")
public void i_selectSubscription_Renewal_Date_January(Double double1) throws InterruptedException {
	 click(EmpMembership.subscriptionRenewalDate);
	    
	    

		Select fromMonth = new Select(EmpMembership.RenewalMonth);
		fromMonth.selectByVisibleText("Jan");
		Select fromYear=new Select(EmpMembership.RenewalYear);
		fromYear.selectByVisibleText("2001");
		
		List<WebElement> fromDays= EmpMembership.RenewalDay;
		for (WebElement fromCell : fromDays) {
			String Day = fromCell.getText();
			if (Day.equals("1")) {
				fromCell.click();
				break;
			}
		}
	    

	Thread.sleep(4000);
}

@Then("I click on save button Assigned Membership")
public void i_click_on_save_button_Assigned_Membership() {
    click(EmpMembership.btnSaveMembership);
}


}
