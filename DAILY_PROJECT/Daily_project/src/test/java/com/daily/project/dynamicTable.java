package com.daily.project;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Admin\\eclipse-workspace\\Banking-test\\Drivers\\chromedriver_win32 (6)\\chromedriver.exe" ); 
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		//WAY1
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText());
        //WAY2 
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=2;j++)
			{
				System.out.println(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
		}
		//WAy 3 use array list 
		ArrayList al = new ArrayList();
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=2;j++)
			{
				al.add(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText());
			}
		}
		System.out.println(al);
	
		
	}

}
