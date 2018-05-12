package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Profile_update {
	
WebDriver driver;
	
	@Test
	public void profile_update() throws InterruptedException
	{
		driver.findElement(By.id("_userId")).sendKeys("17MSMS21");
		driver.findElement(By.name("password")).sendKeys("test_123");
		driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='myNavbar']/ul/li[3]/a/span[2]")).click();
     Thread.sleep(2000);
    driver.findElement(By.xpath(".//*[@id='myNavbar']/ul/li[3]/ul/li[1]/a/div/p")).click();
    driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[9]/td[2]/input")).clear();
    
    driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[9]/td[2]/input")).sendKeys("9949998933");
    driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[10]/td[2]/input")).clear();
    driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[1]/div[2]/table/tbody/tr[10]/td[2]/input")).sendKeys("satishadapa406@gmail.com");
    driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[3]/div[2]/table/tbody/tr[2]/td[2]/input")).clear();
    driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[3]/div[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("9440101902");
    driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[3]/div[2]/table/tbody/tr[4]/td[2]/input")).clear();
    driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[3]/div[2]/table/tbody/tr[4]/td[2]/input")).sendKeys("9394102801");
    driver.findElement(By.xpath( ".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[3]/div[2]/table/tbody/tr[6]/td[2]/input")).clear();
    driver.findElement(By.xpath( ".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[3]/div[2]/table/tbody/tr[6]/td[2]/input")).sendKeys("subba rao");
    driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[3]/div[2]/table/tbody/tr[7]/td[2]/input")).clear();
    driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[3]/div[2]/table/tbody/tr[7]/td[2]/input")).sendKeys("9394102808");
    driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[3]/div[2]/table/tbody/tr[8]/td[2]/input")).clear();
    driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[3]/div[2]/table/tbody/tr[8]/td[2]/input")).sendKeys("neoscript@gmail.com");
    
  
  //For selecting Country
    WebDriverWait wait = new WebDriverWait(driver, 12);
 
  WebElement s= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( ".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/span/span/span[1]")));
    s.click();

    Actions a = new Actions(driver);
    for (int i=0;i<5;i++) {
    a.sendKeys(Keys.ARROW_DOWN);			
    }
    Thread.sleep(2000);
    a.sendKeys(Keys.ENTER);
    a.perform();
   

    
    //For selecting state
//46 and 60 lines are same 

    WebElement s1= driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[1]/table/tbody/tr[2]/td[2]/span/span/span[2]/span"));
    
      s1.click();
      Actions a1 = new Actions(driver);
      for (int i=0;i<5;i++) {
      a1.sendKeys(Keys.ARROW_DOWN);			
      }
      Thread.sleep(2000);
      a1.sendKeys(Keys.ENTER);
      a1.perform();
    
      //For selecting city 
      WebElement s2= driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[1]/table/tbody/tr[3]/td[2]/span/span/span[2]/span"));
      
      s2.click();
      Actions a2 = new Actions(driver);
      a2.sendKeys(Keys.ARROW_DOWN);
  
      a2.perform();
      Thread.sleep(2000);
     
    
      //Enter Door Number
      driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[1]/table/tbody/tr[4]/td[2]/input")).clear();
    
      driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[1]/table/tbody/tr[4]/td[2]/input")).sendKeys("48-17-5");
            //Enter Zipcode
      driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[1]/table/tbody/tr[5]/td[2]/input")).clear();
      driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[1]/table/tbody/tr[5]/td[2]/input")).sendKeys("500085");
      driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
      
      
      
      
      
      /*  
      //  //For selecting  current country 
      WebElement s3= driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/span/span/span[1] "));
      
      s3.click();
      Actions a3 = new Actions(driver);
      for (int i=0;i<3;i++) {
      a3.sendKeys(Keys.ARROW_DOWN);			
      }
      Thread.sleep(2000);
      a3.sendKeys(Keys.ENTER);
      a3.perform();
      
      //For selecting current state
   

        WebElement s4= driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]/span/span/span[2]"));
        
          s4.click();
          Actions a4 = new Actions(driver);
          for (int i=0;i<8;i++) {
          a4.sendKeys(Keys.ARROW_DOWN);			
          }
          Thread.sleep(2000);
          a4.sendKeys(Keys.ENTER);
          a4.perform();
        
          //For selecting current  city 
          WebElement s5= driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]/span/span/span[1]"));
          
          s5.click();
          Actions a5 = new Actions(driver);
          for (int i=0;i<3;i++) {
          a5.sendKeys(Keys.ARROW_DOWN);			
          }
          Thread.sleep(2000);
          a5.sendKeys(Keys.ENTER);
          a5.perform();
        
          //Enter Current Door Number
          driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[2]/table/tbody/tr[4]/td[2]/input")).clear();
        
          driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[2]/table/tbody/tr[4]/td[2]/input")).sendKeys("48-17-8");
          Thread.sleep(2000);
          
                //Enter Zipcode
          driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[2]/table/tbody/tr[5]/td[2]/input")).clear();
          driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div[2]/table/tbody/tr[5]/td[2]/input")).sendKeys("508245");
          Thread.sleep(2000);*/
      
      
      
      
      
      
          //Enter Account Number
          driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[5]/div[2]/table/tbody/tr[1]/td[2]/input")).clear();
          driver.findElement(By.xpath(".//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[5]/div[2]/table/tbody/tr[1]/td[2]/input")).sendKeys("60817729");
          Thread.sleep(2000);
        //Enter Bank Name
          driver.findElement(By.xpath(" .//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[5]/div[2]/table/tbody/tr[2]/td[2]/input")).clear();
          driver.findElement(By.xpath(" .//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[5]/div[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("INDIAN BANK");
          Thread.sleep(2000);
          //Enter IFSC Code
          driver.findElement(By.xpath(" .//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[5]/div[2]/table/tbody/tr[3]/td[2]/input")).clear();
          driver.findElement(By.xpath(" .//*[@id='dashboard-view']/div[3]/div/div/div[2]/div[5]/div[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("IDIB000SO24");
          Thread.sleep(2000);
          driver.findElement(By.xpath(" .//*[@id='dashboard-view']/div[2]/button")).click();
       Thread.sleep(2000);
      
       /*if(driver.getPageSource().contains("Profile Updated Successfully")){
			System.out.println("Profile updated Successfully");
			}else{
			System.out.println("profile not updated Successfully");
			}
Thread.sleep(2000);
*/
      
      
	}
	
	@BeforeMethod
	public void before() {
		
		System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	    driver.get("http://10.1.2.178/");

		
	}
		
	@AfterMethod
	public void after() throws Exception {

		Thread.sleep(2000);
		 driver.close();

	}
		

}
