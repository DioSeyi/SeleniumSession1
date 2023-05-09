package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Connect browser to our script
		//Setting property
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\D.I OLUWASEYI\\eclipse-workspace\\NewP\\BrowserDriver\\chromedriver.exe");
		//Instantiate driver that can perform operation
		WebDriver driver = new ChromeDriver();
		//Launching the application
		driver.get("https://netowsolutions.com/swadel/");
		//identify element on the application
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
		//Perform an action on the element
		driver.findElement(By.id("reg_email")).click();
		driver.findElement(By.id("reg_email")).sendKeys("");
		//Clicking the register button
		driver.findElement(By.name("register")).click();
	}

}
