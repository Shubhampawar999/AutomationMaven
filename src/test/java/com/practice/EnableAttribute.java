package com.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnableAttribute {
	@BeforeClass
	public void start() {
		System.out.println("Inside the before class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Start The Test Exicuton");
	}
	@AfterMethod
	public void afterTest() {
		System.out.println("End The Test Exicution");
	}
  @Test(priority=1,description="performing test1")
  public void test1() {
	  System.out.println("");
  }
  @Test(priority=2,description="performing test2")
  public void test2() {
	  System.out.println("");
  }
  @Test(priority=3,description="performing test 3")
  public void test3() {
	  System.out.println("");
  }
  @Test
  
  public void test() {
	  System.out.println("user.dir");
  }
}
