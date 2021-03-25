package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;

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
		 		//sendText(addEmployee.SSN, variable.get("SSN"));
		 		sendText(addEmployee.OtherId, variable.get("OtherId"));
		 		//sendText(addEmployee.SIN, variable.get("SIN"));
		 		sendText(addEmployee.NickName, variable.get("NickName"));
		 		sendText(addEmployee.MilitaryService, variable.get("MilitaryService"));
		 		
		 		selectDropddownValue(addEmployee.Nationality, variable.get("Nationality"));
		 		sendText(addEmployee.DofB, variable.get("DofB"));
		 		clickRadio(addEmployee.Genders,variable.get("Genders"));
		 		selectDropddownValue(addEmployee.MaritalStatus, variable.get("MaritalStatus"));	
	 }
}


@Then("I click on Save button")
public void i_click_on_Save_button() throws InterruptedException {
	Thread.sleep(30000);
    click(addEmployee.saveButton);
}

@Then("I click to be abel to add attachment from PC")
public void i_click_to_be_abel_to_add_attachment_from_PC() throws InterruptedException {
	Thread.sleep(30000);

	click(addEmployee.editToAddAttachment);
}

@Then("I choose file from my PC")
public void i_choose_file_from_my_PC() throws InterruptedException {
	Thread.sleep(30000);

	//addEmployee.chooseFileFromComputer.sendKeys("/Users/selmatop/Documents/Book1.xlsx"); //this is where the file is.
	
	addEmployee.chooseFileFromComputer.sendKeys(Constants.UPLOAD_FILES_PATH+"Gru.jpg");
	   Thread.sleep(1000); 
	   sendText(addEmployee.Comment,"Handsome Gruuuuuu");
}

@Then("I click to save attached file from my PC")
public void i_click_to_save_attached_file_from_my_PC() {
  
	click(addEmployee.saveAddedAttachment);
}



@When("I click on Image at the left")
public void i_click_on_Image_at_the_left() throws InterruptedException {
   click(addEmployee.EmpPhoto);
   Thread.sleep(4000);
}

@When("I choose Employee Photograph")
public void i_choose_Employee_Photograph() throws InterruptedException {
    jsClick(addEmployee.EmpPhotoFile);
    Thread.sleep(4000); 
    addEmployee.EmpPhotoFile.sendKeys(Constants.UPLOAD_FILES_PATH+"Gru.jpg");
	   Thread.sleep(4000); 
}

@Then("I click to Upload")
public void i_click_to_Upload() throws InterruptedException {
   jsClick(addEmployee.EmpPhotoSave);
   Thread.sleep(4000);
}



}
