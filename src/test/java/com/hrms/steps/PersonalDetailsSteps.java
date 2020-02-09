package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class PersonalDetailsSteps extends CommonMethods{
	@When("I click on edit button")
	public void i_click_on_edit_button() throws InterruptedException {
		click(addEmployee.editButton);
		Thread.sleep(3000);
	}
@When("I enter employee names")
public void i_enter_employee_names(DataTable dataTable) {
   List<Map<String,String>> names=dataTable.asMaps();
   for(Map<String,String> name:names) {
	   sendText(addEmployee.firstName, name.get("FirstName"));
	   sendText(addEmployee.middleName, name.get("MiddleName"));
	   sendText(addEmployee.lastName, name.get("LastName"));
	
   }
}
@And("I enter employee details")
public void i_enter_employee_details(DataTable dataTables) {
	 List<Map<String,String>> variables=dataTables.asMaps();
	 for(Map<String,String> variable:variables) {
		 		sendText(addEmployee.DLNumber, variable.get("DLNumber"));
		 		sendText(addEmployee.LEDate, variable.get("LEDate"));
		 		sendText(addEmployee.SSN, variable.get("SSN"));
		 		sendText(addEmployee.OtherId, variable.get("OtherId"));
		 		sendText(addEmployee.SIN, variable.get("SIN"));
		 		sendText(addEmployee.NickName, variable.get("NickName"));
		 		sendText(addEmployee.MilitaryService, variable.get("MilitaryService"));
		 		sendText(addEmployee.Nationality, variable.get("Nationality"));
		 		sendText(addEmployee.DofB, variable.get("DofB"));
		 		clickRadio(addEmployee.Genders,variable.get("Male"));
		 		sendText(addEmployee.MaritalStatus, variable.get("MaritalStatus"));	
	 }
}


@Then("I click on Save button")
public void i_click_on_Save_button() throws InterruptedException {
	Thread.sleep(30000);
    click(addEmployee.saveButton);
}


}
