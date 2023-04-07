package com.autamation.utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Testlistners extends BaseClass implements ITestListener, ISuiteListener {
	ExtentReports extentReports;
	String reportPath;
	ExtentTest log;

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("This is test start of ItestResult from TestListner");
		String methodName = result.getMethod().getMethodName();
		log = extentReports.createTest(methodName);

	}

	@Override
	public void onTestSuccess(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This is on failuar of testResult from TestListner");
		String screenShot = reportPath + "/" + result.getMethod().getMethodName() + "jpg";
		try {
			TakesScreenshot takescreenshot = (TakesScreenshot) driver;
			File srcFile = takescreenshot.getScreenshotAs(OutputType.FILE);
			File dstFile = new File(screenShot);
			FileUtils.copyFile(srcFile, dstFile);
		} catch (IOException ignored) {

		}
		log.fail(result.getThrowable().getMessage());
		log.addScreenCaptureFromPath(screenShot, "failedscreenShot");

	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ISuite suite) {
		System.out.println("This is onStart of Isuite from TestListner");
		LocalDateTime dateTime = LocalDateTime.now();// 2023-03-30T12:50:28.169574400

		String currentDateTime = dateTime.format(DateTimeFormatter.ofPattern("dd_MM_yyyy_hh_mm"));
		reportPath = System.getProperty("user.dir") + "/test-output/report" + "reports" + currentDateTime;
		File file = new File(reportPath);
		if (!file.exists()) {
			file.mkdir();
		}
		
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(System.getProperty("user.dir")+"\\src\\test\\resources\\reports" + "\\reports.html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReport);
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("This is onFinishof ISuit from TestListners");
		extentReports.flush();
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

}
