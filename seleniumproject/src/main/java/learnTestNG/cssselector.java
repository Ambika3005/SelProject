package learnTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cssselector {
	@Test
	public void CSSLocators() {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String baseURL="https://demo.guru99.com/test/newtours/register.php";
		driver.get(baseURL);
		driver.manage().window().maximize();	
		
		driver.findElementByCssSelector("input#email").sendKeys("test@gmail.com");
		//driver.findElementByCssSelector("input[name='email']").sendKeys("test@gmail.com");
	}
}
