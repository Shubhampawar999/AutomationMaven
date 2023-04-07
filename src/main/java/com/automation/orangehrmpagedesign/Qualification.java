package com.automation.orangehrmpagedesign;

import org.openqa.selenium.By;

import com.autamation.utility.BaseClass;

public class Qualification extends BaseClass
{
	
	public By qualificationmod=By.xpath("//div[@class='oxd-topbar-body']/descendant::ul/li[4]");

	public By skillfet=By.xpath("//div[@class='oxd-topbar-body']/descendant::ul/li[4]//li[1]/a");
	
	public By addButton=By.xpath("//div[@class='orangehrm-header-container']/descendant::div/button");

public By nameText=By.xpath("//div[@class=\"oxd-form-row\"]/descendant::input");

public By saveButton=By.xpath("//button[@type='submit']");

public By allName=By.xpath("//div[@class='oxd-table-body']/div/div/div[2]");

public By pathsel=By.xpath("//div[text()='selenium']");
}
