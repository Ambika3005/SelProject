package sampleexample1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class radiobutton {
	
	

		
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				String baseURL ="https://demo.automationtesting.in/Register.html";
				
				
				
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
						driver.findElementByXPath("//input[@value='Male']").click();
						driver.findElementByXPath("//input[@value='FeMale']").click();
						WebElement radiofemale = driver.findElementByXPath("//input[@value='FeMale']");
						
						//ctrl +2,L
						
						WebElement radiomale= driver.findElementByXPath("//input[@value='Male']");
						
						System.out.println(radiofemale.isSelected());
						System.out.println(radiomale.isSelected());
						
						//String pgsource= driver.getPageSource();
						//System.out.println("The Page source is:" +pgsource);
						
						//driver.quit();

		}
		}




