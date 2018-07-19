package firstJavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumExample3 {
	public static void main(String[] args) {
		WebDriver driver1=new FirefoxDriver();
				driver1.get("http://www.google.com");
				driver1.manage().window().maximize();
				//driver1.quit();
				WebDriver driver2=new FirefoxDriver();
				driver2.get("http://www.youtube.com");
				driver2.manage().window().maximize();
				//driver2.quit();
				WebDriver driver3=new FirefoxDriver();
				driver3.get("http://www.gmail.com");
				driver3.manage().window().maximize();
				//driver3.quit();
				WebDriver driver4=new FirefoxDriver();
				driver4.get("http://www.irctc.com");
				driver4.manage().window().maximize();
				//driver4.quit();
				WebDriver driver5=new FirefoxDriver();
			    driver5.get("http://www.yahoo.com");
			    driver5.manage().window().maximize();
			    //driver5.quit();
			    WebDriver driver6=new FirefoxDriver();
				driver6.get("http://www.icicinetbanking.com");
				driver6.manage().window().maximize();
				driver6.quit();
	}				

}
