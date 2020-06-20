import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest2 {
	WebDriver driver;
	
	@Test
	public void loginTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Admin\\eclipse-workspace\\Banking-test\\Drivers"
	+ "\\chromedriver_win32 (6)\\chromedriver.exe" ); 
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Username']")).sendKeys("Admin ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Password']']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
