package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmergencyContactSteps extends CommonMethods {

	@Given("I click on emergency contact")
	public void i_click_on_emergency_contact() {
	   click(empEContact.empEmergencyContacts); 

	}

	@When("I click on add contact to add contact information")
	public void i_click_on_add() {
		click(empEContact.addContactBtn);   

	}

	@When("I send contact name and all phone numbers")
	public void i_send_all_information() {
		sendText(empEContact.emgContactsName, "Monica Taler");  
		sendText(empEContact.emgContactsRelationship, "Wife");
		sendText(empEContact.emgContactsHomePhone, "123-213-4455");
		sendText(empEContact.emgContactsMobilePhone, "987-234-1212");
		sendText(empEContact.emgContactsWorkPhone, "453-675-9988");
	}
	
	@When("I send {string}, {string}, {string}, {string} and {string}")
	public void i_send_and(String name, String relationship, String homePhone, String mobilePhone, String workPhone) {
		sendText(empEContact.emgContactsName, name);  
		sendText(empEContact.emgContactsRelationship, relationship);
		sendText(empEContact.emgContactsHomePhone, homePhone);
		sendText(empEContact.emgContactsMobilePhone, mobilePhone);
		sendText(empEContact.emgContactsWorkPhone, workPhone);
	}
	

	@When("I click on save to save emergency contact")
	public void i_click_on_save() {
		click(empEContact.SaveEContactBtn);   

	}
	
	@Then("I click on add attachment for emergency contact")
	public void i_click_on_add_attachment_for_emergency_contact() throws InterruptedException {
	    click(empEContact.AddAttachmentBtn);
	    Thread.sleep(3000);
		
	}
	
	@Then("I click on upload file button")
	public void i_click_on_upload_file_button() throws InterruptedException {
		click(empEContact.UploadFile);
		Thread.sleep(3000);
	}
	
	
}
