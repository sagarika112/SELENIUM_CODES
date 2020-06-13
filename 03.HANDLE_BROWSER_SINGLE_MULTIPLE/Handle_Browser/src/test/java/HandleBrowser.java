import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Admin\\eclipse-workspace\\Banking-test\\Drivers\\chromedriver_win32 (6)\\chromedriver.exe" ); 
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.naukri.com/");
		 // It will return the parent window name as a String
		 String mainWindow=driver.getWindowHandle();
		 // It returns no. of windows opened by WebDriver and will return Set of Strings
		 Thread.sleep(2000);
		 ArrayList<String> ll= new ArrayList<String>(driver.getWindowHandles());
         System.out.println(ll);
		 String Window1=ll.get(0);
		 String Window2=ll.get(1);
		 String Window3=ll.get(2);
		 driver.switchTo().window(Window1);
		 System.out.println(driver.getTitle());
		 driver.switchTo().window(Window2);
		 System.out.println(driver.getTitle());
		 driver.switchTo().window(Window3);
		 System.out.println(driver.getTitle());
		 driver.switchTo().window(mainWindow);
		 System.out.println(driver.getTitle());
		
		 driver.close();
	}
}


