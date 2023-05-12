package sampleexample1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdown01 {

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
										
											WebElement skilldrpdwn = driver.findElementById("Skills");
											
											Select drpdwnobj = new Select(skilldrpdwn);
											
											drpdwnobj.selectByValue("Analytics");
											
											//drpdwnobj.selectByVisibleText("APIs");
											
											//drpdwnobj.selectByIndex(14);
											//String pgsource= driver.getPageSource();
											//System.out.println("The Page source is:" +pgsource);
											
											//driver.quit();

							}
							}












