package com.icehrm.automation.login;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;
import com.autamation.utility.PropertiesHandling;
import com.autamationpagrdesign.EmployeePage;
import com.autamationpagrdesign.LoginPage;

public class EmployeeTest extends BaseClass {
	PropertiesHandling Properti;
	LoginPage loginPage;
	EmployeePage Employe;

	@BeforeClass

	public void start() {
		Properti = new PropertiesHandling();
		loginPage = new LoginPage();
		Employe = new EmployeePage();
		launchBrowser(Properti.getProperty("browser"));
		driver.get(Properti.getProperty("icehrmUrl"));
		String usernmae = Properti.getProperty("icehrmUsername");
		String password = Properti.getProperty("icehrmPassword");
		loginPage.login(usernmae, password);

	}

	@Test
	public void verifySearchEmployee() throws InterruptedException {
		click(Employe.employeemenu);
		click(Employe.empSubMenu);

		isClickable(Employe.searchButton);
		List<String> allEmployeeNames = new ArrayList<>();
		Thread.sleep(5000);

		List<WebElement> allEmplDetails = driver.findElements(Employe.allEmplInfo);

		for (WebElement element : allEmplDetails) {
			String firstName = element.getText();
			allEmployeeNames.add(firstName);
		}
		String lastEmpNmaes = allEmployeeNames.get(allEmplDetails.size() - 1);
		enterText(Employe.searchBox, lastEmpNmaes);
		click(Employe.searchButton);
		Thread.sleep(5000);
		List<WebElement> searchEmpDetailes = driver.findElements(Employe.allEmplInfo);
		for (WebElement element : searchEmpDetailes) {
			String firstName = element.getText();
			Assert.assertEquals(firstName, lastEmpNmaes);

		}

	}

	private void isClickable(By searchButton) {
		// TODO Auto-generated method stub
		
	}
}
