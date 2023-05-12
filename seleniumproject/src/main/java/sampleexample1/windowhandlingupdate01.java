package sampleexample1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlingupdate01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     String baseURL ="https://demoqa.com/browser-windows";
	     driver.get(baseURL);
	     driver.manage().window().maximize();
	     
	     String mainwin = driver.getWindowHandle();
			
		 System.out.println(mainwin);
	     
	     driver.findElementById("windowButton").click();
	     
	     Set<String> Allwindows = driver.getWindowHandles();
			System.out.println("No of active windows:"+Allwindows.size());
					
			List<String> ls = new ArrayList<String>(Allwindows);
			driver.switchTo().window(ls.get(0));
			System.out.println("Title of the page is:" +driver.getTitle());
			System.out.println("CurrentURL is:" +driver.getCurrentUrl());
	        driver.switchTo().window(ls.get(1));
			System.out.println("Title of the page is:" +driver.getTitle());
			System.out.println("CurrentURL is:" +driver.getCurrentUrl());
			
			driver.switchTo().window(ls.get(0));
			
			//bringing the focus ack to main window
			//driver.switchTo().window(ls.get(2));
			
			//driver.close();
			driver.quit();
	}

}
