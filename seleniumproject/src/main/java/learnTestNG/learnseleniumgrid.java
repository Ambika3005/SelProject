package learnTestNG;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class learnseleniumgrid {
	@Test
	public void loginHRM() throws MalformedURLException {
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.ANY);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),ds);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 /* String baseURL="http://www.google.com";
		driver.get(baseURL);
		
		System.out.println("Title of the page is:" +driver.getTitle());*/
		
		//driver.manage().window().maximize();
		
	    String baseURL ="https://opensource-demo.orangehrmlive.com/";
		
		driver.get(baseURL);
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		//Title
		
		String title = driver.getTitle();
		System.out.println("Title of the page is:" +title);
		
		System.out.println(driver.getPageSource());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

}
}
