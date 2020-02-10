package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class AddEmployeePageElements {
	@FindBy(id = "personal_txtEmpFirstName")
	public WebElement firstName;

	@FindBy(id = "personal_txtEmpMiddleName")
	public WebElement middleName;
	
	@FindBy(id = "personal_txtEmpLastName")
	public WebElement lastName;
	
	@FindBy(id = "chkLogin")
	public WebElement createLoginDetails;
	
	@FindBy(id = "user_name")
	public WebElement username;
	
	@FindBy(id = "user_password")
	public WebElement userPassword;
	
	@FindBy(id = "re_password")
	public WebElement confirmUserPassword;
	
	@FindBy(id = "btnSave")
	public WebElement saveBtn;
	
	@FindBy(id = "employeeId")
	public WebElement empId;
	
	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmp;
	
	@FindBy(id= "personal_txtLicenNo")
	public WebElement DLNumber;

	@FindBy(id= "personal_txtLicExpDate")
	public WebElement LEDate;
	
	@FindBy(id= "personal_txtNICNo")
	public WebElement SSN;
	
	@FindBy(id= "personal_txtOtherID")
	public WebElement  OtherId;
	
	@FindBy(id= "personal_txtSINNo")
	public WebElement  SIN;

	@FindBy(id= "personal_txtEmpNickName")
	public WebElement NickName ;
	
	@FindBy(id= "personal_txtMilitarySer")
	public WebElement  MilitaryService;
	
	@FindBy(id= "personal_cmbNation")
	public WebElement Nationality ;
	
	@FindBy(id= "personal_DOB")
	public WebElement DofB  ;
	
	@FindBy(name= "personal[optGender]")
	public List<WebElement> Genders;
	
	@FindBy(id= "personal_cmbMarital")
	public WebElement MaritalStatus;
	
	@FindBy(id= "btnSave")
	public WebElement saveButton;
	
	@FindBy(id= "btnSave")
	public WebElement editButton;

	public AddEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
