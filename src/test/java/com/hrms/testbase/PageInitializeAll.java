package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElement;

import com.hrms.pages.EmergencyContactsPageElements;

import com.hrms.pages.EmpQualificationPageElements;
import com.hrms.pages.DependentPageElements;

import com.hrms.pages.EmployeeListPageElements;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.ReportsPageElements;

public class PageInitializeAll extends BaseClass {
	protected static DashboardPageElement dash;
	protected static LoginPageElements login;
	protected static EmployeeListPageElements employeeList;
	protected static EmergencyContactsPageElements empEContact;
	protected static AddEmployeePageElements add;
	protected static LeaveListPageElements leave;
	protected static EmpQualificationPageElements person;
	protected static ReportsPageElements report;

	protected static DependentPageElements dependent;

	public static void initializeAll() {
		login = new LoginPageElements();
		dash = new DashboardPageElement();
		employeeList = new EmployeeListPageElements();
		empEContact = new  EmergencyContactsPageElements();
		add = new AddEmployeePageElements();
		leave = new LeaveListPageElements();

		person = new EmpQualificationPageElements();
		report = new ReportsPageElements();
		dependent = new DependentPageElements();

	}
}
