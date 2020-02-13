package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;


public class SalaryPage{
	
	@FindBy(xpath="//select[@id='salary_sal_grd_code']")
	public WebElement paygradeselect;
	
	@FindBy(id="addSalary")
	public WebElement addsalarybtn;
	
	@FindBy(linkText="Salary")
	public WebElement salarylink;
	
	@FindBy(xpath="//a[contains(text(),'Donld J')]")
	public WebElement searchconfirm;
	
	@FindBy(xpath="	//input[@id='personal_txtEmployeeId'] ")
	public WebElement idconfirmbox;
	
	@FindBy(id="salary_salary_component")
	public WebElement salarycomponent;

	@FindBy(id="salary_payperiod_code")
	public WebElement selectsalaryperiod;
	
	@FindBy(xpath="//select[@name='salary[currency_id]']")
	public WebElement selectcurrency;
	
	@FindBy(id="salary_basic_salary")
	public WebElement salaryamanount;
	
	@FindBy(id="salary_comments")
	public WebElement salarycomment;
	
	 @FindBy(id="salary_set_direct_debit")
	 public WebElement checkboxofdepositdetails;
	 
	 @FindBy(id="directdeposit_account")
	 public WebElement accountnumber;
	 
	 @FindBy(id="directdeposit_account_type")
	 public WebElement selectaccounttype;
	 
	 @FindBy(xpath="//input[@id='directdeposit_routing_num']")
	 public WebElement routingnumber;
	 
	 @FindBy(id="directdeposit_amount")
	 public WebElement directdepositamount;
	 
	 @FindBy(id="btnSalarySave")
	 public WebElement salarysavebtn;
	 
	 @FindBy(id="btnAddAttachment")
	 public WebElement attchementbtn;
	 
	 @FindBy(id="ufile")
	 public WebElement choosefilebtn;
	 
	 @FindBy(id="txtAttDesc")
	 public WebElement textare;
	 
	 @FindBy(id="btnSaveAttachment")
	 public WebElement attachmentuploadbtn;
	 
	 @FindBy(xpath="//*[contains(text(),'Successfully Saved')]")
	 public WebElement savedmsg;
	 
	 //addin attachment
	 
	 @FindBy(id="btnAddAttachment")
		public WebElement addattachbtn;
	 
	 @FindBy(id="ufile")
	 public WebElement chosefilebtn;
	 
	 @FindBy(id="btnSaveAttachment")
	 public WebElement fileuploadbtn;
	 
	 @FindBy(xpath="//a[@class='fileLink tiptip']")
	 public WebElement validmsg;
	 
	 @FindBy(id="txtAttDesc")
	 public WebElement addfilecomment;
	 
	 @FindBy(xpath="//*[@id=\"tblAttachments\"]/tbody/tr/td[1]") // or *[@id="tblAttachments"]/tbody/tr/td[1]/input
	 public WebElement checkboxinsearch;
	
	 @FindBy(xpath="//*[@id=\"tblAttachments\"]/tbody/tr/td[2]")
	 public WebElement attachedfilethere;
	//*[@id="tblAttachments"]/tbody/tr/td[2]/a
	 
	
	@FindBy(id="btnDeleteAttachment")
	public WebElement attachdeletebtn;
	
	@FindBy(xpath="//*[contains(text(),'Successfully Deleted')]")
	public WebElement msgdeleted;
	
	//*[@id="attachmentList"]/div[2]/div/text()
	//*[@id="attachmentList"]/div[2]/div/text()
	

	public SalaryPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
