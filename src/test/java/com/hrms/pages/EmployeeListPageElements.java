package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeListPageElements {
	
	@FindBy(id = "empsearch_id")
	public WebElement empId;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td[2]")
	public WebElement tableCell;
		
	public EmployeeListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
