package WindowHandles;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowNavigation {
	public WebDriver openBrowser()
	{
		WebDriver d = new FirefoxDriver();
		return d;
	}
	public void openURL(WebDriver d, String url)
	{
		d.get(url);
	}
	public void windowToClose(WebDriver d,String s) 
	{
		Set<String> windowIDs = d.getWindowHandles();
		for (String w : windowIDs) 
		{
			d.switchTo().window(w);
			String title = d.getTitle();
			if(title.contains(s))
			{
				d.close();
			}
			
		}
	}
	public void windowToMaximize(WebDriver d, String s)
	{
		Set<String> wd=d.getWindowHandles();
		for (String w : wd)
		{
			d.switchTo().window(w);
			String title = d.getTitle();
			if(title.contains(s))
			{
			d.manage().window().maximize();
			}
		}
	}
	public void windowToRefresh(WebDriver d, String s)
	{
		Set<String> w =d.getWindowHandles();
		for (String wd : w) 
		{
			d.switchTo().window(wd);
			String x=d.getTitle();
			if (x.contains(s))
			{
				d.manage().window().maximize();
				d.navigate().refresh();
			}
		}
	}
	public static void main(String[] args) {
		WindowNavigation wn = new WindowNavigation();
		WebDriver d= wn.openBrowser();
		wn.openURL(d, "http://naukri.com");
		/*wn.windowToClose(d, "Haier");
		//wn.windowToClose(d, "Amazon");
		//wn.windowToClose(d,"Impetus");
		//wn.windowToClose(d, "Naukri");
		//wn.windowToMaximize(d, "Amazon");*/
		wn.windowToRefresh(d, "Amazon");
	}

}
