package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmpQualificationPageElements {

	@FindBy(xpath = "//*[@id='sidenav']/li[10]")
	public WebElement Qualifications;
	
	@FindBy(id = "addWorkExperience")
	public WebElement WorkExperience;

	@FindBy(id = "addEducation")
	public WebElement Eduacation;

	@FindBy(id = "addSkill")
	public WebElement Skill;

	@FindBy(id = "addLanguage")
	public WebElement Language;

	@FindBy(id = "addLicense")
	public WebElement License;

	@FindBy(id = "btnAddAttachment")
	public WebElement Attachments;

	@FindBy(id = "experience_employer")
	public WebElement companyName;

	@FindBy(id = "experience_jobtitle")
	public WebElement jobtitle;

	@FindBy(id = "experience_from_date")
	public WebElement experienceDateFrom;
	
    @FindBy(xpath="//select[@class='ui-datepicker-month']")
	public WebElement WorkExpFromMonth;
    
    @FindBy(xpath="//select[@class='ui-datepicker-year']")
	public WebElement WorkExpFromYear;
    
    @FindBy(xpath="//table[@class='ui-datepicker-calendar']//tbody/tr/td")
    public List<WebElement> WorkExpFromDay;
    
    @FindBy(id = "experience_to_date")
	public WebElement experienceDateTo;

    @FindBy(xpath="//select[@class='ui-datepicker-month']")
    public WebElement WorkExpToMonth;
    @FindBy(xpath="//select[@class='ui-datepicker-year']")
   	public WebElement WorkExpToYear;
    @FindBy(xpath="//table[@class='ui-datepicker-calendar']//tbody/tr/td")
    public List<WebElement> WorkExpToDay;
    
    
    
    
	@FindBy(id = "experience_comments")
	public WebElement experienceComment;
	
	@FindBy(id="btnWorkExpSave")
	public WebElement saveWorkExp;

	@FindBy(id = "education_institute")
	public WebElement Institute;

	@FindBy(id = "education_major")
	public WebElement edMajor;

	@FindBy(id = "education_year")
	public WebElement edYear;

	@FindBy(id = "education_gpa")
	public WebElement edGpa;

	@FindBy(id = "education_start_date")
	public WebElement edStartdate;

	@FindBy(id = "education_end_date")
	public WebElement edEndDate;

	@FindBy(id = "skill_code")
	public WebElement Skilcode;

	@FindBy(id = "skill_years_of_exp")
	public WebElement Skillexpyear;
	@FindBy(id = "skill_comments")
	public WebElement SkillComment;

	@FindBy(id = "language_code")
	public WebElement language;
	@FindBy(id = "language_lang_type")
	public WebElement lagfluency;
	@FindBy(id = "language_competency")
	public WebElement langCompetency;
	@FindBy(id = "language_comments")
	public WebElement langComments;

	@FindBy(id = "license_code")
	public WebElement LicenseType;
	@FindBy(id = "license_license_no")
	public WebElement licenseNo;

	@FindBy(id = "license_date")
	public WebElement LicenseIssuedDate;
	@FindBy(id = "license_renewal_date")
	public WebElement LicenseExpiryDate;

	@FindBy(id = "ufile")
	public WebElement SelectAttachementFile;

	@FindBy(id = "txtAttDesc")
	public WebElement CommentAttachement;

	public EmpQualificationPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
