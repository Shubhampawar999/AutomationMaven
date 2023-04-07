package com.automation.orangehrmpagedesign;

import org.openqa.selenium.By;

import com.autamation.utility.BaseClass;

public class Licenses extends BaseClass
{

	
	public By licenses=By.xpath("//a[text()='Licenses']");
	
	public By addButton=By.xpath("//div[@class='orangehrm-header-container']/descendant::button");

public By NameText=By.xpath("//div[@class='oxd-form-row']/descendant::input");

public By saveButton=By.xpath("//button[@type='submit']");

public By allEmpl=By.xpath("//div[@class='oxd-table-body']/descendant::div/div/div[2]");

public By nameOfLicense=By.xpath("//div[contains(text(),'CMI Agile Certified Practitioner (PMI-ACP)')]");

}
