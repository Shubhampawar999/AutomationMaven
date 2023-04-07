package com.automation.orangehrm.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;
import com.autamation.utility.PropertiesHandling;
import com.automation.orangehrmpagedesign.AdminModuleJobSubModule;
import com.automation.orangehrmpagedesign.AdminmodulePageDesign;
import com.automation.orangehrmpagedesign.Grade2Module;
import com.automation.orangehrmpagedesign.Loginorangehrmapplication;

public class JobSubModuleTest extends BaseClass{
	
	PropertiesHandling propertiesHandling;//Declare class level becoz access classs anyWhere
	 AdminmodulePageDesign admin;
	 AdminModuleJobSubModule job;
	  Grade2Module grade;
	
	@BeforeClass
	public void start() {
		 propertiesHandling=new PropertiesHandling();
		 launchBrowser(propertiesHandling.getProperty("browser"));
		 driver.get(propertiesHandling.getProperty("orangeHrmUrl"));
		 Loginorangehrmapplication login=new Loginorangehrmapplication();
		  admin=new AdminmodulePageDesign();

			String username = propertiesHandling.getProperty("orangeHrmUsername");
			String password = propertiesHandling.getProperty("orangeHrmPassword");
		 login.login(username, password);
		 job=new AdminModuleJobSubModule();
		 
	}
  @Test(dataProvider="prov")
  public void verifyJobModule(String name) throws InterruptedException {
	  click(admin.adminmodule);
	  click(job.jobSubModule);
	  click(job.jobSumoduleTital);
	  click(job.addButton);
	  enterText(job.jobTital,name);
	  click(job.saveButton);
	  Thread.sleep(5000);
	  
	  
	  List<WebElement> element=driver.findElements(By.xpath("//div[@class='oxd-table-card'][\"+i+\"]/descendant::div[@role='cell'][2]/div"));
	  Thread.sleep(5000);
	  for(WebElement name1:element) {
		  System.out.println(name1.getText()); 
		if(name.equals("Software enggneerin")) {
		  Assert.assertTrue(true);}
	  }
	  
	  
  }
  @DataProvider
  public Object[][] prov() {
	  Object[][] data=new Object[][] {
		  {"Software enggneerin"}
	  };
	  return data;
  
  }
  
}
