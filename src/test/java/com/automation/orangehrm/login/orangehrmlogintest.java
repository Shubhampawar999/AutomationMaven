package com.automation.orangehrm.login;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;
import com.autamation.utility.PropertiesHandling;
import com.automation.orangehrmpagedesign.Loginorangehrmapplication;

public class orangehrmlogintest extends BaseClass {
	PropertiesHandling propertiesHandling;
	Loginorangehrmapplication logi;
	
	@BeforeClass
	public void start() {
		 propertiesHandling=new PropertiesHandling();
		 launchBrowser(propertiesHandling.getProperty("browser"));
		driver.get(propertiesHandling.getProperty("orangeHrmUrl"));
		 logi=new Loginorangehrmapplication();
	}
  @Test(dataProvider="getObjectData")
  public void verifyingLogin(String username,String password,String invalidMsg) throws InterruptedException {
	  if(!username.isEmpty()&& !password.isEmpty()) {
		 Thread.sleep(5000);
		  String InvalidCredential=driver.findElement(logi.InvalidCredentials).getText();
		  Assert.assertEquals(InvalidCredential, invalidMsg);
	  }
	  
  }
  
  @DataProvider
  public Object[][] getObjectData() {
	  Object[][] data=new Object[][] {
		  {"admin123","admin","Invalid credentials"},
		  {"admin","admin124","Invalid credentials"},
		  {"admin111","2zuzufakn","Invalid credentials"},
		  {"","",""},
		  {"","2zuzfakn",""},
		  {"admin","",""},
		  {"admin","2zuzfakn","Invalid credentials"}
	  };
	  return data;
  }
}
