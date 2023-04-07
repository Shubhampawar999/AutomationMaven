package com.autamation.utility;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  static WebDriver driver;
	public void launchBrowser(String browser) {
		switch(browser) {
		case"edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver(setEdgeOptions());
			break;
			
		case"firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver(setFirefoxOptions());
			break;
			
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(setChromeOptions());
			break;
			
			

			
		}
	}
	public void click(By by) {
		try {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(by));
			driver.findElement(by).click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void enterText(By by,String text) {
		try {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.presenceOfElementLocated(by));
driver.findElement(by).sendKeys(text);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ChromeOptions setChromeOptions() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("incognito");
	option.setHeadless(false);
		option.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-clocking"));
		Map<String,String> prefs=new HashMap<>();
		prefs.put("download.default.directory", "C:/Users/shubham/Downloads/");
		option.setExperimentalOption("prefs", prefs);
		option.setAcceptInsecureCerts(true);
		return option;
	}


public FirefoxOptions setFirefoxOptions() {
	FirefoxOptions option=new FirefoxOptions();
	option.addArguments("start-maximized");
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("incognito");
	option.setHeadless(false);
	option.addPreference("excludeswitches",Arrays.asList("disable-popup-clocking"));
	Map<String,String> prefs=new HashMap<>();
	prefs.put("download.default.directory", "C:/Users/shubham/Downloads/");
	option.addPreference("prefs", prefs);
	option.setAcceptInsecureCerts(true);
	return option;}

public EdgeOptions setEdgeOptions() {
	EdgeOptions option=new EdgeOptions();
	option.addArguments("start-maximized");
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("incognito");
	option.setHeadless(false);
	option.setExperimentalOption("excludeswitches",Arrays.asList("disable-popup-clocking"));
	Map<String,String> prefs=new HashMap<>();
	prefs.put("download.default.directory", "C:/Users/shubham/Downloads/");
	option.setExperimentalOption("prefs", prefs);
	option.setAcceptInsecureCerts(true);
	return option;
}
public void allElement(By by) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
			
	
}
public void addButt(By by) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(by));
	
}


}

