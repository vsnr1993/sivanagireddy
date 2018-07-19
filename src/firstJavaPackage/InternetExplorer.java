package firstJavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
	public static void main(String[] args) {
		WebDriver d = new InternetExplorerDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		d.quit();
	}

}
