package com.automation.orangehrmpagedesign;

import org.openqa.selenium.By;

import com.autamation.utility.BaseClass;

public class Nationalities extends BaseClass {
	public By nationalitySubModule=By.xpath("//a[text()='Nationalities']");
	
	public By allEmpl=By.xpath("//div[@class='oxd-table-body']/div/div/div[2]/div");
	
	public By click=By.xpath("//ul[@class='oxd-pagination__ul']/li[2]");


	public   By clic=By.xpath("//ul[@class='oxd-pagination__ul']/li");
	 public  By clic1=By.xpath("//ul[@class='oxd-pagination__ul']/li[5]");
}
