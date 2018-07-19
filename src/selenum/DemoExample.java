package selenum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoExample {
	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("http://google.co.in");
	}

}
