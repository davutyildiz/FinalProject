package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class TaxExemptionsPageElements {

	//To the page
	@FindBy(linkText = "Tax Exemptions")
	public WebElement empTaxExemptions;
	
	// To edit
	@FindBy(id = "btnSave")
	public WebElement empTaxExemptionsEdit;
	
	
	// Federal Income Tax
	@FindBy(id = "tax_federalStatus")
	public WebElement empTaxFederalStatus;
	
	@FindBy(id = "tax_federalExemptions")
	public WebElement empTaxFederalExemption;

	//State Income Tax
	@FindBy(id = "tax_state")
	public WebElement empTaxStateState;
	
	@FindBy(id = "tax_stateStatus")
	public WebElement empTaxStateStatus;
	
	@FindBy(id = "tax_stateExemptions")
	public WebElement empTaxStateExemption;
	
	@FindBy(id = "tax_unempState")
	public WebElement empTaxUnempState;
	
	@FindBy(id = "tax_workState")
	public WebElement empTaxWorkState;
	
	
	// To edit
		@FindBy(id = "btnSave")
		public WebElement empTaxExemptionsSave;
		
	// To activate to add attachment
		@FindBy(id = "btnAddAttachment")
		public WebElement empTaxExemptionsAddAttachment;
		
	// To choose file from computer
		@FindBy(id = "ufile")
		public WebElement empTaxExemptionsChooseAttachment;
	
	// To save added attachment
		@FindBy(id = "btnSaveAttachment")
		public WebElement empTaxExemptionsSaveAttachment;
		
		
		
		
	public TaxExemptionsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
