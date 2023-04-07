package com.automation.emptest;

import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;
import com.autamation.utility.PropertiesHandling;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;

public class EmpTest extends BaseClass{
	 PropertiesHandling propertiesHandling;
  @BeforeClass
  public void beforeClass() {
	  propertiesHandling=new PropertiesHandling();
	  
  }
  @Test
  public void login() {
	  String url=propertiesHandling.getProperty("icehrmUrl");
	  launchBrowser("chrome");
	  driver.navigate().to(url);
	String usernam =propertiesHandling.getProperty("icehrmUsername");
	enterText(By.xpath("//input[@id='username']"),usernam);
	String passwor=propertiesHandling.getProperty("icehrmPassword");
	enterText(By.id("password"),passwor);
	click(By.xpath("//button[contains(text(),'Log in ')]"));
	click(By.xpath("i.caret"));
	click(By.xpath("//a[contains(text(),'Sign out')]"));
	  
  }
  @Test
  public void login1() {
	  String url=propertiesHandling.getProperty("orangeHrmUrl");
	  launchBrowser("chrome");
	  driver.navigate().to(url);
		String usernam =propertiesHandling.getProperty("orangeHrmUsername");
		enterText(By.name("username"),usernam);
		String passwor=propertiesHandling.getProperty("orangeHrmPassword");
		enterText(By.name("password"),passwor);
		click(By.xpath("//button[@type='submit']"));
		click(By.xpath("//i[contains(@class,'bi-caret-down-fill')]"));
		click(By.xpath("//a[text()='Logout']"));
	  
  }

}
