package sampleexample1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String baseURL ="http://www.google.com";
		
		
		
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
				
				//String pgsource= driver.getPageSource();
				//System.out.println("The Page source is:" +pgsource);
				
				//driver.quit();

}
}
