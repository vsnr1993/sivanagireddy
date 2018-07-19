package firstJavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumExample2 {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
				//driver.get("http://www.google.com");
				//driver.get("http://www.youtube.com");
				//driver.get("http://www.gmail.com");
				//driver.get("http://www.irctc.com");
			    //driver.get("http://www.yahoo.com");
				driver.get("https://www.icicinetbanking.com");
				driver.manage().window().maximize();
				//driver.quit();
	
		
	}

}
