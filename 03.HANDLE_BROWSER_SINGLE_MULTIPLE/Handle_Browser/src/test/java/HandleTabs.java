import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Admin\\eclipse-workspace\\Banking-test\\Drivers\\chromedriver_win32 (6)\\chromedriver.exe" ); 
		WebDriver driver= new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		 ArrayList<String>tbs2= new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tbs2.get(1));
		 System.out.println(driver.getTitle());
		 //driver.close();
		driver.switchTo().window(tbs2.get(0)); 
		System.out.println(driver.getTitle()); 

	}

}
