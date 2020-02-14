package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class PersonalDetailsPageElements extends CommonMethods {

	
	
	//1. Try a different method to get the button!!!Or two
	
	//2. Try to get a button close to this button.
	@FindBy(linkText = "Job")
	public WebElement jobBtn;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);

	}
}