package Neoscript;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Foundation_course_registration {
	WebDriver driver;
	@Test(enabled=true)
	public void Foundation_course_add() throws InterruptedException, Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		 driver.get("http://10.1.2.178/");	
		
		 Thread.sleep(2000);
			TakesScreenshot ts = (TakesScreenshot)driver;
			   File srcFile = ts.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(srcFile, new File("C:\\satish\\Foundation course\\Beforelogin.jpg"));
		System.setOut(new PrintStream(new FileOutputStream("C:\\satish\\Foundation course\\output.txt")));//For getting console output in to text file
		driver.findElement(By.id("_userId")).clear();
		
		driver.findElement(By.id("_userId")).sendKeys("17MSMS20");
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("test_123");
		driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		
		
		
		TakesScreenshot ts2 = (TakesScreenshot)driver;
		   File srcFile2 = ts2.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile2, new File("C:\\satish\\Foundation course\\AfterLOgin.jpg")); 
		   		
		/*System.out.println(	driver.getTitle());
		
		driver.getTitle();
		
		String ActualResult="UoH eGov | Academic";
		assertEquals("UoH eGov | Academic", driver.getTitle());
		//System.out.println("Student logs in to system Successfully");
		Thread.sleep(2000);*/
		
		
			
		//For clicking on Foundation course
		driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[1]/div/div/div[2]/div[9]/button")).click();
		//Screenshot
		TakesScreenshot ts3 = (TakesScreenshot)driver;
		   File srcFile3 = ts3.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile3, new File("C:\\satish\\Foundation course\\After_clicking_on_Foundation_course.jpg")); 
		//For clicking on Procced
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
		TakesScreenshot ts4 = (TakesScreenshot)driver;
		   File srcFile4 = ts4.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile4, new File("C:\\satish\\Foundation course\\After_clicking_on_proceed.jpg")); 
		
		
		
		//For Clicking on +add Foundation
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-sm ng-binding']")).click();
		Thread.sleep(2000);
		TakesScreenshot ts5 = (TakesScreenshot)driver;
		   File srcFile5 = ts5.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile5, new File("C:\\satish\\Foundation course\\After_clicking_on+AddFoundation.jpg")); 
		
		
		
		

		//For Adding  course
		driver.findElement(By.xpath(".//*[@id='nsModalfoundation']/div/div/div[2]/table/tbody/tr[1]/td[9]/button")).click();
		//For Adding  course
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		
		driver.findElement(By.xpath(".//*[@id='nsModalfoundation']/div/div/div[3]/button")).click();
		
		
		Thread.sleep(1000);
		
		TakesScreenshot ts6 = (TakesScreenshot)driver;
		   File srcFile6 = ts6.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(srcFile6, new File("C:\\satish\\Foundation course\\After_adding_foundation_courses.jpg")); 
		
		//For Clicking on Update
	//WebElement e=	driver.findElement(By.xpath("//section[@id='level1-view']/div/div/div/div/section[3]/div/div[2]/div/button"));
	//e.click();
	//Thread.sleep(1000);
	
//	TakesScreenshot ts7 = (TakesScreenshot)driver;
	//   File srcFile7 = ts7.getScreenshotAs(OutputType.FILE);
	//   FileUtils.copyFile(srcFile7, new File("C:\\satish\\Foundation course\\After_clicking_Update_option.jpg")); 
	 
	//	Thread.sleep(1000);
		
		//driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
		
		 String Main_window=driver.getWindowHandle();
	       
	      driver.findElement(By.xpath("//section[@id='level1-view']/div/div/div/div/section[3]/div/div[2]/div/button")).click();
	       
	       
	    	Set<String> All_windows=driver.getWindowHandles();
	    	System.out.println(All_windows.size());
	    	// Now we will iterate using Iterator
	    	
			Iterator<String> I1= All_windows.iterator();
	    	 
	    	while(I1.hasNext())
	    	{
	    	 
	    	   String child_window=I1.next();
	    	 
	    	// Here we will compare if parent window is not equal to child window then we  will close
	    	 
	    	if(!Main_window.equals(child_window))
	    	{
	    	driver.switchTo().window(child_window);
	    	 
	    	System.out.println(driver.switchTo().window(child_window).getTitle());
	    	 
	    	driver.findElement(By.xpath("html/body/div[8]/div/div/div[3]/button[2]")).click();
	    	
	    	
	    	
	    	
	    	}
	    	 
	    	}
	    	// once all pop up closed now switch to parent window
	    	driver.switchTo().window(Main_window);
		
		
		
		
		
		
		
		
		
		
		
		//Alert al = driver.switchTo().alert();
		//al.dismiss();
		
		// Capturing alert message.    
       // String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
      //  System.out.println(alertMessage);	
       // Thread.sleep(5000);
		
		
		
	//Clicking on NO in pop-up
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		
		//driver.findElement(By.cssSelector(".btn.btn-default")).click();
		
		
		//Clicking on YES in pop-up
		//driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
		
		
		Thread.sleep(1000);
	
	
	//driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	

}
