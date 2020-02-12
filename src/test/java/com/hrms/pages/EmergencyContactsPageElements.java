<<<<<<< HEAD
package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmergencyContactsPageElements {

	
	@FindBy(linkText = "Emergency Contacts")
	public WebElement empEmergencyContacts;

	@FindBy(id = "btnAddContact")
	public WebElement addContactBtn;
	
	@FindBy(id = "emgcontacts_name")
	public WebElement emgContactsName;
	
	@FindBy(id = "emgcontacts_relationship")
	public WebElement emgContactsRelationship;
	
	@FindBy(id = "emgcontacts_homePhone")
	public WebElement emgContactsHomePhone;
	
	@FindBy(id = "emgcontacts_mobilePhone")
	public WebElement emgContactsMobilePhone;
	
	@FindBy(id = "emgcontacts_workPhone")
	public WebElement emgContactsWorkPhone;
	
	@FindBy(id = "btnSaveEContact")
	public WebElement SaveEContactBtn;
	
	// adding attachment webelement
	@FindBy(id = "btnAddAttachment")
	public WebElement AddAttachmentBtn;
	
	@FindBy(id="ufile")	
	public WebElement UploadFile;
	
	@FindBy(id="btnSaveAttachment")	
	public WebElement UploadFileSave;
	
	
	public EmergencyContactsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
=======
package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmergencyContactsPageElements {

	
	@FindBy(linkText = "Emergency Contacts")
	public WebElement empEmergencyContacts;

	@FindBy(id = "btnAddContact")
	public WebElement addContactBtn;
	
	@FindBy(id = "emgcontacts_name")
	public WebElement emgContactsName;
	
	@FindBy(id = "emgcontacts_relationship")
	public WebElement emgContactsRelationship;
	
	@FindBy(id = "emgcontacts_homePhone")
	public WebElement emgContactsHomePhone;
	
	@FindBy(id = "emgcontacts_mobilePhone")
	public WebElement emgContactsMobilePhone;
	
	@FindBy(id = "emgcontacts_workPhone")
	public WebElement emgContactsWorkPhone;
	
	@FindBy(id = "btnSaveEContact")
	public WebElement SaveEContactBtn;
	
	// adding attachment webelement
	@FindBy(id = "btnAddAttachment")
	public WebElement AddAttachmentBtn;
	
	@FindBy(id="ufile")	
	public WebElement UploadFile;
	
	
	public EmergencyContactsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
>>>>>>> 906e399aa7b18c72d4cc2162cf5449b8f2c06982
