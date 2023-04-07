package com.automation.orangehrmpagedesign;

import org.openqa.selenium.By;

import com.autamation.utility.BaseClass;

public class Grade2Module extends BaseClass{
	
	public By payGrademodule=By.xpath("//ul[@class=\"oxd-dropdown-menu\"]/descendant::li[2]/a");
	public By addButton=By.xpath("//div[@class=\"oxd-layout-context\"]/descendant::button[1]/i");
public By payGradeNmae=By.xpath("//div[@class=\"oxd-form-row\"]/descendant::div//input");
public By saveButton=By.xpath("//div[@class=\"oxd-form-actions\"]/button[2]");
}
