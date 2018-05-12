package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Create_Notification_withinvalid_data {

	WebDriver driver;
	@Test
	public void Notifications() throws Exception {
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
			//Click on Grid option
			driver.findElement(By.xpath(".//*[@id='myNavbar']/ul/li[1]/a/i")).click();	
			//Click Notification 
			driver.findElement(By.xpath(".//*[@id='app-box']/div[3]/a/div[1]")).click();
			//Click on +create	
			driver.findElement(By.xpath(".//*[@id='page-wrapper']/div/div/div/div[1]/div/a")).click();
			Thread.sleep(2000);
			//For unselecting  the Checkbox and click on  Create 
			driver.findElement(By.xpath(".//*[@id='type']/div[1]/label/input")).click();
			driver.findElement(By.xpath(".//*[@id='page-wrapper']/div/div/div/div[2]/div[2]/button")).click();
			Thread.sleep(2000);
			//For Enter the message and click on Create
			driver.findElement(By.xpath(".//*[@id='message']")).sendKeys("Last Date for semester Registration is 22-4-2018");
			driver.findElement(By.xpath(".//*[@id='page-wrapper']/div/div/div/div[2]/div[2]/button")).click();
			Thread.sleep(2000);
			//For selecting  the Checkbox and click on Create
			driver.findElement(By.xpath(".//*[@id='type']/div[1]/label/input")).click();
			driver.findElement(By.xpath(".//*[@id='page-wrapper']/div/div/div/div[2]/div[2]/button")).click();
			Thread.sleep(2000);
			if(driver.getPageSource().contains("Notification Request Created.")){
				System.out.println("Created the Notification");
				}else{
				System.out.println("Not Created the Notification ");
				}
	
	Thread.sleep(2000);
	driver.close();
	
	
	
	
	
	
	}	
	
}
