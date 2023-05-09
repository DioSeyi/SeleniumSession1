package Test;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\D.I OLUWASEYI\\eclipse-workspace\\NewP\\BrowserDriver\\geckodriver.exe");
		//Instantiate driver that can perform operation
		WebDriver driver = new FirefoxDriver();
		//Launching the application
		driver.get("https://netowsolutions.com/swadel/");
	}

}
