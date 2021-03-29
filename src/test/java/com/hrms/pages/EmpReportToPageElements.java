package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmpReportToPageElements {
	
	@FindBy(linkText = "Report-to")
	public WebElement ReportTo;

	@FindBy(id="btnAddSupervisorDetail")
	public WebElement AddSupervisors;
	
	
	@FindBy(id="reportto_supervisorName_empName")
	public WebElement SupervisorName;
	
	@FindBy(id="reportto_reportingMethodType")
	public WebElement reportingMehtod;
	
	@FindBy(id="btnSaveReportTo")
	public WebElement SaveReporing;
	
	

	
	public EmpReportToPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
