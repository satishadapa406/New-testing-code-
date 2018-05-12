package Neoscript;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Egov_login {
	
	WebDriver driver;
	
	
	
	
	
	@Test(enabled=true)
	public void Login_Failed_because_of_invalid_userNam_valid_pass() throws InterruptedException, Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		 driver.get("http://10.1.2.178/");
		System.setOut(new PrintStream(new FileOutputStream("C:\\satish\\Login management\\output.txt")));//For getting console output in to text file
		driver.findElement(By.id("_userId")).clear();
		driver.findElement(By.id("_userId")).sendKeys("123444");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("test_123");
		driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File srcFile = ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile, new File("C:\\satish\\Login management\\Invalid_userna_valid_pass.jpg")); 
		   /*if(driver.getPageSource().contains("UserId does not exist.")){
			System.out.println("User unable to  logs in to system successfully ");
			}else{
			System.out.println("User logged in to the application with out error ");
			}*/
	}
	

	@Test(enabled=true)
	public void Login_Failed_because_of_valid_userNam_invalid_pass() throws InterruptedException, Exception
	{
		
		
		System.setOut(new PrintStream(new FileOutputStream("C:\\satish\\Login management\\output.txt")));//For getting console output in to text file
		driver.findElement(By.id("_userId")).clear();
		driver.findElement(By.id("_userId")).sendKeys("17MSMS20");
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("fgfgfgfg");
		driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
		
		Thread.sleep(2000);
		TakesScreenshot ts2 = (TakesScreenshot)driver;
		   File srcFile2 = ts2.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile2, new File("C:\\satish\\Login management\\valid_userna_invalid_pass.jpg")); 
		   /*if(driver.getPageSource().contains("Incorrect Password.")){
			System.out.println("User unable to  logs in to system successfully ");
			}else{
			System.out.println("User logged in to the application with out error ");
			}*/
				
	}
		
	@Test(enabled=true)
	public void Login_Failed_because_of_invalid_userNam_invalid_pas() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		 driver.get("http://10.1.2.178/");
		Thread.sleep(2000);
		System.setOut(new PrintStream(new FileOutputStream("C:\\satish\\Login management\\output.txt")));//For getting console output in to text file
		driver.findElement(By.id("_userId")).clear();
		driver.findElement(By.id("_userId")).sendKeys("wewewew");
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("fgfgfgfg");
		driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
		Thread.sleep(2000);
		TakesScreenshot ts3 = (TakesScreenshot)driver;
		   File srcFile3 = ts3.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile3, new File("C:\\satish\\Login management\\Invalid_userna_invalid_pass.jpg")); 
		   /*if(driver.getPageSource().contains("UserId does not exist.")){
			System.out.println("User unable to  logs in to system successfully ");
			}else{
			System.out.println("User logged in to the application with out error ");
			}*/
				
	}
		
	
	@Test(enabled=true)
	public void Login_Success_with_valid_userNam_valid_pass() throws InterruptedException, Exception
	{
		System.setOut(new PrintStream(new FileOutputStream("C:\\satish\\Login management\\output.txt")));//For getting console output in to text file
		driver.findElement(By.id("_userId")).clear();
		
		driver.findElement(By.id("_userId")).sendKeys("17MSMS20");
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("test_123");
		driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
		Thread.sleep(2000);
		
		
		TakesScreenshot ts4 = (TakesScreenshot)driver;
		   File srcFile4 = ts4.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile4, new File("C:\\satish\\Login management\\valid_userna_valid_pass.jpg")); 
		   		
		System.out.println(	driver.getTitle());
		
		driver.getTitle();
		
		String ActualResult="UoH eGov | Academic";
		assertEquals("UoH eGov | Academic", driver.getTitle());
		//System.out.println("Student logs in to system Successfully");
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}
		
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
