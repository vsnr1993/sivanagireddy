package selenum;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowExample {
	
	public WebDriver openBrowser()
	{
		WebDriver d= new FirefoxDriver();
		return d;
	}
	public void openUrl(WebDriver d, String Url)
	{
		d.get(Url);
	}
	public void windowToClose(WebDriver d, String x)
			{
		Set<String> windowId = d.getWindowHandles();
		for (String w : windowId)
		{
			d.switchTo().window(w);
			String title=d.getTitle();
			if (title.contains(x))
			{
				d.close();
			}
		}
		
	}
	public void windowToMaximize(WebDriver d, String titleToCompare)
	{
		Set<String> windowIds = d.getWindowHandles();
		
		for (String w : windowIds) 
		{
           d.switchTo().window(w);
           String title=d.getTitle();
           if (title.contains(titleToCompare))
           {
			d.manage().window().maximize();
		}
			
		}
	}
 
	public void windowToRefresh(WebDriver d, String titleToCompare)
	{
	Set<String> windowIds=d.getWindowHandles();	
	for (String w : windowIds) 
	{
		d.switchTo().window(w);
		String Title=d.getTitle();
		if (Title.contains(titleToCompare))
		{
			d.navigate().refresh();
		}
		
	}
	}
	public static void main(String[] args)
	{
		WindowExample we= new WindowExample();
		WebDriver d =we.openBrowser();
		we.openUrl(d, "http://naukri.com");
		we.windowToClose(d, "Amazon");
		we. windowToMaximize(d, "Haier");
		 we. windowToRefresh(d, "Naukri");
	}
} 
