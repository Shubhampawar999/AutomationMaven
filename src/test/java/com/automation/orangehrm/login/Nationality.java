package com.automation.orangehrm.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;
import com.automation.orangehrmpagedesign.AdminmodulePageDesign;
import com.automation.orangehrmpagedesign.Nationalities;
import com.automation.orangehrmpagedesign.OrganisationSubmodule;



public class Nationality extends BaseClass{
	OrganisationSubmodule organisationSubmodule;
	JobSubModuleTest test;
	AdminmodulePageDesign design;
	
	@BeforeClass
	public void startBrowser(){
		organisationSubmodule=new OrganisationSubmodule();
		 design=new AdminmodulePageDesign();
		 test=new JobSubModuleTest();
		 test.start();
		 click(design.adminmodule);
		 		
		}
  @Test
  public void verifyNationality() {
	  Nationalities nationality=new Nationalities();
	  click(nationality.nationalitySubModule);
	  click(nationality.allEmpl);	  
	  allElement(nationality.allEmpl);
	 
	  
		  List<WebElement> element=driver.findElements(nationality.allEmpl);
		  for(WebElement element1:element)
	  System.out.println(element1.getText()	);  
  
  }	 	  

  
}
