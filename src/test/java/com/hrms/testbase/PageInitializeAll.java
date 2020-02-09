package com.hrms.testbase;

import com.hrms.pages.DashboardPageElement;
import com.hrms.pages.DonaldJTrumpJobPageElements;
import com.hrms.pages.EmployeeListPageElements;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.TrumpElementInTable;
///import com.hrms.pages.ReportsPageElements;
///import com.hrms.pages.AddEmployeePageElements;

public class PageInitializeAll extends BaseClass {
	protected static DashboardPageElement dash;
	protected static LoginPageElements login;
	protected static EmployeeListPageElements employeeList;
	protected static TrumpElementInTable trumpElementInTable;
	protected static LeaveListPageElements leave;
	protected static PersonalDetailsPageElements person;
	protected static DonaldJTrumpJobPageElements donaldJTrumpJob;
	/// protected static AddEmployeePageElements add;

	protected static void initializeAll() {
		login = new LoginPageElements();
		dash = new DashboardPageElement();
		employeeList = new EmployeeListPageElements();
		trumpElementInTable = new TrumpElementInTable();
		leave = new LeaveListPageElements();
		person = new PersonalDetailsPageElements();
		donaldJTrumpJob = new DonaldJTrumpJobPageElements();

		/// add = new AddEmployeePageElements();

	}
}
