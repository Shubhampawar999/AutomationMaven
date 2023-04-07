package com.automation.orangehrmpagedesign;

import org.openqa.selenium.By;

import com.autamation.utility.BaseClass;

public class Structure extends BaseClass{
	public By structure=By.xpath("//a[text()='Structure']");
	
	public By addButton=By.xpath("//div[@class='org-root-container']/descendant::button");
	
	public By clickEditButton=By.xpath("//div[@class='oxd-switch-wrapper']/descendant::span");
	
	public By name=By.xpath("//label[text()='Name']/following::div[1]/input");
	
	public By saveButton=By.xpath("//div[@class='oxd-form-actions']/descendant::button[2]");

}
