package com.automation.orangehrmpagedesign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.autamation.utility.BaseClass;

public class AdminmodulePageDesign extends BaseClass {
	public By adminmodule=By.xpath("//span[text()='Admin']");
	
	public By systemUsers=By.xpath("//button[@class=\"oxd-icon-button\"]/i");
	
	public By addButton=By.xpath("//div[@class=\"orangehrm-paper-container\"]/descendant::button[1]");
	public By allEmpInfo=By.xpath("//div[@class=\"oxd-table-body\"]/div/div");
public By searchBox=By.xpath("//input[@placeholder='Type for hints...']");
	public By Elements=By.xpath("//div[@class='oxd-table-card']/div/div");
	
	public By userName=By.xpath("//div[@class='oxd-form-row']/descendant::div[3]/div[2]/input");
	public  By clickbutt=By.xpath("//button[@class='oxd-icon-button']/i");
	
	public By searchButt=By.xpath("//button[@type='submit']");
	
	public By myInfo=By.xpath("//div[@class='oxd-sidepanel-body']/descendant::li[6]");
	
	public By img=By.xpath("//div[@class='orangehrm-edit-employee-image']/img");
	
	public By addPicButton=By.xpath("//div[@class='employee-image-wrapper']/following-sibling::button");}