package sampleexample1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     String baseURL ="https://erail.in/";
	     driver.get(baseURL);
	     driver.manage().window().maximize();
	     
	     driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
	     driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("MAS",Keys.TAB);
	     driver.findElementByXPath("//input[@id='txtStationTo']").clear();
	     driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("SBC",Keys.TAB);
	     driver.findElementById("buttonFromTo").click();
	     
	     
	     //All the time check box should be deselected mode
	     WebElement elecheckbox = driver.findElementById("chkSelectDateOnly");
	     if (elecheckbox.isSelected()) {
	    	 elecheckbox.click(); 
	     }
	     	     
	     WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']");
	     
	     //List<WebElement> allrows = table.findElements(By.tagName("tr"));
        List<WebElement> allrows = table.findElements(By.tagName("tr"));	
	     int rowscount = allrows.size();
	     System.out.println("Total no of trains are:"+rowscount);
	     
	     System.out.println("Train No's are :" );	  
	     for (int i=1; i< rowscount; i++) {
	    	 WebElement rows = allrows.get(i);
	    	 List<WebElement> cols = rows.findElements(By.tagName("td"));
	    	 String values = cols.get(0).getText();
	    	 System.out.println(values);	
	    	  
	     }
	}

}
