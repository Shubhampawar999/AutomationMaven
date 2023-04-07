package com.automation.orangehrm.login;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;
import com.automation.orangehrmpagedesign.AdminmodulePageDesign;
import com.automation.orangehrmpagedesign.OrganisationSubmodule;

public class Location extends BaseClass{
	OrganisationSubmodule organisationSubmodule;
	JobSubModuleTest test;
	AdminmodulePageDesign design;
	@BeforeClass
	public void start() {
		organisationSubmodule=new OrganisationSubmodule();
		 design=new AdminmodulePageDesign();
		 test=new JobSubModuleTest();
		 test.start();
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Start the test Execution");
	}
  @Test
  public void verifyLocatioon() throws InterruptedException {
	  
	  click(design.adminmodule);
	  click(organisationSubmodule.organisation);
	  click(organisationSubmodule.location);
	//  buttonIsVis(organisationSubmodule.search);
	  Thread.sleep(5000);
	  addButt(organisationSubmodule.addButton);
	  List<WebElement> element=driver.findElements(organisationSubmodule.listEmplName);
	  allElement(organisationSubmodule.listEmplName);
	  for(int i=0;i<element.size();i++) {
		 WebElement elen= element.get(i);
		String name1=elen.getText();
		System.out.println(name1);
	  }
	  
  }
}
