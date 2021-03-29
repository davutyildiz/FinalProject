package com.hrms.steps;

import org.openqa.selenium.support.ui.Select;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmpReportToSteps extends CommonMethods {
	

@When("ReportTo link")
public void reportto_link() {
   click(EmpReportTo.ReportTo);
   
}

@Then("I click on Add button")
public void i_click_on_Add_button() {
  click(EmpReportTo.AddSupervisors);
}

@Then("I enter supervisorName;")
public void i_enter_supervisorName() {
	EmpReportTo.SupervisorName.sendKeys("BABA ALIYU TUNDE");
}




@Then("I select Reporting Method")
public void i_select_Reporting_Method() {
	Select select=new Select (EmpReportTo.reportingMehtod);
	select.selectByValue("1");
  
}

@Then("I click on Save")
public void i_click_on_Save() {
   click(EmpReportTo.SaveReporing);
}


}
