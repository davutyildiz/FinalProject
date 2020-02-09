package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class TrumpElementInTable {

	@FindBy(linkText = "Trump")
	public WebElement trump;

	public TrumpElementInTable() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
