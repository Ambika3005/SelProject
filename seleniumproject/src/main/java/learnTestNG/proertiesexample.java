package learnTestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class proertiesexample {
	@Test
	public void orangeHRMLogin() throws IOException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
		
		//Title
		
		String title = driver.getTitle();
		System.out.println("Title of the page is:" +title);
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream ("./PropertyFile/application.properties");
	    prop.load(fis); 
		
	    String property_username = prop.getProperty("username");
	    System.out.println(property_username);
	    
	    String property_pwd= prop.getProperty("password");
	    
	    String property_btnclick = prop.getProperty("buttonclick");
		
		driver.findElementByXPath(property_username).sendKeys("Admin");
		driver.findElementByXPath(property_pwd).sendKeys("admin123");
		driver.findElementByXPath(property_btnclick).click();
		
	}
}
