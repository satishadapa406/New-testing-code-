package Neoscript;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.Driver;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.DDIV;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Course_floating_using_UI {
	
WebDriver driver;


    @Test
    public void Attendance_Entry() throws Exception {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
    	
    	driver = new ChromeDriver();
    	driver.get("http://10.1.2.178/");
    	driver.manage().window().maximize();
    	
    	System.setOut(new PrintStream(new FileOutputStream("C:\\satish\\Notification\\output.txt")));
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File srcFile = ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile, new File("C:\\satish\\Course Floating\\Before Login.jpg")); 
		driver.findElement(By.id("_userId")).sendKeys("deanosms");
		driver.findElement(By.name("password")).sendKeys("test_123");
		driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
		Thread.sleep(2000);

		TakesScreenshot ts1 = (TakesScreenshot)driver;
		   File srcFile1 = ts1.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile1, new File("C:\\satish\\Course Floating\\After Login.jpg")); 
		
		
		driver.findElement(By.xpath(".//*[@id='dashboard-view']/div/div[2]/div/div/div[3]/button")).click();
Thread.sleep(2000);
TakesScreenshot ts2 = (TakesScreenshot)driver;
File srcFile2 = ts2.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcFile2, new File("C:\\satish\\Course Floating\\After clicking on Program to course mapping.jpg")); 


driver.findElement(By.xpath(".//*[@id='level1-view']/div/div/section/div/div/div/div[1]/span/span/span[1]")).click();				
Actions action = new Actions(driver);
action.sendKeys(Keys.DOWN);
action.sendKeys(Keys.ENTER);
action.perform();
 Thread.sleep(2000);
 
 TakesScreenshot ts3 = (TakesScreenshot)driver;
 File srcFile3 = ts3.getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(srcFile3, new File("C:\\satish\\Course Floating\\After selection of program.jpg")); 
 
 driver.findElement(By.xpath(".//*[@id='level1-view']/div/div/section/div/div/div/div[2]/span/span/span[1]")).click();	  
 Thread.sleep(2000);
 action.sendKeys(Keys.DOWN);
 action.sendKeys(Keys.DOWN);
 action.sendKeys(Keys.DOWN);
 action.sendKeys(Keys.ENTER);
 action.perform();
 Thread.sleep(2000);
 
 TakesScreenshot ts4 = (TakesScreenshot)driver;
 File srcFile4 = ts4.getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(srcFile4, new File("C:\\satish\\Course Floating\\After selection of Stream and Batch.jpg")); 
 
 
 
 
 
 
 
 
 driver.findElement(By.xpath(".//*[@id='level1-view']/div/div/section[1]/div/div/div/div[3]/span/span/span[2]/span")).click(); 
 Thread.sleep(2000);
 driver.findElement(By.xpath(".//*[@id='level1-view']/div/div/section[1]/div/div/div/div[3]/span/span/span[2]/span")).click();
 Thread.sleep(2000);
 action.sendKeys(Keys.DOWN);
 action.sendKeys(Keys.DOWN);
 
 action.sendKeys(Keys.ENTER);
 action.perform();
 Thread.sleep(2000);	
 TakesScreenshot ts5 = (TakesScreenshot)driver;
 File srcFile5 = ts5.getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(srcFile5, new File("C:\\satish\\Course Floating\\After selection of Semester.jpg"));  
 
 
 driver.findElement(By.xpath("//div/div/div/button")).click();
 Thread.sleep(1000);
 TakesScreenshot ts6 = (TakesScreenshot)driver;
 File srcFile6 = ts6.getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(srcFile6, new File("C:\\satish\\Course Floating\\After Clicking add courses option.jpg")); 
 
 
 
 driver.findElement(By.xpath("html/body/div[4]/div[2]/div/table/tbody/tr[8]/td[6]/button")).click();
 Thread.sleep(1000);
 TakesScreenshot ts7 = (TakesScreenshot)driver;
 File srcFile7 = ts7.getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(srcFile7, new File("C:\\satish\\Course Floating\\After Clicking add courses option.jpg")); 
 

 
 driver.findElement(By.xpath(" html/body/div[4]/div[1]/div/a/span")).click();
 Thread.sleep(1000);
 TakesScreenshot ts8 = (TakesScreenshot)driver;
 File srcFile8 = ts8.getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(srcFile8, new File("C:\\satish\\Course Floating\\After close the Newcourses window.jpg")); 

 driver.findElement(By.xpath(".//*[@id='level1-view']/div/div/section[2]/div/button")).click();
 Thread.sleep(1000);
 TakesScreenshot ts9 = (TakesScreenshot)driver;
 File srcFile9 = ts9.getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(srcFile9, new File("C:\\satish\\Course Floating\\After close the Newcourses window.jpg")); 
 
 Thread.sleep(1000);
 driver.close();
 
    }
}
