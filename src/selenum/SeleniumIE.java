package selenum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SeleniumIE {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		//driver.get("http://google.com");
		driver.manage().window().maximize();
	}

}
