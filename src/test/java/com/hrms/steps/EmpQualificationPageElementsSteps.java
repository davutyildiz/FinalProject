package com.hrms.steps;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmpQualificationPageElementsSteps extends CommonMethods {

	@When("I click  on Qualification")
	public void i_click_on_Qualification() throws InterruptedException {
		click(empQualification.Qualifications);
		Thread.sleep(2000);
	}
	 // WorkExperience
	@When("I click  Add WorkExperience")
	public void i_click_Add_WorkExperience() throws InterruptedException {
		click(empQualification.WorkExperience);
		Thread.sleep(2000);
	}
	@When("I enter Work details")
	public void i_enter_Work_details() {
		sendText(empQualification.companyName, "PioneerAcademy");
		sendText(empQualification.jobtitle, "IT manager");
		
		click(empQualification.experienceDateFrom);

		Select fromMonth = new Select(empQualification.WorkExpFromMonth);
		fromMonth.selectByVisibleText("May");
		Select fromYear=new Select(empQualification.WorkExpFromYear);
		fromYear.selectByVisibleText("2000");
		
		List<WebElement> fromDays= empQualification.WorkExpFromDay;
		for (WebElement fromCell : fromDays) {
			String Day = fromCell.getText();
			if (Day.equals("10")) {
				fromCell.click();
				break;
			}
		}
	click(empQualification.experienceDateTo);
	
	Select toMonth = new Select(empQualification.WorkExpFromMonth);
	toMonth.selectByVisibleText("Apr");
	Select toYear=new Select(empQualification.WorkExpFromYear);
	toYear.selectByVisibleText("2010");
	
	List<WebElement> toDays= empQualification.WorkExpFromDay;
	for (WebElement fromCell : toDays) {
		String fromDay = fromCell.getText();
		if (fromDay.equals("21")) {
			fromCell.click();
			break;
		}
	}
		sendText(empQualification.experienceComment, "EXPERIENCED QA ENGINEER");
	}

	@Then("I click on save button work Experience")
	public void i_click_on_save_button_work_Experience() {
		click(empQualification.saveWorkExp);
	}
	// education
//	@When("I click on Add education")
//	public void i_click_on_Add_education() {
//		click(empQualification.Eduacation);
//	}
//	@When("I enter education details")
//	public void i_enter_education_details() throws InterruptedException {
//	   Select selectEduCode=new Select(empQualification.EduCode);
//	   selectEduCode.selectByValue("6");
//	   Thread.sleep(1000);
//	   sendText(empQualification.EduInstitute,"Princton University");
//	   Thread.sleep(1000);
//	   sendText(empQualification.EduMajor,"Computer Science");
//	   Thread.sleep(1000);
//	   sendText(empQualification.EduYear,"2000");
//	   Thread.sleep(1000);
//	   sendText(empQualification.EduGpa,"3.90");
//	   Thread.sleep(1000);
//	   click(empQualification.EduStartdate);
//	   Thread.sleep(1000);
//	   Select selectEduStartMonth=new Select(empQualification.EduStartMonth);
//	   selectEduStartMonth.selectByValue("9");
//	   Thread.sleep(1000);
//	   Select selectEduStartYear=new Select(empQualification.EduStartYear);
//	   selectEduStartYear.selectByValue("1996");
//	   Thread.sleep(1000);
//	   List<WebElement>selectEduStartDay=empQualification.EduStartDay;
//	   for (WebElement fromCell :selectEduStartDay ) {
//			String fromDay = fromCell.getText();
//			if (fromDay.equals("21")) {
//				fromCell.click();
//				break;
//			}
//		}
//	   Thread.sleep(1000);
//	   click(empQualification.EduEnddate);
//	   Select selectEduEndtMonth=new Select(empQualification.EduEndMonth);
//	   selectEduStartMonth.selectByValue("8");
//	   Thread.sleep(1000);
//	   Select selectEduEndYear=new Select(empQualification.EduEndtYear);
//	   selectEduStartYear.selectByValue("2000");
//	   Thread.sleep(1000);
//	   List<WebElement>selectEduEndDay=empQualification.EduEndDay;
//	   for (WebElement fromCell :selectEduEndDay ) {
//			String fromDay = fromCell.getText();
//			if (fromDay.equals("15")) {
//				fromCell.click();
//				break;
//			}
//		}
//	   Thread.sleep(1000);
//	}
//	@Then("I click save button Education")
//	public void i_click_save_button_Education() throws InterruptedException {
//		click(empQualification.EduSave);
//		   Thread.sleep(1000);
//	}
	// Skill 
	@When("I click on Add skill")
	public void i_click_on_Add_skill() throws InterruptedException {
	click(empQualification.Skill);
	 Thread.sleep(2000);
	}
	@When("I enter skill details")
	public void i_enter_skill_details() throws InterruptedException {
	Select selectSkill=new Select(empQualification.SkillCode);
	selectSkill.selectByValue("393");
	 Thread.sleep(1000);
	sendText(empQualification.SkillExpYear,"10");
	sendText(empQualification.SkillComment,"Qualify");
	}
	@Then("I click save button Skill")
	public void i_click_save_button_Skill() throws InterruptedException {
	    click(empQualification.SkillSave);
	    Thread.sleep(1000);
	}
	// language
	@When("I click on Add language")
	public void i_click_on_Add_language() throws InterruptedException {
	 click(empQualification.Language);
	 Thread.sleep(1000);
	}
	@When("I enter language details")
	public void i_enter_language_details() throws InterruptedException {
	   Select LangCode=new Select(empQualification.LanguageCode);
	   LangCode.selectByValue("429");
	   Thread.sleep(1000);
	   Select LangFluency=new Select(empQualification.LanguageFluency);
	   LangFluency.selectByValue("3");
	   Thread.sleep(1000);
	   Select LangCompetency=new Select(empQualification.LanguageCompetency);
	   LangCompetency.selectByValue("4");
	   Thread.sleep(1000);
	   sendText(empQualification.LanguageComments,"Mother Tongue");
	}
	@Then("I click save button language")
	public void i_click_save_button_language() throws InterruptedException {
	   click(empQualification.LanguageSave);
	   Thread.sleep(1000);
	}
	// license
	@When("I click on Add License")
	public void i_click_on_Add_License() throws InterruptedException {
	   click(empQualification.License);
	   Thread.sleep(1000);
	}
	@When("I enter license details")
	public void i_enter_license_details() throws InterruptedException {
	   Select LcnType=new Select(empQualification.LicenseType);
	   LcnType.selectByValue("230");
	   Thread.sleep(1000);
	   sendText(empQualification.LicenseNo,"Y342512345");
	   click(empQualification.LicenseIssuedDate);
	   Thread.sleep(1000);
	   
	  
	   Select selectLicenseIssudtMonth=new Select(empQualification.LicenseIssuedMonth);
	   selectLicenseIssudtMonth.selectByValue("1");
	   Thread.sleep(1000);
	   Select selectLicenseIssudYear=new Select(empQualification.LicenseIssuedYear);
	   selectLicenseIssudYear.selectByValue("1996");
	   Thread.sleep(1000);
	   List<WebElement>selectLicenseIssudtDay=empQualification.LicenseIssuedDay;
	   for (WebElement fromCell :selectLicenseIssudtDay ) {
			String fromDay = fromCell.getText();
			if (fromDay.equals("1")) {
				fromCell.click();
				break;
			}
		}
	   Thread.sleep(1000);
	   click(empQualification.LicenseExpiryDate);
	   Thread.sleep(1000);
	   Select selectLicenseExpiryMonth=new Select(empQualification.LicenseExpiryMonth);
	   selectLicenseExpiryMonth.selectByValue("7");
	   Thread.sleep(1000);
	   Select selectLicenseExpiryYear=new Select(empQualification.LicenseExpiryYear);
	   selectLicenseExpiryYear.selectByValue("2022");
	   Thread.sleep(1000);
	   List<WebElement>selectLicenseExpiryDay=empQualification.LicenseExpiryDay;
	   for (WebElement fromCell :selectLicenseExpiryDay ) {
			String fromDay = fromCell.getText();
			if (fromDay.equals("15")) {
				fromCell.click();
				break;
			}
		}
	   Thread.sleep(1000);
	   
	 
	}

	@Then("I click save button license")
	public void i_click_save_button_license() throws InterruptedException {
	    click(empQualification.LicenseSave);
	    Thread.sleep(1000);
	}
	
	// attachement
	@When("I click on Add attachements")
	public void i_click_on_Add_attachements() throws InterruptedException {
	  click(empQualification.Attachments);
	  Thread.sleep(1000); 
	}

	@When("I enter attachements details")
	public void i_enter_attachements_details() throws InterruptedException {
	   empQualification.AttachementUploadFile.sendKeys(Constants.UPLOAD_FILES_PATH+"Gru.jpg");
	   Thread.sleep(1000); 
	   sendText(empQualification.CommentAttachement,"Handsome Gruuuuuu");
	}

	
	@Then("I click save button Attachements")
	public void i_click_save_button_Attachements() throws InterruptedException {
	   click(empQualification.AttachementUpload);
	   Thread.sleep(1000); 
	}
	

}
