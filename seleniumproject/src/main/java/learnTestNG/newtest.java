package learnTestNG;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newtest {
	
	
		
		@Test
		public void samplemethod01(){
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String baseURL ="https://www.google.com";
		
		
		
		//driver.navigate().to("http://www.google.com");
		//driver.navigate().refresh();
		
		driver.get(baseURL);
					
		//Maximize the window
		
				driver.manage().window().maximize();
				
				
				
				//Title
				String title = driver.getTitle();
				System.out.println("Title of the page is:" +title);
				
				String CURL= driver.getCurrentUrl();
				System.out.println("The Current URL is:" +CURL);
			
		List <WebElement> nodropdown = driver.findElementsByTagName("select");  
			     int count = nodropdown.size();
			     System.out.println("no of dropdown is:" +count);
			     
			   
			     
			     for (int i=0; i < count; i++) {
			    	 	 
			    	 String attribute = nodropdown.get(i).getText();
			    	 System.out.println("attribute value is:" + attribute );
			     }
				//String pgsource= driver.getPageSource();
				//System.out.println("The Page source is:" +pgsource);
				
				//driver.quit();

	}



			
		}
		
		



