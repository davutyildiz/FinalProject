package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class PersonalDeteailsStep3 extends CommonMethods{
	@When("I click on edit button")
	public void i_click_on_edit_button() throws InterruptedException {
		click(add.editButton);
		Thread.sleep(3000);
	}
@When("I enter employee names")
public void i_enter_employee_names(DataTable dataTable) {
   List<Map<String,String>> names=dataTable.asMaps();
   for(Map<String,String> name:names) {
	   sendText(add.firstName, name.get("FirstName"));
	   sendText(add.middleName, name.get("MiddleName"));
	   sendText(add.lastName, name.get("LastName"));
	 
   }
}
@And("I enter employee deteails")
public void i_enter_employee_deteails(DataTable dataTables) {
	 List<Map<String,String>> variables=dataTables.asMaps();
	 for(Map<String,String> variable:variables) {
		 		sendText(add.DLNumber, variable.get("DLNumber"));
		 		sendText(add.LEDate, variable.get("LEDate"));
		 		sendText(add.SSN, variable.get("SSN"));
		 		sendText(add.OtherId, variable.get("OtherId"));
		 		sendText(add.SIN, variable.get("SIN"));
		 		sendText(add.NickName, variable.get("NickName"));
		 		sendText(add.MilitaryService, variable.get("MilitaryService"));
		 		sendText(add.Nationality, variable.get("Nationality"));
		 		sendText(add.DofB, variable.get("DofB"));
		 		//clickRadio(add.Gender,variable.get("Gender"));
		 		sendText(add.MaritalStatus, variable.get("MaritalStatus"));	
	 }
}


@Then("I click on Save button")
public void i_click_on_Save_button() throws InterruptedException {
	Thread.sleep(30000);
    click(add.saveButton);
}


}
