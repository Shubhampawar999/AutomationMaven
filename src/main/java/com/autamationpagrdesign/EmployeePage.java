package com.autamationpagrdesign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.autamation.utility.BaseClass;

public class EmployeePage extends BaseClass {
	
	public By employeemenu=By.xpath("//li[@ref='admin_Employees']//span");
	public By empSubMenu=By.xpath("//ul[@id=\"admin_Employees\"]/li[1]/a");
	public By allEmplInfo=By.xpath("//tbody[@class='ant-table-tbody']/tr/td");
	public By searchBox=By.id("advanced_search_searchTerm");
	public By searchButton=By.xpath("//span[text()='Search']");


}
