package learnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnbrowserTwsting {
public static WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void loginHRM(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			 driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//String baseURL ="https://opensource-demo.orangehrmlive.com/";
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//Maximize the window
		driver.manage().window().maximize();
		//Title
		String title = driver.getTitle();
		System.out.println("Title of the page is:" +title);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.close();
	}

}
