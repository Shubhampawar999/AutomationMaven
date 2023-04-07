package com.automation.orangehrmpagedesign;

import org.openqa.selenium.By;

import com.autamation.utility.BaseClass;

public class JobCategaries extends BaseClass{
	
	public By jobCatg=By.xpath("//a[contains(text(),'Job Categories')]");
	
	public By addButton=By.xpath("//div[@class=\"orangehrm-header-container\"]/descendant::div[1]//button");

	public By emplName=By.xpath("//div[@class='oxd-form-row']/div[1]//input");
	
	public By addButtonEmpl=By.xpath("//button[@type='submit']");
	
	public By allEmplJobCatg=By.xpath("//div[@class='oxd-table-body']/div/div/div[2]");
}
