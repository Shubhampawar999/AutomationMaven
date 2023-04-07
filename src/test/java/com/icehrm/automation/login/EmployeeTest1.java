package com.icehrm.automation.login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;
import com.autamation.utility.PropertiesHandling;
import com.autamationpagrdesign.EmployeePage;
import com.autamationpagrdesign.LoginPage;

public class EmployeeTest1 extends BaseClass {
	PropertiesHandling Properti;
	LoginPage loginPage;
	EmployeePage Employe;

	@BeforeClass
	public void start() {
		Properti 	= new PropertiesHandling();
		loginPage 	= new LoginPage();
		Employe 	= new EmployeePage();
		
		launchBrowser(Properti.getProperty("browser"));
		driver.get(Properti.getProperty("icehrmUrl"));
		
		String usernmae = Properti.getProperty("icehrmUsername");
		String password = Properti.getProperty("icehrmPassword");
		
		loginPage.login(usernmae, password);

	}

	@Test
	public void verifyEmpl() throws InterruptedException {
		click(Employe.employeemenu);
		click(Employe.empSubMenu);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000l);
		List<WebElement> allEmployeElement = driver.findElements(Employe.allEmplInfo);
		for (WebElement element : allEmployeElement) {
			int index = 1;
			if (index <= 2 && index >= 6) {
				String empInfo = element.getText();
				System.out.println(empInfo);
				Thread.sleep(5000);
			}
			if (index == 7) {
				index = 0;
			}
			index++;
		}
	}
}
