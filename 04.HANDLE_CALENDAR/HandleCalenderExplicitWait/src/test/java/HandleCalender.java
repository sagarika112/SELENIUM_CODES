import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Admin\\eclipse-workspace\\Banking-test\\Drivers\\chromedriver_win32 (6)\\chromedriver.exe" ); 
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//Thread.sleep(20000);
		WebDriverWait wait =new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ctl00_mainContent_view_date1']")));
		element.click();
		//List<WebElement>element = wait.until(ExpectedConditions.elementToBeClickable("//input[@id='ctl00_mainContent_view_date1']"));
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		//driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
		List<WebElement> al=driver.findElements(By.cssSelector("td[data-month='5']"));
		for(int i=0;i<al.size();i++)
		{
			String value=al.get(i).getText();
			if(value.equalsIgnoreCase("23"))
			{
				al.get(i).click();
			}
			
		}
		
		
	}

}
