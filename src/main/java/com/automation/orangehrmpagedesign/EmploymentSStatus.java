package com.automation.orangehrmpagedesign;

import java.time.Duration;

import org.openqa.selenium.By;


import com.autamation.utility.BaseClass;

public class EmploymentSStatus extends BaseClass{
	public By employmentStatus=By.xpath("//nav[@aria-label='Topbar Menu']/descendant::li[2]//li[3]");
	
public By addButton=By.xpath("//div[@class='orangehrm-paper-container']/descendant::div[1]//button");

public By nameText=By.xpath("//div[@class='oxd-form-row']/descendant::div[1]//input");

public By saveButton=By.xpath("//button[@type='submit']");

public By allEmplDetails=By.xpath("//div[@class='oxd-table-body']/div/div/div[2]");


}
