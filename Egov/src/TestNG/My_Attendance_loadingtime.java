package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_Attendance_loadingtime {
	
	
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\satish\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//For URL Loading Time
		long start =System.currentTimeMillis();
		 driver.get("http://10.1.2.178/");
		 long Finish = System.currentTimeMillis();
		 long totaltime =Finish -start;
		 System.out.println("Page Loading Time :" +totaltime);
driver.manage().window().maximize();		 
driver.findElement(By.id("_userId")).sendKeys("1163");
driver.findElement(By.name("password")).sendKeys("test_123");
Thread.sleep(4000);
driver.findElement(By.xpath(".//*[@id='login-view']/div/div/div/div/div[2]/form/fieldset/button")).click();
Thread.sleep(4000);
       //For My_attendance Loading Time
long Myattendance_start =System.currentTimeMillis();
driver.findElement(By.xpath(".//*[@id='dashboard-view']/div/div[2]/div/div/div[1]/button")).click();
long Myattendance_Finish = System.currentTimeMillis();
long Attendance_Totaltime =Myattendance_Finish -Myattendance_start;
System.out.println("Attendance_Page Loading Time :" +Attendance_Totaltime);

Thread.sleep(4000);
driver.close();

	
	
	}

}
