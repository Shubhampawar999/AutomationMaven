package com.automation.orangehrmpagedesign;

import org.openqa.selenium.By;

import com.autamation.utility.BaseClass;

public class WorkShift extends BaseClass{
	
	public By workShift=By.xpath("//a[contains(text(),'Work Shifts')]");
	
	public By addButton=By.xpath("//div[@class='orangehrm-header-container']/descendant::div[1]/button");

}
