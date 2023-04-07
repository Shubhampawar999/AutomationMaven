package com.automation.orangehrm.login;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;
import com.autamation.utility.PropertiesHandling;
import com.automation.orangehrmpagedesign.AdminModuleJobSubModule;
import com.automation.orangehrmpagedesign.AdminmodulePageDesign;
import com.automation.orangehrmpagedesign.EmploymentSStatus;
import com.automation.orangehrmpagedesign.JobCategaries;
import com.automation.orangehrmpagedesign.JobSub;
import com.automation.orangehrmpagedesign.Loginorangehrmapplication;

public class JobSubModule2 extends BaseClass{
	JobSubModuleTest test;
	AdminModuleJobSubModule job;
	AdminmodulePageDesign admin;
	JobSub s;
	
	@BeforeTest
	public void start() {
	 test=new JobSubModuleTest();
		test.start();
		 job=new AdminModuleJobSubModule();
		  admin=new AdminmodulePageDesign();
		   s=new JobSub();


	}
	@BeforeMethod
	public void beforeTest() {
		System.out.println("Start the Test Exicutions");
	}
	@AfterMethod
	public void afetrMethod() {
		System.out.println("Test pass successfully");
	}
  @Test(priority=1,dataProvider="passData")
  public void verifyGrade(String namee) throws InterruptedException {
	  click(admin.adminmodule);
	  click(job.jobSubModule);
	  	  click(s.payGrade);
	  	  click(s.addButton);
	  	  enterText(s.nameG,namee);
	  	  click(s.saveButton);
	  	  driver.navigate().back();
	  	  
	  	  //Thread.sleep(5000);
	  	  
	  	  List<WebElement> element=driver.findElements(s.allName);
	  	allElement(s.allName);
	  	  for(WebElement sname:element) {
	  		  String emplName=sname.getText();
	  		  System.out.println(emplName);
	  		  if(emplName.equals("Grade1")) {
	  			  Assert.assertTrue(true);

	  		  }
	  		 
	  	  }
	  	  
	  	  
	  
  }
  @DataProvider
  public  Object[][] passData() {
	  Object[][] data=new Object[][]{
		  {"Grade1"}
		  };
	  return data;}
  @Test(priority=2,dataProvider="passData")
  public void employeeStatus(String data) throws InterruptedException {
	  EmploymentSStatus employmentSStatus=new EmploymentSStatus();
	  click(job.jobSubModule);
click(employmentSStatus.employmentStatus);
click(employmentSStatus.addButton);
enterText(employmentSStatus.nameText,data);
click(employmentSStatus.saveButton);
driver.navigate().back();


//Thread.sleep(5000);
List<WebElement> allEmp=driver.findElements(employmentSStatus.allEmplDetails);
allElement(employmentSStatus.allEmplDetails);
for(WebElement element:allEmp) {
	String name=element.getText();
	System.out.println(name);
}
if(data.equals("Grade1")) {
	Assert.assertTrue(true);
}
	  
  }
  @Test(priority=3,dataProvider="data")
  public void jobCat(String deptName) {
	  JobCategaries jobCategaries=new JobCategaries();
	  click(job.jobSubModule);
	  click(jobCategaries.jobCatg);
	  click(jobCategaries.addButton);
	  enterText(jobCategaries.emplName,deptName);
	  click(jobCategaries.addButtonEmpl);
	  driver.navigate().back();
	  
	  List<WebElement> element=driver.findElements(jobCategaries.allEmplJobCatg);
	  allElement(jobCategaries.allEmplJobCatg);
	  for(WebElement nameDe: element) {
		  String str=nameDe.getText();
		  System.out.println(str);
	  }
	  if(deptName.equals("Technical")) {
		  Assert.assertTrue(true);
	  }

	  
  }
  @DataProvider
  public Object[][] data() {
	  Object[][] jobCatName=new Object[][] {
		  {"Technical"}
	  };
	  return jobCatName;
  }
  
  
  
}
