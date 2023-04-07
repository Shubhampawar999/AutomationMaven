package com.automation.orangehrm.login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.autamation.utility.BaseClass;
import com.autamation.utility.PropertiesHandling;
import com.automation.orangehrmpagedesign.AdminmodulePageDesign;
import com.automation.orangehrmpagedesign.Loginorangehrmapplication;

public class AdminModuleTest extends BaseClass {
	PropertiesHandling properties;
	Loginorangehrmapplication log;
	AdminmodulePageDesign design;

	@BeforeClass
	public void start() {
		properties = new PropertiesHandling();
		launchBrowser(properties.getProperty("browser"));
		driver.get(properties.getProperty("orangeHrmUrl"));
		log = new Loginorangehrmapplication();
		String username = properties.getProperty("orangeHrmUsername");
		String password = properties.getProperty("orangeHrmPassword");
		log.login(username, password);
		design = new AdminmodulePageDesign();

	}

	@Test
	public void verifyModule() throws InterruptedException {
		click(design.adminmodule);
		click(design.systemUsers);
		//Element(design.addButton);
		Thread.sleep(5000);
		List<Map<String, String>> allEmpInfo = new ArrayList<>();

		/*
		 * [
		 * 
		 * { "username":"Admin", "role":"Admin", "eName":"PC", "status":"enable" }, {
		 * "username":"Admin", "role":"Admin", "eName":"PC", "status":"enable" }, {
		 * "username":"Admin", "role":"Admin", "eName":"PC", "status":"enable" }
		 * 
		 * ]
		 */
			Thread.sleep(5000);
		List<WebElement> element = driver.findElements(design.allEmpInfo);
		int totalRows = element.size();
		for (int i = 1; i <= totalRows; i++) {
			Map<String, String> empInfo = new HashMap<>();
			for (int j = 2; j <= 5; j++) {
				
				WebElement userNameElement = driver.findElement(

						By.xpath("//div[@class='oxd-table-card'][" + i + "]/descendant::div[@role='cell'][" + j + "]"));
				String empDetails = userNameElement.getText();
				if (j == 2) {
				

					empInfo.put("empUserName", empDetails);
				} else if (j == 3) {
				

					empInfo.put("userRole", empDetails);

				} else if (j == 4) {
				

					empInfo.put("empName", empDetails);
				} else if (j == 5) {
			

					empInfo.put("status", empDetails);
				}
			}
			Thread.sleep(2000);

			allEmpInfo.add(empInfo);
		}
		Thread.sleep(2000);

		String firstEmpName = allEmpInfo.get(0).get("empName");
		//String userRoll=allEmpInfo.get(0).get("userRole");
		//String empName=allEmpInfo.get(0).get("empName");
		
		System.out.println(firstEmpName);
		
		click(design.clickbutt);
		enterText(design.userName,firstEmpName);
		click(design.searchButt);


		}
	}
