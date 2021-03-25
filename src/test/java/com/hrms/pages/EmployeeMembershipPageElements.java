package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeMembershipPageElements {

	@FindBy(xpath="//*[@id=\"sidenav\"]/li[11]/a")
	public WebElement Membership;
	
	@FindBy(id="btnAddMembershipDetail")
	public WebElement AddMembership;
	
	
	@FindBy(id="membership_membership")
	public WebElement SelectMembership;
	
	@FindBy(id="membership_subscriptionPaidBy")
	public WebElement subscriptionPaidBy;
	
	@FindBy(id="membership_subscriptionAmount")
	public WebElement subscriptionAmount;
	
	@FindBy(id="membership_currency")
	public WebElement membership_currency;
	
	@FindBy(id="membership_subscriptionCommenceDate")
	public WebElement subscriptionCommenceDate;
	
	
	 @FindBy(xpath="//select[@class='ui-datepicker-month']")
		public WebElement CommenceMonth;
	    @FindBy(xpath="//select[@class='ui-datepicker-year']")
		public WebElement CommenceYear;
	    @FindBy(xpath="//table[@class='ui-datepicker-calendar']//tbody/tr/td")
	    public List<WebElement> CommenceDay;
	
	
	@FindBy(id="membership_subscriptionRenewalDate")
	public WebElement subscriptionRenewalDate;
	 @FindBy(xpath="//select[@class='ui-datepicker-month']")
		public WebElement RenewalMonth;
	    @FindBy(xpath="//select[@class='ui-datepicker-year']")
		public WebElement RenewalYear;
	    @FindBy(xpath="//table[@class='ui-datepicker-calendar']//tbody/tr/td")
	    public List<WebElement> RenewalDay;
	    
	
	@FindBy(id="btnSaveMembership")
	public WebElement btnSaveMembership;
	
	public  EmployeeMembershipPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
