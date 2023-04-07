package com.automation.orangehrm.login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;
import com.automation.orangehrmpagedesign.AdminmodulePageDesign;
import com.automation.orangehrmpagedesign.OrganisationSubmodule;

public class WorkShit extends BaseClass{
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
  public void f() throws InterruptedException {
	  click(design.adminmodule);
	  click(organisationSubmodule.organisation);
	  click(organisationSubmodule.location);
	  
	  Thread.sleep(5000);
	  List<Map <String,String>> allEmp=new ArrayList<>();
	  List<WebElement> element=driver.findElements(organisationSubmodule.allEml);
	  Thread.sleep(5000);
	  Map<String,String> str=new HashMap<>();
  int totalRow=element.size();
  for(int i=1;i<totalRow;i++) {
	  for(int j=2;j<=4;j++) {
			 WebElement element1=element.get(j);
			  String name=element1.getText();
		  if(j==2) {
			  str.put("name",name);
		  }else if(j==3) {
			  str.put("city", name);
		  }else if(j==4) {
			  str.put("country", name);
		  }else if(j==5) {
			  str.put("phonr", name);
		  }else if(j==6) {
			  str.put("NumberOfEmpl", name);
		  }
			 
		  	System.out.println(name);
	  }
  }
  }
}
