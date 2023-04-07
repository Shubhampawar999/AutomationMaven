package com.automation.orangehrmpagedesign;

import org.openqa.selenium.By;

import com.autamation.utility.BaseClass;

public class Education extends BaseClass{
	
	public By educationFun=By.xpath("//a[text()='Education']");
	
	public By addButton=By.xpath("//div[@class='orangehrm-header-container']/descendant::button");

	public By level=By.xpath("//div[@class='oxd-form-row']/descendant::input");

	public By save=By.xpath("//button[@type='submit']");
	
	public By alllevelName=By.xpath("//div[@class='oxd-table-body']/div/div/div[2]");

	public By getTxt=By.xpath("//div[text()='ME']");
}
