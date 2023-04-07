package com.practice;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Practice extends BaseClass{
	@BeforeTest
	public void beforeTest() {
		System.out.println("INSIDE THE BEFORE TEST MOTHOD");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("INSSIDE THE BEFORE METHOD");
	}
	
  @Test
  public void verifyMethood() {
	  System.out.println("INSIDE THE TEST METHOD");
  }
  @Test
  public void verifyMoth() {
	  System.out.println("INSIDE TEST METHOD2");
	  //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  //"C:\Users\shubham\Downloads\Git-2.40.0-64-bit.exe"

@AfterTest
public void afterTest() {
	System.out.println("INSIDE THE AFTER TEST METHOD");
}
@AfterMethod
public void afterMethod() {
System.out.println("INSIDE THE AFTER METHOD");
}}