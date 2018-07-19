import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {

	public static void main(String[] args) {
		WebDriver d= new InternetExplorerDriver();
		d.get("http://google.com");
		d.close();
		
	}
}
