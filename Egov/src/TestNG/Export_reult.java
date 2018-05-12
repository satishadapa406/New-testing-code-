
package TestNG;

import java.io.*;
import java.util.concurrent.TimeUnit;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Export_reult{

 public static void main(String[] args) throws InterruptedException { 

	 System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        driver.get("http://10.1.2.178/login");

        driver.manage().window().maximize();  
       
       
        WebElement username = driver.findElement(By.id("_userId"));
        WebElement password=driver.findElement(By.name("password"));

 try {
    
  FileInputStream file = new FileInputStream(new File("D:\\POI\\testdata.xls")); 
  HSSFWorkbook workbook = new HSSFWorkbook(file);

  HSSFSheet sheet = workbook.getSheetAt(0);

        Cell resultCell= sheet.getRow(1).getCell(3);
        Cell resultcell1=sheet.getRow(2).getCell(3);
        String usernamevalue = sheet.getRow(1).getCell(2).getStringCellValue();
        String passwordvalue=sheet.getRow(2).getCell(2).getStringCellValue();
        username.sendKeys(usernamevalue);
        password.sendKeys(passwordvalue);

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        String usernametext=  username.getAttribute("value");
        String passwordtext= password.getAttribute("value");

        if(usernametext.equals(usernamevalue)){
                System.out.println("set is successful.");
                resultCell.setCellValue("PASS");
        } else {
                System.out.println("set is not successful.");
                resultCell.setCellValue("FAIL");
        }
        if(passwordtext.equals(passwordvalue)){
            System.out.println("set is successful.");
            resultcell1.setCellValue("PASS");
    } else {
            System.out.println("set is not successful.");
            resultcell1.setCellValue("FAIL");
    }

  
  file.close();

  FileOutputStream outFile =new FileOutputStream(new File("D:\\POI\\output.xls"));
  workbook.write(outFile);
  outFile.close();

 } catch (FileNotFoundException fnfe) {
  fnfe.printStackTrace();
 } catch (IOException e) {
  e.printStackTrace();
 }
 driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();

 }
}

