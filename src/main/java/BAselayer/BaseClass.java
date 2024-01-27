package BAselayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public void initilization() {
	 driver= new ChromeDriver();
	 driver.get("WWW.facebook.com");
	
}
}