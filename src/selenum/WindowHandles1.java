package selenum;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles1 {
	public WebDriver openBrowser()
	{
		WebDriver driver = new FirefoxDriver();
		return driver;
	
	}
	public void openUrl(WebDriver driver, String url)
	{
		driver.get(url);
	}
	public void windowToClose(WebDriver driver, String windowName)
	{
		Set<String>WindowIds= driver.getWindowHandles();
		for (String windowid:WindowIds)
		{
		
			driver.switchTo().window(windowid);
			String Title= driver.getTitle();
			if (Title.contains(windowName))
					{
				driver.close();
				
			}
		}
	}
	public static void main(String[] args)
	{
		WindowHandles1 wh1= new WindowHandles1();
		WebDriver driver = wh1.openBrowser();
		wh1.openUrl(driver, "http://Naukri.com");
		wh1.windowToClose(driver, "Amazon");
	
		
	}
		
	}

