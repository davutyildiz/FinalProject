package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ContactDetailsSteps extends CommonMethods {

	@When("I click on Contact Details and Edit button")
	public void i_click_on_Contact_Details_and_Edit_button() {
		click(contactDetails.contactDetLink);
		click(contactDetails.conSave_editBtn);
	}

	@And("I add adress details")
	public void i_add_adress_details(DataTable addContAdress) throws InterruptedException {
		List<Map<String, String>> addContAdressList = addContAdress.asMaps();

		for (Map<String, String> map : addContAdressList) {

			sendText(contactDetails.conAdress1, map.get("Address Street 1"));
			sendText(contactDetails.conCity, map.get("City"));

			Thread.sleep(4000);
			selectDropddownValue(contactDetails.conCountry, map.get("Country"));
			Thread.sleep(5000);		

			selectDropddownValue(contactDetails.conState, map.get("State/Province"));
			Thread.sleep(4000);

			sendText(contactDetails.conZipCode, map.get("Zip/Postal Code"));
			
			

		}

	}

	@Then("I insert mobile number")
	public void i_insert_mobile_number() {
		sendText(contactDetails.conMobile, "+15512501234");
	}

	@Then("I insert work mail")
	public void i_insert_work_mail() {
		sendText(contactDetails.conMail, "RodinStar@gmail.com");
	}

	@Then("I click on conDet_Save button")
	public void i_click_on_conDet_Save_button() {
		click(contactDetails.conSave_editBtn);
	}
	
}
