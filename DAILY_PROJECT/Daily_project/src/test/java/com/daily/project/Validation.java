package com.daily.project;


import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import junit.framework.Assert;
public class Validation {

		
		@Test
		 @Parameters("State_city")
		public void validateDropdown(String State_city) throws InterruptedException
		{
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\Admin\\eclipse-workspace\\Banking-test\\Drivers\\chromedriver_win32 (6)\\chromedriver.exe"
		  ); WebDriver driver= new ChromeDriver();
		  driver.get("https://geodata.solutions/");
		  Thread.sleep(3000);
		  WebElement Country=driver.findElement(By.xpath("//select[@id='countryId']"));
		  Select sct= new Select(Country); 
		  sct.selectByVisibleText("India");
		 
		  System.out.println(State_city);
		  String str=State_city;
		  String[] splited = str.split(" ");
		  String s1=splited[0];
		  String ExpectedCity=splited[1];
		  Thread.sleep(3000);
		  WebElement State=driver.findElement(By.xpath("//select[@id='stateId']"));
		  Select sct1= new Select(State);
		  sct1.selectByVisibleText("Odisha");
		  Thread.sleep(6000);
		  WebElement City=driver.findElement(By.xpath("//select[@id='cityId']"));
		 
		  Select sct2= new Select(City);
		  List<WebElement>soptions=sct2.getOptions();
		  String ActualCity=soptions.get(1).getText();
		  Assert.assertEquals(ExpectedCity, ActualCity);
		  
		}

		
	       
	        }

		





