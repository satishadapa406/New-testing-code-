package TestNG;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Create_Notification {
WebDriver driver;
	@Test(priority = 0)
	public void Notification_Create() throws Exception {
		// TODO Auto-generated method stub
		
	
		
		   // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\satish\\Geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://10.1.2.178/");
			driver.manage().window().maximize();		 
			driver.findElement(By.id("_userId")).sendKeys("1163");
			driver.findElement(By.name("password")).sendKeys("test_123");
			driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='myNavbar']/ul/li[1]/a/i")).click();	
			
			driver.findElement(By.xpath(".//*[@id='app-box']/div[3]/a/div[1]")).click();
				

			driver.findElement(By.xpath(".//*[@id='page-wrapper']/div/div/div/div[1]/div/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='message']")).sendKeys("Last Date for semester Registration is 22-4-2018");
			Thread.sleep(2000);
		
			 driver.findElement(By.cssSelector(".k-multiselect-wrap.k-floatwrap")).click();
			 Thread.sleep(2000);
			 
			 Actions action = new Actions(driver);
			 action.sendKeys(Keys.DOWN);
			 action.sendKeys(Keys.DOWN);
			 action.sendKeys(Keys.DOWN);
			 action.sendKeys(Keys.ENTER);
			 action.perform();
			  driver.findElement(By.xpath(".//*[@id='page-wrapper']/div/div/div/div[2]/div[2]/button")).click();
			  Thread.sleep(2000);
			  
				
			 
		
			 System.out.println("Notification Created Successfully");
				
	driver.close();
	
	}

	
	
	 
	 @Test(priority = 1)
		public void Student_Getting_notification() throws Exception {
			// TODO Auto-generated method stub
					
		 System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("http://10.1.2.178/");
				driver.manage().window().maximize();
				driver.findElement(By.id("_userId")).sendKeys("00FWtg23");
				driver.findElement(By.name("password")).sendKeys("test_123");
				driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[@id='ht-topnav-notifications']")).click();	
				if(driver.getPageSource().contains("Last Date for semester Registration is 22-4-2018")){
					System.out.println("Student got the Notification");
					}else{
					System.out.println("Student didn't get the Notification");
					}
	Thread.sleep(2000);
	 driver.close();
	
	 }
	 @Test(priority = 2)
		public void create_noti_using_Email_SMS() throws Exception {
			// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://10.1.2.178/");
			driver.manage().window().maximize();		 
			driver.findElement(By.id("_userId")).sendKeys("1163");
			driver.findElement(By.name("password")).sendKeys("test_123");
			driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='myNavbar']/ul/li[1]/a/i")).click();	
			
			driver.findElement(By.xpath(".//*[@id='app-box']/div[3]/a/div[1]")).click();
				

			driver.findElement(By.xpath(".//*[@id='page-wrapper']/div/div/div/div[1]/div/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='message']")).sendKeys("Last Date for semester Registration is 22-4-2018");
			Thread.sleep(2000);
			//For unselecting  the Checkbox of App
			driver.findElement(By.xpath(".//*[@id='type']/div[1]/label/input")).click();
		    Thread.sleep(1000);
			//For selecting  the Checkbox of Email 
			driver.findElement(By.xpath(".//*[@id='type']/div[2]/label/input")).click();
			Thread.sleep(1000);
			//For selecting  the Checkbox of SMS
			driver.findElement(By.xpath(".//*[@id='type']/div[3]/label/input")).click();		
			Thread.sleep(1000);
			 driver.findElement(By.cssSelector(".k-multiselect-wrap.k-floatwrap")).click();
			 Thread.sleep(2000);
			 
			 Actions action = new Actions(driver);
			 action.sendKeys(Keys.DOWN);
			 action.sendKeys(Keys.DOWN);
			 action.sendKeys(Keys.DOWN);
			 action.sendKeys(Keys.ENTER);
			 action.perform();
			 
			 
			 
			 
			 
			  driver.findElement(By.xpath(".//*[@id='page-wrapper']/div/div/div/div[2]/div[2]/button")).click();
			  Thread.sleep(2000);
			  
				driver.close();
				}
	 
	 
			@Test(enabled  = false)
				public void Student_Getting___mail_SMS() throws Exception {
					// TODO Auto-generated method stub
							
				 System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
				driver.get("https://accounts.zoho.com/signin?servicename=VirtualOffice&signupurl=https://workplace.zoho.com/orgsignup.do");
						driver.manage().window().maximize();
						driver.findElement(By.xpath(".//*[@id='lid']")).sendKeys("satish@neoscript.in");
						driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("Abcd@123");
						driver.findElement(By.xpath(".//*[@id='signin_submit']")).click();	
						/*List<WebElement> unreademeil = driver.findElements(By.xpath(".//*[@id='wms_menubar']/span[1]"));

						// Mailer name for which i want to check do i have an email in my inbox 
						String MyMailer = "egovnotifications";

						// real logic starts here
						for(int i=0;i<unreademeil.size();i++){
						    if(unreademeil.get(i).isDisplayed()==true){
						        // now verify if you have got mail form a specific mailer (Note Un-read mails)
						        // for read mails xpath loactor will change but logic will remain same
						        if(unreademeil.get(i).getText().equals(MyMailer)){
						            System.out.println("Yes we have got mail from " + MyMailer);
						            // also you can perform more actions here 
						            // like if you want to open email form the mailer
						            break;
						        }
						        else
						        {
						            System.out.println("No mail from " + MyMailer);
						        }
						
						
						
						    }}*/
					
						 
			}
			
			
						
			
			
			
			}
						 
						 
						 
						
						
							
			
	
		
	

