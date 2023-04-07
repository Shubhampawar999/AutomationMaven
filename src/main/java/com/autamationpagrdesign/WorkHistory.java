package com.autamationpagrdesign;

import org.openqa.selenium.By;

import com.autamation.utility.BaseClass;

public class WorkHistory extends BaseClass{
	
	
	public By workHist= By.xpath("//a[contains(text(),'Work History')]");
	public By addNewButton=By.xpath("//div[@id=\"EmployeeCareerTable\"]/descendant::button[1]/span[2]");
	public By emplpoyeeSearchBox=By.xpath("//input[@id=\"rc_select_0\"]");
	public By jobTilatlSearchBox=By.xpath("//input[@id=\"rc_select_1\"]");
	public By dateStart=By.xpath("//input[@id=\"date_start\"]");
	public By endDate=By.xpath("//input[@id=\"date_end\"]");
	public By department=By.xpath("//input[@id=\"rc_select_2\"]");
	public By supwrvisor=By.xpath("//input[@id=\"rc_select_2\"]");
	public By employmentStatus=By.xpath("//input[@id=\"rc_select_9\"]");
	public By date=By.xpath("//td[@title='2023-03-26']");
	public By endDat=By.xpath("//td[@title='2023-03-30']");
	
	public void allValue(String Abc,String QAEngg,String emplSdate,String emplEndDate,String Dept,String superviser,String emplStatus
			) {
		enterText(this.emplpoyeeSearchBox,Abc);
		enterText(this.jobTilatlSearchBox,QAEngg);

		
	}

}
