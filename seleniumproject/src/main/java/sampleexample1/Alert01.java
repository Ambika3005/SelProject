package sampleexample1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     String baseURL ="http://demo.automationtesting.in/Alerts.html";
	     driver.get(baseURL);
	     driver.manage().window().maximize();
	     
	     //Simple Alert
	     
	  driver.findElementByLinkText("Alert with OK").click();
	     driver.findElementByXPath("//button[@class='btn btn-danger']").click();
	     
	     //Confirmation Alert
	     
	  // driver.findElementByLinkText("Alert with OK & Cancel").click();
	   //driver.findElementByXPath("//button[@class='btn btn-primary']").click();
	     
	     //Prompt Alert
        
	     //driver.findElementByLinkText("Alert with Textbox").click();
	    // driver.findElementByXPath("//button[@class='btn btn-info']").click();
	     
	     Alert alert = driver.switchTo().alert();
	    alert.sendKeys("TestUser");
	     Thread.sleep(600);
	     alert.accept();
		 System.out.println("Input entered. Alert has been accepted.");
		String text =driver.findElementById("demo1").getText();
		System.out.println(text);
	}

}
