package com.automation.orangehrmpagedesign;

import org.openqa.selenium.By;

import com.autamation.utility.BaseClass;

public class OrganisationSubmodule extends BaseClass {
	public By organisation=By.xpath("//div[@class='oxd-topbar-body']/descendant::ul/li[3]");
	
public By location=By.xpath("//ul[@class='oxd-dropdown-menu']/descendant::li[2]/a");

public By allEml=By.xpath("//div[@class='oxd-table-card'][\"+i+\"]/descendant::div[@role=\"row\"][\"+j+\"]");

public By listEmplName=By.xpath("//div[@class='oxd-table-card']/div/div[2]");

public By addButton=By.xpath("//div[@class='orangehrm-header-container']/descendant::button");

public By search=By.xpath("//button[@type='submit']");
}
