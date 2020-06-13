package com.daily.project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCase1 {
	
	@Test
	public void varifyTitle()
	{
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Admin\\eclipse-workspace\\Banking-test\\Drivers\\chromedriver_win32 (6)\\chromedriver.exe"
				 ); WebDriver driver= new ChromeDriver();
				  driver.get("https://www.google.com/");
				  String Expected_Result="Google";
				  String Actual_Result=driver.getTitle();
				  
				Assert.assertEquals(Expected_Result, Actual_Result);
				String name="aaa";
				System.out.println(name);
				System.out.println("name");
	}

}
