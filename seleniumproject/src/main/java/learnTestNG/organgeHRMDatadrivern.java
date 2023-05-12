package learnTestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class organgeHRMDatadrivern {
	@Test (dataProvider ="getData")
	public void loginHRM(String url,String username, String password) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	    driver.manage().window().maximize();
		
		//Title
		
		String title = driver.getTitle();
		System.out.println("Title of the page is:" +title);
		
		driver.findElementByXPath("//input[@placeholder='Username']").sendKeys(username);
		driver.findElementByXPath("//input[@placeholder='Password']").sendKeys(password);
		driver.findElementByXPath("//button[@type='submit']").click();
		driver.close();
	}

	@DataProvider (name ="getData")
	public Object[][] readexceldata() throws IOException {
		return Utility.readdata();
	}
		}
	 

