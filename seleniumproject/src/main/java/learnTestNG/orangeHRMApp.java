package learnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class orangeHRMApp {
	@Parameters ({"url","username","password"})
	@Test
	public void loginHRM(String url, String username, String password) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@placeholder='Username']").sendKeys(username);
		driver.findElementByXPath("//input[@placeholder='Password']").sendKeys(password);
		driver.findElementByXPath("//button[@type='submit']").click();
	}

}
