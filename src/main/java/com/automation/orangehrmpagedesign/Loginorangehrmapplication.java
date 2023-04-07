package com.automation.orangehrmpagedesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.autamation.utility.BaseClass;

public class Loginorangehrmapplication extends BaseClass{
	public static WebDriver driver;
By username=By.name("username");
By password=By.name("password");
By loginButton=By.xpath("//button[@type='submit']");
public By InvalidCredentials=By.xpath("//div[@class='orangehrm-login-error']/descendant::p[1]");


public void login(String username,String password) {
	enterText(this.username,username);
	enterText(this.password,password);
	click(loginButton);
	
	
}

}