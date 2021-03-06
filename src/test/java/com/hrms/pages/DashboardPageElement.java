package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class DashboardPageElement {

	@FindBy(linkText = "PIM")
	public WebElement pim;

	public DashboardPageElement() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
