package Neoscript;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EGov_page_loading_time {
	
	WebDriver driver;

	
	@Test
	
		//For URL Loading Time
		public void  test1() throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 			
				long start =System.currentTimeMillis();
				 driver.get("http://10.1.2.178/");
				 
				 			 
			System.setOut(new PrintStream(new FileOutputStream("C:\\satish\\output.txt")));//For getting console output in to text file
			 TakesScreenshot ts = (TakesScreenshot)driver;
			   File srcFile = ts.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile, new File("C:\\satish\\Url_launching.jpg")); 
				 
				 long Finish = System.currentTimeMillis();
				 long totaltime =Finish -start;
			 System.out.println("Page Loading Time(ms) for launching E-Gov :" +totaltime);
		driver.manage().window().maximize();		 
		driver.findElement(By.id("_userId")).sendKeys("1163");
		driver.findElement(By.name("password")).sendKeys("test_123");
		Thread.sleep(2000);
		
		//login Loading Time
		long startlogin =System.currentTimeMillis();
		driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
		 
		 long Finishlogin = System.currentTimeMillis();
		 long totaltime1 =Finishlogin -startlogin;
		 System.out.println("Page Loading Time(ms) for E-Gov Login :" +totaltime1);
		 
		 Thread.sleep(2000);
		 TakesScreenshot ts2 = (TakesScreenshot)driver;
		  File srcFile2 = ts2.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile2, new File("C:\\satish\\Login.jpg")); 
		 
		//Logout  Time
		 
		 long startlogout =System.currentTimeMillis();
			driver.findElement(By.xpath(".//*[@id='myNavbar']/ul/li[4]/a/div/i")).click();
			 TakesScreenshot ts3 = (TakesScreenshot)driver;
			  File srcFile3 = ts3.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile3, new File("C:\\satish\\Logout.jpg")); 
			 long Finishlogout = System.currentTimeMillis();
			 long totaltime2 =Finishlogout -startlogout;
			 System.out.println("Page Loading Time(ms) for E-Gov Logout :" +totaltime2);
			
			 Thread.sleep(2000); 
		 driver.close();
		
		
		
		
	
	
	
	

	}
	
	

		
		
	
	
	
	
	
	
}
