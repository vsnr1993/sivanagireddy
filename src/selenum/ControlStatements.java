package selenum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ControlStatements {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://google.com");
		String actualTitle=driver.getTitle();
		String expectTitle="Google";
		if (actualTitle.equals(expectTitle)) {
			System.out.println("TestCasePass");
			
		}else {
			System.out.println("TestCaseFail");
		}
	}

}
