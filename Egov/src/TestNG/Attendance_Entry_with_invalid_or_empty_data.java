package TestNG;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.DDIV;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Attendance_Entry_with_invalid_or_empty_data {
	
WebDriver driver;


    @Test
    public void Attendance_Entry() throws Exception {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
    	
    	driver = new ChromeDriver();
    	driver.get("http://10.1.2.178/");
    	driver.manage().window().maximize();
    	driver.manage().window().maximize();		 
		driver.findElement(By.id("_userId")).sendKeys("1723");
		driver.findElement(By.name("password")).sendKeys("test_123");
		driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='dashboard-view']/div/div/div/div/div[2]/button")).click();
Thread.sleep(2000);
				
driver.findElement(By.cssSelector(".k-icon.k-i-arrow-s")).click();

Thread.sleep(2000);
/*
For selecting course one by one
for(int i=0;i<15;i++)
{
	Actions action = new Actions(driver);
	action.sendKeys(Keys.DOWN);	
	action.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	action.perform();
}*/

//For scrolling the courses up to 14th course then select the14th course
Actions action = new Actions(driver);
for(int i=0;i<9;i++)
{
	
	action.sendKeys(Keys.DOWN);	
	
}
action.sendKeys(Keys.ENTER);
Thread.sleep(1000);
action.perform();
Thread.sleep(3000);

//For clicking +add attendance button 
//driver.findElement(By.cssSelector(".btn.btn-primary.btn-sm.btn-sq")).click();
  //  //Click on textbox so that datepicker will come
//Thread.sleep(3000);
 //   driver.findElement(By.xpath("html/body/div[7]/div[2]/div/div/div[1]/div")).click();
  /*  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    //Click on next so that we will be in next month
    driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();

    /*DatePicker is a table.So navigate to each cell
    * If a particular cell matches value 13 then select it
    
    WebElement dateWidget = driver.findElement(By.cssSelector(""));
    List<WebElement> rows=dateWidget.findElements(By.tagName("tr"));
    
    List<WebElement> columns =dateWidget.findElements(By.tagName("td"));

    for (WebElement cell: columns){
    //Select 13th Date
    if (cell.getText().equals("13")){
    cell.findElement(By.linkText("13")).click();
    break;
    }
    }	
    
    }*/
	
//Store and Print the name of the First window on the console

/*String handle= driver.getWindowHandle();

System.out.println(handle);

// Click on the Button "New Message Window"

driver.findElement(By.cssSelector(".btn.btn-primary.btn-sm.btn-sq")).click();

// Store and Print the name of all the windows open	              

Set handles = driver.getWindowHandles();

System.out.println(handles);

// Pass a window handle to the other window

for (String handle1 : driver.getWindowHandles()) {

	System.out.println(handle1);

	driver.switchTo().window(handle1);

	}*/

Thread.sleep(2000);

driver.findElement(By.cssSelector(".btn.btn-primary.btn-sm.btn-sq")).click();

Thread.sleep(2000);

//button to open calendar
WebElement selectDate = driver.findElement(By.xpath("html/body/div[7]/div[2]/div/div/div[1]/div/span[5]/span/span/span"));

selectDate.click();
//click on 19the date

              
driver.findElement(By.cssSelector("td.k-state-hover > a.k-link")).click();

 //sending class hours
driver.findElement(By.id("_attenHourInput")).sendKeys("2");



//sending  hours attended
     
     WebElement w1=driver.findElement(By.id("_atten17MBMA01"));
     w1.clear();
     w1.sendKeys("3");
   //click on submit
   
    driver.findElement(By.xpath("html/body/div[7]/div[2]/div/div/div[2]/div/button")).click();
WebElement w2=driver.findElement(By.id("_atten17MBMA03"));
     w2.clear();
     w2.sendKeys("3");  
   //click on submit
     driver.findElement(By.xpath(".btn.btn-success.col-md-2.ng-scope")).click();
WebElement w3=driver.findElement(By.id("_atten17MBMA22"));
     w3.clear();
     w3.sendKeys("3");
   //click on submit
     driver.findElement(By.xpath(".btn.btn-success.col-md-2.ng-scope")).click();
      
     
   
     
     
     
     
     
	

Thread.sleep(2000);
	
driver.close();
	
	
	
	
	
    	
    }
}
