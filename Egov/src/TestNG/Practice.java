package TestNG;

import static org.testng.AssertJUnit.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Practice {
	
	
	 private WebDriver browser;
	  private String baseUrl;
	  //define an Excel Work Book
	  HSSFWorkbook workbook;
	  //define an Excel Work sheet
	  HSSFSheet sheet;
	  //define a test result data object
	  Map<String, Object[]> testresultdata;
	  
	  @Test(description="Launches the Selenium Master Test Application and Login")
	  public void launchSiteAndLogin() throws InterruptedException{
	  /* browser.get("http://www.seleniummaster.com");
	     for (int second = 0;; second++) {
	          if (second >= 60) Assert.fail("timeout");
	          try { if (isElementPresent(By.cssSelector("img[alt=\"Selenium Master\"]"))) 
	            break; } catch (Exception e) {}
	          Thread.sleep(1000);
	        }*/
		 browser.findElement(By.id("_userId")).clear();
	     browser.findElement(By.id("_userId")).sendKeys("17MCMC20");
	     browser.findElement(By.name("password")).clear();
	     browser.findElement(By.name("password")).sendKeys("test_123");
	     browser.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
			Thread.sleep(2000); 
	    
	     
	     
	    try{
	    //  assertEquals(browser.findElement(By.cssSelector("ul.cr > li > a")).getText(),"Test Selenium");
	      //add pass entry to the excel sheet
	    	if(browser.getPageSource().contains("K SURESH")){
	    		testresultdata.put("2", new Object[] {1d, "navigate to site and login", "site opens and login success","Pass"});
				}
					
	      
	    }
	    
	    catch(Exception e)
	    {
	      //add fail entry to the excel sheet
	      testresultdata.put("2", new Object[] {1d, "navigate to site and login", "site opens and login success","Fail"});
	    }
	  }
	    
	
	
	

	
	
	 @BeforeClass(alwaysRun = true)
	  public void setupBeforeSuite(ITestContext context) {
		 
			  
	     //create a new work book
	      workbook = new HSSFWorkbook();
	      //create a new work sheet
	       sheet = workbook.createSheet("Test Result");
	      testresultdata = new LinkedHashMap<String, Object[]>();
	      //add test result excel file column header
	      //write the header in the first row
	      testresultdata.put("1", new Object[] {"Test Step Id", "Action", "Expected Result","Actual Result"});
	      
	    try {
	    	 System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
	 	    browser = new ChromeDriver();
	 		browser.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
	 		browser.get("http://10.1.2.178/login");
	    	
	     } catch (Exception e) {
	      throw new IllegalStateException("Can't start Web Driver", e);
	    }
	    
	  }
	  @AfterClass
	  public void setupAfterSuite() {
	    //write excel file and file name is TestResult.xls 
	    Set<String> keyset = testresultdata.keySet();
	    int rownum = 0;
	    for (String key : keyset) {
	        Row row = sheet.createRow(rownum++);
	        Object [] objArr = testresultdata.get(key);
	        int cellnum = 0;
	        for (Object obj : objArr) {
	            Cell cell = row.createCell(cellnum++);
	            if(obj instanceof Date) 
	                cell.setCellValue((Date)obj);
	            else if(obj instanceof Boolean)
	                cell.setCellValue((Boolean)obj);
	            else if(obj instanceof String)
	                cell.setCellValue((String)obj);
	            else if(obj instanceof Double)
	                cell.setCellValue((Double)obj);
	        }
	    }
	    try {
	        FileOutputStream out =new FileOutputStream(new File("C:\\satish\\TestResult.xls"));
	        workbook.write(out);
	        out.close();
	        System.out.println("Excel written successfully..");
	         
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    //close the browser
	    browser.close();
	    browser.quit();
	  }
	  
	    private boolean isElementPresent(By by) {
	        try {
	          browser.findElement(by);
	          return true;
	        } catch (NoSuchElementException e) {
	          return false;
	        }
	      }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
