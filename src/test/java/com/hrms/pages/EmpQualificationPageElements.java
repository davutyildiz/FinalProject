package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmpQualificationPageElements {

	@FindBy(xpath = "//*[@id=\"sidenav\"]/li[10]/a")
	public WebElement Qualifications;
	// WorkExperience
	@FindBy(id = "addWorkExperience")
	public WebElement WorkExperience;
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
	// Education
//	@FindBy(id = "addEducation")
//	public WebElement Eduacation;
//	@FindBy(id="education_code")
//	public WebElement EduCode;
//	@FindBy(id = "education_institute")
//	public WebElement EduInstitute;
//	@FindBy(id = "education_major")
//	public WebElement EduMajor;
//	@FindBy(id = "education_year")
//	public WebElement EduYear;
//	@FindBy(id = "education_gpa")
//	public WebElement EduGpa;
//	@FindBy(id = "education_start_date")
//	public WebElement EduStartdate;
//	@FindBy(xpath="//select[@class='ui-datepicker-month']")
//	public WebElement EduStartMonth;
//	@FindBy(xpath="//select[@class='ui-datepicker-year']")
//	public WebElement EduStartYear;
//	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td")
//	public List<WebElement> EduStartDay;
//	@FindBy(id = "education_end_date")
//	public WebElement EduEnddate;
//	@FindBy(xpath="//select[@class='ui-datepicker-month']")
//	public WebElement EduEndMonth;
//	@FindBy(xpath="//select[@class='ui-datepicker-year']")
//	public WebElement EduEndtYear;
//	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td")
//	public List<WebElement> EduEndDay;
//	@FindBy(id="btnEducationSave")
//	public WebElement EduSave;
	// Skill
	@FindBy(id = "addSkill")
	public WebElement Skill;
	@FindBy(xpath="//select[@name='skill[code]']")
	public WebElement SkillCode;
	@FindBy(id = "skill_years_of_exp")
	public WebElement SkillExpYear;
	@FindBy(id = "skill_comments")
	public WebElement SkillComment;
	@FindBy(id="btnSkillSave")
	public WebElement SkillSave;
	// Language
	@FindBy(id = "addLanguage")
	public WebElement Language;
	@FindBy(id = "language_code")
	public WebElement LanguageCode;
	@FindBy(id = "language_lang_type")
	public WebElement LanguageFluency;
	@FindBy(id = "language_competency")
	public WebElement LanguageCompetency;
	@FindBy(id = "language_comments")
	public WebElement LanguageComments;
	@FindBy(id="btnLanguageSave")
	public WebElement LanguageSave;
	
	// License
	@FindBy(id = "addLicense")
	public WebElement License;
	@FindBy(id = "license_code")
	public WebElement LicenseType;
	@FindBy(id = "license_license_no")
	public WebElement LicenseNo;
	@FindBy(id = "license_date")
	public WebElement LicenseIssuedDate;
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	public WebElement LicenseIssuedMonth;
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	public WebElement LicenseIssuedYear;
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td")
	public List<WebElement> LicenseIssuedDay;
	@FindBy(id = "license_renewal_date")
	public WebElement LicenseExpiryDate;
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	public WebElement LicenseExpiryMonth;
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	public WebElement LicenseExpiryYear;
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td")
	public List<WebElement> LicenseExpiryDay;
	@FindBy(id="btnLicenseSave")
	public WebElement LicenseSave;
	
	// Attachement
	@FindBy(id = "btnAddAttachment")
	public WebElement Attachments;

	@FindBy(id = "ufile")
	public WebElement AttachementUploadFile;

	@FindBy(id = "txtAttDesc")
	public WebElement CommentAttachement;
	@FindBy(id="btnSaveAttachment")
	public WebElement AttachementUpload;
    
    
    
	

	

	





	public EmpQualificationPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
