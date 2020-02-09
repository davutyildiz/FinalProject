package com.hrms.steps;

import com.hrms.utils.CommonMethods;
import cucumber.api.java.en.When;

public class AddDependent extends CommonMethods {

	@When("Click on Dependents Menu Item")
	public void click_on_Dependents_Menu_Item() throws InterruptedException {
		click(dependent.DependentsLink);
		Thread.sleep(3000);

	}

	@When("Click Add on Assigned Dependents Page")
	public void click_Add_on_Assigned_Dependents_Page() throws InterruptedException {
		click(dependent.btnAddDependent);
		Thread.sleep(5000);
	}

	@When("Add Name of Dependent")
	public void add_Name_of_Dependent() {
		sendText(dependent.dependent_name,"Ivana Trump");
	
	}

	@When("Choose Child  Relationship Options")
	public void choose_Child_Relationship_Options() {
	}

	@When("Add DOB of Dependent {string}")
	public void add_DOB_of_Dependent(String string) {
	}

	@When("Click Save on Add Dependent Page")
	public void click_Save_on_Add_Dependent_Page() {
	}
}
