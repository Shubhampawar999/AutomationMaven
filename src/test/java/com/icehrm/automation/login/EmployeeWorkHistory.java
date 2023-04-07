package com.icehrm.automation.login;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;
import com.autamation.utility.PropertiesHandling;
import com.autamationpagrdesign.EmployeePage;
import com.autamationpagrdesign.LoginPage;
import com.autamationpagrdesign.WorkHistory;

public class EmployeeWorkHistory extends BaseClass{
	PropertiesHandling Properti;
	LoginPage loginPage;
	EmployeePage Employe;
	WorkHistory workHistory;

	
	@BeforeClass
	public void start() {
		Properti = new PropertiesHandling();
		loginPage = new LoginPage();
		Employe = new EmployeePage();
		workHistory=new WorkHistory();
		launchBrowser(Properti.getProperty("browser"));
		driver.get(Properti.getProperty("icehrmUrl"));
		String usernmae = Properti.getProperty("icehrmUsername");
		String password = Properti.getProperty("icehrmPassword");
		loginPage.login(usernmae, password);
	}
  @Test
  public void addEmplDetails() {
		click(Employe.employeemenu);
		click(Employe.empSubMenu);
		click(workHistory.workHist);
		click(workHistory.addNewButton);
		click(workHistory.emplpoyeeSearchBox);
		enterText(workHistory.emplpoyeeSearchBox,"Abc");
		enterText(workHistory.jobTilatlSearchBox,"QA Engg");
		click(workHistory.dateStart);
		click(workHistory.date);



		
		
  }
}
