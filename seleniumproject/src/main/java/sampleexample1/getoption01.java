package sampleexample1;
import java.util.List;

import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
public class getoption01 {

	
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
											
												WebElement skills = driver.findElementById("Skills");
											     Select skillsdrpdwn = new Select(skills);
											     
											     List <WebElement> drpdwnobj = skillsdrpdwn.getOptions();
											     
											    System.out.println("The no of options are:" + drpdwnobj.size());
											     
											     for (WebElement eachele: drpdwnobj) {
											    	 System.out.println(eachele.getText());
											     }
												//String pgsource= driver.getPageSource();
												//System.out.println("The Page source is:" +pgsource);
												
												//driver.quit();

								}
								}












