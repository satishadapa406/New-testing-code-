package Neoscript;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class Create_notificate_with_Valid_data {
	
WebDriver driver;
	@Test(priority = 0)
	public void Notification_create_with_valid_data() throws Exception {
		// TODO Auto-generated method stub
		
	
		
		   // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\satish\\Geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://10.1.2.178/");
			driver.manage().window().maximize();
			
			System.setOut(new PrintStream(new FileOutputStream("C:\\satish\\Notification\\output.txt")));
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			   File srcFile = ts.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile, new File("C:\\satish\\Notification\\Before Login.jpg")); 
			
			
			driver.findElement(By.id("_userId")).sendKeys("1163");
			driver.findElement(By.name("password")).sendKeys("test_123");
			driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
			Thread.sleep(2000);
			
			TakesScreenshot ts1 = (TakesScreenshot)driver;
			   File srcFile1 = ts1.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile1, new File("C:\\satish\\Notification\\AfterLogin.jpg")); 
			   
			   
			  //For clicking on  Grid  option
			driver.findElement(By.xpath(".//*[@id='myNavbar']/ul/li[1]/a/i")).click();	
			
			TakesScreenshot ts2 = (TakesScreenshot)driver;
			   File srcFile2 = ts2.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile2, new File("C:\\satish\\Notification\\AfterClking_onGrid_option.jpg")); 
			
			
			 //For clicking on Notification option
			driver.findElement(By.xpath(".//*[@id='app-box']/div[3]/a/div[1]")).click();
			Thread.sleep(2000);
			TakesScreenshot ts3 = (TakesScreenshot)driver;
			   File srcFile3 = ts3.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile3, new File("C:\\satish\\Notification\\AfterClking_on_Notificaton_option.jpg")); 
				
			   //For clicking on +Create
			driver.findElement(By.xpath(".//*[@id='page-wrapper']/div/div/div/div[1]/div/a")).click();
			Thread.sleep(2000);
			TakesScreenshot ts4 = (TakesScreenshot)driver;
			   File srcFile4 = ts4.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile4, new File("C:\\satish\\Notification\\AfterClking_on_+create_option.jpg")); 
			
			//For enter the Message 
			driver.findElement(By.xpath(".//*[@id='message']")).sendKeys("Last Date for semester Registration is 22-4-2018");
			Thread.sleep(2000);
			
			TakesScreenshot ts5 = (TakesScreenshot)driver;
			   File srcFile5 = ts5.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile5, new File("C:\\satish\\Notification\\After_entered_the_Message.jpg")); 
			   
			   //For Selecting the Scheduled date
			WebElement calIcon=driver.findElement(By.cssSelector(".k-icon.k-i-calendar"));
			calIcon.click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("datetimepicker_dateview")));
			//System.out.println("Calendar Found");
			selectKendoDate("11");
			
			TakesScreenshot ts6 = (TakesScreenshot)driver;
			   File srcFile6 = ts6.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile6, new File("C:\\satish\\Notification\\After_Selection_of_Scheduled_Date.jpg")); 
			
			
			   //For Selecting the Expiry date
			
			WebElement calIcon2=driver.findElement(By.xpath(" .//*[@id='expiryDate']/p/span/span/span"));
			calIcon2.click();
			WebDriverWait wait2 = new WebDriverWait(driver, 10);
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("datetimepicker_dateview")));
			//System.out.println("Calendar Found");
			selectKendoDate("11");
			TakesScreenshot ts7 = (TakesScreenshot)driver;
			   File srcFile7 = ts7.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile7, new File("C:\\satish\\Notification\\After_Selection_of_Expired_Date.jpg")); 
			
			
			   //For clicking on Users dropdown and select the Users 
			driver.findElement(By.cssSelector(".k-multiselect-wrap.k-floatwrap")).click();
			 Thread.sleep(2000);
			 
			 Actions action = new Actions(driver);
			 action.sendKeys(Keys.DOWN);
			 action.sendKeys(Keys.DOWN);
			 action.sendKeys(Keys.DOWN);
			 action.sendKeys(Keys.ENTER);
			 action.perform();
			 
			 TakesScreenshot ts8 = (TakesScreenshot)driver;
			   File srcFile8 = ts8.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile8, new File("C:\\satish\\Notification\\After_Selection_of_Receipients.jpg")); 
			
			 
			 //For clicking on Create
			  driver.findElement(By.xpath(".//*[@id='page-wrapper']/div/div/div/div[2]/div[2]/button")).click();
			  Thread.sleep(2000);
			  TakesScreenshot ts9 = (TakesScreenshot)driver;
			   File srcFile9 = ts9.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile9, new File("C:\\satish\\Notification\\After_Creation_of_notification.jpg")); 
			
				
			 
		
			 System.out.println("Notification Created Successfully with valid data");
			 
			 			
	driver.close();
	
	}
	

public void selectKendoDate(String date) {
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.className("k-content")));
		WebElement table = driver.findElement(By.cssSelector(".k-link")); 

	//	System.out.println("Kendo Calendar");
		List<WebElement> tableRows = table.findElements(By.xpath("//tr"));
				for (WebElement row : tableRows) {
			List<WebElement> cells = row.findElements(By.xpath("td"));
			
			for (WebElement cell : cells) {
				if (cell.getText().equals(date)) {
					driver.findElement(By.linkText(date)).click();
				}
			}
		}
	}


@Test(priority = 1)
public void Student_Getting_notification() throws Exception {
	// TODO Auto-generated method stub
	System.setOut(new PrintStream(new FileOutputStream("C:\\satish\\Notification\\output.txt")));		
 System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("http://10.1.2.178/");
		driver.manage().window().maximize();
		driver.findElement(By.id("_userId")).sendKeys("00FWtg23");
		driver.findElement(By.name("password")).sendKeys("test_123");
		driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
		Thread.sleep(2000);
		TakesScreenshot ts9 = (TakesScreenshot)driver;
		   File srcFile9 = ts9.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile9, new File("C:\\satish\\Notification\\After_Login_student _account.jpg")); 
		
		driver.findElement(By.xpath(".//*[@id='ht-topnav-notifications']")).click();	
		TakesScreenshot ts10 = (TakesScreenshot)driver;
		   File srcFile10 = ts9.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile10, new File("C:\\satish\\Notification\\After_Clicking Notification Symbol.jpg")); 
		
		
		
		if(driver.getPageSource().contains("Last Date for semester Registration is 22-4-2018")){
			System.out.println("Student got the Notification");
			}else{
			System.out.println("Student didn't get the Notification");
			}
Thread.sleep(2000);
driver.close();

}




































}
