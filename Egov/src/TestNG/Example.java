package TestNG;

import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example {
	WebDriver driver;
	@Test
	public void dataExport() throws Exception
	
	
	
	
	{
		
		driver.findElement(By.id("_userId")).sendKeys("17MSMS20");
		driver.findElement(By.name("password")).sendKeys("test_123");
		driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
		Thread.sleep(2000);	
		FileOutputStream fos=new FileOutputStream("D:\\POI\\Result.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet s=wb.createSheet("Results");
		Row r=s.createRow(0);
		r.createCell(0).setCellValue("Test step");
		r.createCell(1).setCellValue("Action");
		r.createCell(2).setCellValue("Expected Result");
		r.createCell(3).setCellValue("Actual Result");
		wb.write(fos);
		fos.close();
		
		
		
		
		
		
		
		
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
