package com.automation.orangehrm.login;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;
import com.automation.orangehrmpagedesign.AdminmodulePageDesign;
import com.automation.orangehrmpagedesign.OrganisationSubmodule;

public class NewLogin extends BaseClass {
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
  @Test
  public void verify() {
	  click(design.myInfo);
	  click(design.img);
	  click(design.addPicButton);
	  
  }
}
