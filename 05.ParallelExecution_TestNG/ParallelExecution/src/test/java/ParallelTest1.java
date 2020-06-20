import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest1 {
	WebDriver driver;
	
@Test
public void logoTest() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Admin\\eclipse-workspace\\Banking-test\\Drivers"
+ "\\chromedriver_win32 (6)\\chromedriver.exe" ); 
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']/img"));
	Assert.assertTrue(logo.isDisplayed());
	Thread.sleep(3000);

	
}
@Test
public void verify_HomeTitle()
{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Banking-test\\Drivers"
			+ "\\chromedriver_win32 (6)\\chromedriver.exe" ); 
				driver=new ChromeDriver();	
				driver.get("https://opensource-demo.orangehrmlive.com/");
				//WebElement homeTitle=driver.findElement(By.xpath(""))
				Assert.assertEquals(driver.getTitle(), "OrangeHRM");
}
@AfterMethod
public void tearDown()
{
	driver.quit();
}

}
