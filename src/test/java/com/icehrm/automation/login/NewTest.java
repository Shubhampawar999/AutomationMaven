package com.icehrm.automation.login;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class NewTest implements ITestListener{
	public String reportPath1;
	@BeforeMethod
	public void afterTest() {
		System.out.println("Inside the BeforeTest Annotation");
	}
	@AfterMethod
	public void beforeMethod() {
		
		System.out.println("Inside the AfterTest Annotation");
	}
  @Test
  public void  onStertSuiteLevel() {
	  LocalDateTime todayDate=LocalDateTime.now();
	  System.out.println(todayDate);
	  String currDateTime=todayDate.format(DateTimeFormatter.ofPattern("dd_MM_yyyy_hh_mm"));
	  System.out.println(currDateTime);
	  String reportPath=System.getProperty("user.dir");//path of project maven
	   reportPath1=System.getProperty("user.dir")+"\\reports";
	  System.out.println(reportPath1);
	  File file=new File(reportPath1);
	  if(!file.exists()) {
		  file.mkdir();
	  }
	  String htmlReport=reportPath1+"\\AutomationReport.html";
	  System.out.println(htmlReport);
	  ExtentSparkReporter sparkReport=new ExtentSparkReporter(htmlReport);
	  System.out.println(sparkReport);
	  ExtentReports extentreport=new ExtentReports();
	  extentreport.attachReporter(sparkReport);	
	 
  }
  @Test
  public void onstartTestResultLevel(ITestResult result) {
	  String screenscrPath=reportPath1+"/"+result.getMethod().getMethodName()+".jpg";
	  System.out.println(screenscrPath);
	  
  }
}
