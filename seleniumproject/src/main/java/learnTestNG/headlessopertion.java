package learnTestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class headlessopertion {

@Test
public void Headlesstesting() {
	
		// TODO Auto-generated method stub
		HtmlUnitDriver driver = new HtmlUnitDriver();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	String baseURL="https://demo.automationtesting.in/Register.html";
	driver.get(baseURL);
	//driver.manage().window().maximize();

	String title = driver.getTitle();
	System.out.println("Title of the page is:" +title);

	System.out.println("Current URL is:" + driver.getCurrentUrl());

	driver.findElementByXPath("//input[@placeholder='First Name']").sendKeys("Selenium");

	System.out.println("Headless operation has been completed successfully");
	}

}
