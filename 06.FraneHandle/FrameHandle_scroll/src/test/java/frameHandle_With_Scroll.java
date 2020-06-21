import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandle_With_Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Banking-test\\Drivers"
				+ "\\chromedriver_win32 (6)\\chromedriver.exe" ); 
					WebDriver driver=new ChromeDriver();
					driver.get("http://www.dwuser.com/education/content/"+"the-magical-iframe-tag-an-introduction/");
					Thread.sleep(5000);
					//To scroll down the web page by pixel.
					//JavascriptExecutor js = (JavascriptExecutor) driver;
					//js.executeScript("window.scrollBy(0,1000)");

					//To scroll down with visibilty of element 
					//STEP:1:As element / frame is not visible scroll down to near by element which is out side of frame 
					//STEP:2:Switch frame 
					//STEp:3:ele.sendkeys 
					JavascriptExecutor js = (JavascriptExecutor) driver;
					WebElement ele1=driver.findElement(By.xpath("//h2[text()='What Are You Going to Create?']"));
					 js.executeScript("arguments[0].scrollIntoView();", ele1);
					 Thread.sleep(2000);
						
					 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'/e0/subscribe-form"
					 		     + "/popup.php?key=bottomOfEducationArticle&focus=0')]")));
					WebElement ele=driver.findElement(By.xpath("//input[@name='name']"));
					ele.sendKeys("sagarika");

	}

}
