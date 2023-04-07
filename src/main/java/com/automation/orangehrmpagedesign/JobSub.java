package com.automation.orangehrmpagedesign;

import org.openqa.selenium.By;

public class JobSub {
public By payGrade=By.xpath("//a[contains(text(),'Pay Grades')]");
public By nameG=By.xpath("//label[text()='Name']/following::div[1]/input");
public By saveButton=By.xpath("//div[@class=\"oxd-form-actions\"]/descendant::button[2]");
public By addButton=By.xpath("//div[@class='orangehrm-header-container']//button");
public By allName=By.xpath("//div[@class='oxd-table-body']/descendant::div[@role='row']/div[2]");


}
