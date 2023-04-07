package com.automation.orangehrmpagedesign;

import org.openqa.selenium.By;

import com.autamation.utility.BaseClass;

public class MemberShip extends BaseClass
{

	public By membership=By.xpath("//a[text()='Memberships']");
	
	public By addButton=By.xpath("//div[@class='orangehrm-header-container']/descendant::button");
	
	public By name=	By.xpath("//div[@class='oxd-form-row']/descendant::input");
	
	public By saveButton=By.xpath("//button[@type='submit']");
	
	public By allEmpl=By.xpath("//div[@class='oxd-table-body']/div/div/div[2]");
	
	public By nameRes=By.xpath("//div[contains(text(),'Japan Computer Society (JCS)')]");
	
}
