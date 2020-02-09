package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElement;
import com.hrms.pages.EmployeeListPageElements;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonaDetailsPageElements;
import com.hrms.pages.ReportsPageElements;
import com.hrms.pages.SalaryPage;

public class PageInitializeAll extends BaseClass {
	protected static DashboardPageElement dash;
	protected static LoginPageElements login;
	protected static EmployeeListPageElements employeeList;


	protected static AddEmployeePageElements add;
	protected static LeaveListPageElements leave;
	protected static PersonaDetailsPageElements person;
	protected static ReportsPageElements report;
	
	protected static SalaryPage salary;


	public static void initializeAll() {
		login = new LoginPageElements();
		dash = new DashboardPageElement();
		employeeList = new EmployeeListPageElements();
		
		
		add = new AddEmployeePageElements();
		leave = new LeaveListPageElements();
		person = new PersonaDetailsPageElements();
		report=new ReportsPageElements();
		salary = new SalaryPage();

	}
}
