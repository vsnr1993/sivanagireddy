package selenum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class SeleniumExample {
	public static void main(String[] args) {
	ProfilesIni ini=new ProfilesIni();
	FirefoxProfile fp=ini.getProfile("siva");
	WebDriver driver=new FirefoxDriver(fp);
	driver.manage().window().maximize();
	driver.get("http://google.cm");
	driver.get("http://flipkart.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.quit();
	
	
	
	}

} 
