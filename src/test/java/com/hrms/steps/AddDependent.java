package com.hrms.steps;

import org.openqa.selenium.support.ui.Select;

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

	@When("Add Name of Dependent {string}")
	public void add_Name_of_Dependent(String string) {
		sendText(dependent.dependent_name, string);

	}

	@When("Choose Child  Relationship Options")
	public void choose_Child_Relationship_Options() throws InterruptedException {
		click(dependent.dependent_relationshipType);
		Select relation = new Select(dependent.dependent_relationshipType);
		relation.selectByVisibleText("Child");
		Thread.sleep(2000);
	}

	@When("Add DOB of Dependent {string}")
	public void add_DOB_of_Dependent(String string) throws InterruptedException {
		sendText(dependent.dependent_dateOfBirth, string);
		Thread.sleep(2000);

	}

	@When("Click Save on Add Dependent Page")
	public void click_Save_on_Add_Dependent_Page() throws InterruptedException {
		click(dependent.btnSaveDependent);
		Thread.sleep(3000);

	}

	@When("Choose Other  Relationship Options")
	public void choose_Other_Relationship_Options() throws InterruptedException {
		
		sendText(dependent.dependent_relationship, "wife");
		Thread.sleep(3000);

	}
}
