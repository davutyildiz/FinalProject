package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPageElements {

	@FindBy(xpath = "//*[@id=\"sidenav\"]/li[6]/a")
	public WebElement jobBtn;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);

	}
}
