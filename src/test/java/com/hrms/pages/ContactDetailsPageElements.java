package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ContactDetailsPageElements {

	@FindBy(xpath = "//a[text()='Contact Details']")
	public WebElement contactDetLink;

	@FindBy(id = "btnSave")
	public WebElement conSave_editBtn;

	@FindBy(id = "contact_street1")
	public WebElement conAdress1;

	@FindBy(id = "contact_city")
	public WebElement conCity;

	@FindBy(id = "contact_state")
	public WebElement conState;

	@FindBy(id = "contact_emp_zipcode")
	public WebElement conZipCode;

	@FindBy(id = "contact_country")
	public WebElement conCountry;

	@FindBy(id = "contact_emp_mobile")
	public WebElement conMobile;

	@FindBy(id = "contact_emp_work_email")
	public WebElement conMail;
	
	public ContactDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
