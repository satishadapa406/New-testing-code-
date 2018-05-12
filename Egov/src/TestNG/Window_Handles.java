package TestNG;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.annotations.Test;

public class Window_Handles {
	
WebDriver driver;


    @Test
    public void Attendance_Entry() throws Exception {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
    	
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
       String Main_window=driver.getWindowHandle();
       
      driver.findElement(By.xpath("//div[@id='bluemenu']/ul/li[5]/a/font")).click();
       
       
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
    	 
    	driver.close();
    	}
    	 
    	}
    	// once all pop up closed now switch to parent window
    	driver.switchTo().window(Main_window);
    	
    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src, new File("D:\\Screendhot.png"));
  	 
    	}
    	   	
    	
    }
    



