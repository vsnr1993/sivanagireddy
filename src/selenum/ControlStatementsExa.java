package selenum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ControlStatementsExa {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.get("http://www.youtube.com");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		/*String expectTitle="YouTube";
		if (actualTitle.equals(expectTitle)) {
			System.out.println("TestCasePass");
		/}else {
			System.out.println("TestCaseFail");
		}*/
	}

}
