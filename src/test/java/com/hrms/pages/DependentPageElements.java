package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DependentPageElements extends CommonMethods{
	
	@FindBy(linkText = "Dependents")
	public WebElement DependentsLink;
	
	@FindBy(id = "btnAddDependent")
	public WebElement btnAddDependent;
	
	@FindBy(id = "dependent_name")
	public WebElement dependent_name;
	
	@FindBy(id = "dependent_relationshipType")
	public WebElement dependent_relationshipType;
	
	
	public DependentPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
