package sampleexample1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Explicitwait01 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String baseURL ="https://opensource-demo.orangehrmlive.com/";
		
		driver.get(baseURL);
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		//syntax
		//WebDriverWait wait = new WebDriverWait(object reference, Time);
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		
		
		//Title
		
		String title = driver.getTitle();
		System.out.println("Title of the page is:" +title);
		
		driver.findElementByXPath("//input[@placeholder='Username']").sendKeys("Admin");
		driver.findElementByXPath("//input[@placeholder='Password']").sendKeys("admin123");
		driver.findElementByXPath("//button[@type='submit']").click();
			
		WebElement webele = driver.findElementByLinkText("Admin");
		
		//WebElement element =wait.until(ExpectedConditions.elementToBeClickable(webele));
		
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(webele));
		ele.click();

	}
	}
