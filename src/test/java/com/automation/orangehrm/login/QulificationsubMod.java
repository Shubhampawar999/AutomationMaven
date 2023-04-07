package com.automation.orangehrm.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;
import com.automation.orangehrmpagedesign.AdminmodulePageDesign;
import com.automation.orangehrmpagedesign.Education;
import com.automation.orangehrmpagedesign.Licenses;
import com.automation.orangehrmpagedesign.MemberShip;
import com.automation.orangehrmpagedesign.OrganisationSubmodule;
import com.automation.orangehrmpagedesign.Qualification;

public class QulificationsubMod extends BaseClass {
	OrganisationSubmodule organisationSubmodule;
	JobSubModuleTest test;
	AdminmodulePageDesign design;
	 Qualification qualification;
	
	 
	@BeforeClass
	public void start() {
		organisationSubmodule=new OrganisationSubmodule();
		 design=new AdminmodulePageDesign();
		 test=new JobSubModuleTest();
		 test.start();
		  click(design.adminmodule);
		   qualification=new Qualification();

		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Start The Test Exicution");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("End The Test Exicution");
	}

  @Test(priority=1,dataProvider="getData")
  public void verifyTheSkill(String data) {
	  click(qualification.qualificationmod);
	  click(qualification.skillfet);
	  click(qualification.addButton);
	  enterText(qualification.nameText,data);
	  click(qualification.saveButton);
	  
	  allElement(qualification.allName);
	  List<WebElement> element=driver.findElements(qualification.allName);
	  allElement(qualification.allName);
	  for(WebElement name:element) {
		  System.out.println(name.getText());
	  }
	  
	  String name1=driver.findElement(qualification.pathsel).getText();
	  System.out.println(name1);
	  Assert.assertEquals(data, name1);
	  
  }
 @DataProvider
 public Object[][] getData() {
	 Object[][] obj=new Object[][] {
		 {"selenium"}
	 };
	 return obj;
 }
  
 
 @Test(priority=2,dataProvider="passlevel")
 
 public void verifyeducation(String level) {
	Education edu=new Education();
	click(qualification.qualificationmod);
	click(edu.educationFun);
	click(edu.addButton);
	enterText(edu.level,level);
	click(edu.save);
	
	allElement(edu.alllevelName);
	List<WebElement> element=driver.findElements(edu.alllevelName);
	for(WebElement ele:element) {
		System.out.println(ele.getText());
	}
	String tName=driver.findElement(edu.getTxt).getText();
	System.out.println(tName);
	Assert.assertEquals(level, tName);
 }
 @DataProvider
 public Object[][] passlevel(){
	 Object[][] level=new Object[][] {
		 {"ME"}
	 };
	 return level;
 }
 
 @Test(priority=3,dataProvider="getData1")
 public void verifyLisc(String data1) {
	 Licenses licenses=new Licenses();
	 click(qualification.qualificationmod);
	 click(licenses.licenses);
	 click(licenses.addButton);
	 enterText(licenses.NameText,data1);
	 click(licenses.saveButton);
	 
	 //extract the data from application to consol and verify Those data
	 
	 
	 allElement(licenses.allEmpl);
	 List<WebElement> element=driver.findElements(licenses.allEmpl);
	 for(WebElement name:element) {
		 System.out.println(name.getText());

	 }
	 String verName=driver.findElement(licenses.nameOfLicense).getText();
	 System.out.println(verName);
	 Assert.assertEquals(data1, verName);
 }
 
 
 @DataProvider
 
 public Object[][] getData1(){
	 Object[][] data=new Object[][] {
		 {"CMI Agile Certified Practitioner (PMI-ACP)\n"
		 	}
	 };
	 return data;
	 
 }
 @Test(priority=4,dataProvider="gtData")

 public void verifyMemberShip(String passData) {
	 MemberShip memberShip=new MemberShip(); 
click(qualification.qualificationmod);
click(memberShip.membership);
click(memberShip.addButton);
enterText(memberShip.name,passData);
click(memberShip.saveButton);

allElement(memberShip.allEmpl);
List<WebElement> element=driver.findElements(memberShip.allEmpl);
for(WebElement name:element) {
	System.out.println(name.getText());

}
String japName=driver.findElement(memberShip.nameRes).getText();
System.out.println(japName);

Assert.assertEquals(passData, japName);

 }
 
 @DataProvider
 
 public Object[][] gtData(){
	 Object[][]ob=new Object[][] {
		 {"Japan Computer Society (JCS)"
		 		}
		 
	 };
	 return ob;
 }
 
 
 
}
