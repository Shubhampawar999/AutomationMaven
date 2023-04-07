package com.icehrm.automation.login;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;
import com.autamation.utility.PropertiesHandling;
import com.autamationpagrdesign.LoginPage;

public class LoginTest extends BaseClass{

	PropertiesHandling propertiesHandling;
	LoginPage loginPage;
	@BeforeClass
	public void start() {
		 propertiesHandling=new PropertiesHandling();
		 launchBrowser(propertiesHandling.getProperty("browser"));
		 driver.get(propertiesHandling.getProperty("icehrmUrl"));
		 loginPage=new LoginPage();
	}
  @Test(dataProvider="getLoginData")
  public void verifyLogin(String username,String password,String errorMsg) {
	  
	  loginPage.login(username, password);
	  if(!username.isEmpty()&&!password.isEmpty()) {
		  String errorMessage=driver.findElement(loginPage.errorMsg).getText();
		  Assert.assertEquals(errorMessage, errorMsg);
	  }
	  
  }
  
  
  
  
  @DataProvider
  public Object[][] getLoginData(){
	  Object[][] data=new Object[][]{
		  {"admin123","admin"," Login failed"},
		  {"admin","admin124"," Login failed"},
		  {"admin111","2zuzufakn"," Login failed"},
		  {"","",""},
		  {"","2zuzfakn",""},
		  {"admin","",""},
		  {"admin","2zuzfakn","Login failed"}
	  };
		 return data; 
		  
	  }
	  
	  
  }

