package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.ContactDetailsPageElements;
import com.hrms.pages.DashboardPageElement;
import com.hrms.pages.DependentPageElements;
import com.hrms.pages.DonaldJTrumpJobPageElements;
import com.hrms.pages.EmergencyContactsPageElements;
import com.hrms.pages.EmpQualificationPageElements;
import com.hrms.pages.EmployeeListPageElements;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.SalaryPage;
import com.hrms.pages.TaxExemptionsPageElements;
import com.hrms.pages.TrumpElementInTable;

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
	protected static ContactDetailsPageElements contactDetails;
	protected static AddEmployeePageElements addEmployee;
<<<<<<< HEAD

	
	protected static TaxExemptionsPageElements taxExemptions;

=======
>>>>>>> 906e399aa7b18c72d4cc2162cf5449b8f2c06982
	protected static void initializeAll() {
		login = new LoginPageElements();
		dash = new DashboardPageElement();
		employeeList = new EmployeeListPageElements();
		trumpElementInTable = new TrumpElementInTable();
		leave = new LeaveListPageElements();
<<<<<<< HEAD
		taxExemptions= new TaxExemptionsPageElements();
=======
>>>>>>> 906e399aa7b18c72d4cc2162cf5449b8f2c06982
		salary = new SalaryPage();
		donaldJTrumpJob = new DonaldJTrumpJobPageElements();
		empEContact = new EmergencyContactsPageElements();
		empQualification = new EmpQualificationPageElements();
		person = new PersonalDetailsPageElements();
		dependent = new DependentPageElements();
		contactDetails = new ContactDetailsPageElements();
		addEmployee = new AddEmployeePageElements();

	}
}
