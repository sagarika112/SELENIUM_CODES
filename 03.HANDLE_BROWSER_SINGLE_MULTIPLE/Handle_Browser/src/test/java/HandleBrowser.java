import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Admin\\eclipse-workspace\\Banking-test\\Drivers\\chromedriver_win32 (6)\\chromedriver.exe" ); 
		WebDriver driver= new ChromeDriver();
		//driver.get("https://chercher.tech/python/windows-selenium-python");
		driver.get("http://www.naukri.com/");
		 // It will return the parent window name as a String
		 String mainWindow=driver.getWindowHandle();
		 // It returns no. of windows opened by WebDriver and will return Set of Strings
		 Set<String> set =driver.getWindowHandles();
		 // Using Iterator to iterate with in windows
		 Iterator<String> itr= set.iterator();
		 while(itr.hasNext()){
		 String childWindow=itr.next();
		    // Compare whether the main windows is not equal to child window. If not equal, we will close.
		 if(!mainWindow.equals(childWindow)){
		 driver.switchTo().window(childWindow);
		 System.out.println(driver.switchTo().window(childWindow).getTitle());
		 driver.close();
	}

}
}
}