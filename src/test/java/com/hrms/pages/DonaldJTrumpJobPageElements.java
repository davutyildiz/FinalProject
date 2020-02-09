package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class DonaldJTrumpJobPageElements {

	@FindBy(id = "btnSave")
	public WebElement editSaveBtn;

	@FindBy(id = "job_job_title")
	public WebElement jobTitleDD;

	@FindBy(id = "job_emp_status")
	public WebElement empStatusDD;

	@FindBy(id = "job_eeo_category")
	public WebElement jobCatDD;

	@FindBy(xpath = "//*[@id=\"frmEmpJobDetails\"]/fieldset/ol/li[5]/img")
	public WebElement joinedDateCal;

	@FindBy(id = "job_sub_unit")
	public WebElement subUnitDD;

	@FindBy(id = "job_location")
	public WebElement locationDD;

	@FindBy(xpath = "//*[@id=\"frmEmpJobDetails\"]/fieldset/ol/li[9]/img")
	public WebElement startDateCal;

	@FindBy(xpath = "//*[@id=\"frmEmpJobDetails\"]/fieldset/ol/li[10]/img")
	public WebElement endDateCal;

	@FindBy(id = "job_contract_file")
	public WebElement cntrDetailsChooseFile;

	@FindBy(id = "btnAddAttachment")
	public WebElement addBtnAttachments;

	public DonaldJTrumpJobPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
