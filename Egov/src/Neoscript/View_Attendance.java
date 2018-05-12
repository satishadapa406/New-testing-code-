package Neoscript;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
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

public class View_Attendance {
	
WebDriver driver;


    @Test
    public void Attendance_Entry() throws Exception {
    	System.setOut(new PrintStream(new FileOutputStream("C:\\satish\\View Attendance\\output.txt")));
    	System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
    	
    	driver = new ChromeDriver();
    	driver.get("http://10.1.2.178/");
    	driver.manage().window().maximize();
    	driver.manage().window().maximize();
    	TakesScreenshot ts = (TakesScreenshot)driver;
		   File srcFile = ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile, new File("C:\\satish\\View Attendance\\Beforelogin.jpg"));
	
    	
		driver.findElement(By.id("_userId")).sendKeys("1723");
		driver.findElement(By.name("password")).sendKeys("test_123");
		driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
		Thread.sleep(2000);
		TakesScreenshot ts2 = (TakesScreenshot)driver;
		   File srcFile2 = ts2.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile2, new File("C:\\satish\\View Attendance\\Afterlogin.jpg"));
	

	
	
	
		driver.findElement(By.xpath(".//*[@id='dashboard-view']/div/div/div/div/div[2]/button")).click();
		Thread.sleep(2000);
		TakesScreenshot ts3 = (TakesScreenshot)driver;
		   File srcFile3 = ts3.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile3, new File("C:\\satish\\View Attendance\\After_clicking_on_attendance_entry.jpg"));
	
Thread.sleep(2000);
				
driver.findElement(By.cssSelector(".k-icon.k-i-arrow-s")).click();

Thread.sleep(2000);

Actions action = new Actions(driver);
for(int i=0;i<8;i++)
{
	
	action.sendKeys(Keys.DOWN);	
	
}
action.sendKeys(Keys.ENTER);
Thread.sleep(1000);
action.perform();
Thread.sleep(2000);
TakesScreenshot ts4 = (TakesScreenshot)driver;
File srcFile4 = ts4.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcFile4, new File("C:\\satish\\View Attendance\\After_Selecting_the_course.jpg"));
System.out.println("USer Viewed Attendance Successfully ");

Thread.sleep(3000);

   driver.close();
    
    
    
    
    
    
    
    
    }}