package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElement;
import com.hrms.pages.DonaldJTrumpJobPageElements;
import com.hrms.pages.EmployeeListPageElements;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.SalaryPage;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.TrumpElementInTable;
///import com.hrms.pages.ReportsPageElements;
///import com.hrms.pages.AddEmployeePageElements;

import com.hrms.pages.EmergencyContactsPageElements;

import com.hrms.pages.EmpQualificationPageElements;
import com.hrms.pages.DependentPageElements;

public class PageInitializeAll extends BaseClass {
	protected static DashboardPageElement dash;
	protected static LoginPageElements login;
	protected static EmployeeListPageElements employeeList;

	protected static EmergencyContactsPageElements empEContact;
	protected static EmpQualificationPageElements empQualification;
	protected static PersonalDetailsPageElements person;

	protected static DependentPageElements dependent;
	protected static TrumpElementInTable trumpElementInTable;
	protected static LeaveListPageElements leave;
	
	protected static SalaryPage salary;

	protected static DonaldJTrumpJobPageElements donaldJTrumpJob;
	protected static AddEmployeePageElements addEmployee;

	protected static void initializeAll() {
		login = new LoginPageElements();
		dash = new DashboardPageElement();
		employeeList = new EmployeeListPageElements();
		trumpElementInTable = new TrumpElementInTable();
		leave = new LeaveListPageElements();

		salary = new SalaryPage();

		donaldJTrumpJob = new DonaldJTrumpJobPageElements();

		empEContact = new EmergencyContactsPageElements();

		empQualification = new EmpQualificationPageElements();
		person = new PersonalDetailsPageElements();
		dependent = new DependentPageElements();
		addEmployee = new AddEmployeePageElements();

	}
}
