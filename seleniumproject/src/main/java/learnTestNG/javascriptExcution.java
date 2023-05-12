package learnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascriptExcution {
	
	@Test
	public void learnjavascriptmethod() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	String baseURL="http://www.freecrm.com";
	driver.get(baseURL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//downcasting the interface to accept the object
	
	//driver.findElementByLinkText("ES").click();
	
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	WebElement Login = driver.findElementByXPath("//span[text()='Log In']");
	//WebElement Login =driver.findElementByLinkText("Log In");
	//js.executeScript("document.getElementByXpath(//span[text()='Log In']).click();");
	js.executeScript("arguments[0].click();",Login);
	Thread.sleep(1200);
	WebElement email = driver.findElementByXPath("//input[@name='email']");
	js.executeScript("arguments[0].value='ghadlingeambika@gmail.com';",email);
	
	//select
	//js.executeScript("arguments[0].select="",WebElement);
	}
}

