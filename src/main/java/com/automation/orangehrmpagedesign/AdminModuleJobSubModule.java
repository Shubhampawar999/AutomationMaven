package com.automation.orangehrmpagedesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.autamation.utility.BaseClass;

public class AdminModuleJobSubModule extends BaseClass{
public By jobSubModule=By.xpath("//div[@class='oxd-topbar-body']/descendant::li[2]/span");
public By jobSumoduleTital=By.xpath("//div[@class=\"oxd-topbar-body\"]/descendant::li[2]//li[1]/a");
	public By addButton=By.xpath("//div[@class=\"orangehrm-paper-container\"]/descendant::button[1]");
	public By jobTital=By.xpath("//div[@class='oxd-form-row'][1]/descendant::div[1]/div[2]/input");
public By saveButton=By.xpath("//button[@type='submit']");
public By allName=By.xpath("//div[@class='oxd-table-card'][\\\"+i+\\\"]/descendant::div[@role=\\\"cell\\\"][2]/div");

}

