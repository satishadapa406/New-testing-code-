package TestNG;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumIde_seleniumwebrdriver {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
	    driver = new ChromeDriver();
   
    baseUrl = "http://10.1.2.178/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/login");
	driver.findElement(By.id("_userId")).sendKeys("1723");
	driver.findElement(By.name("password")).sendKeys("test_123");
	driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id='myNavbar']/ul/li[3]/a/span[2]")).click();
    driver.findElement(By.cssSelector("a > div > p")).click();
    driver.findElement(By.xpath("//section[@id='dashboard-view']/div[3]/div/div/div[2]/div[4]/div[2]/div/div/table/tbody/tr/td[2]/span/span/span[2]")).click();
    driver.findElement(By.xpath("//div[8]/div/div[3]/ul/li[98]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
