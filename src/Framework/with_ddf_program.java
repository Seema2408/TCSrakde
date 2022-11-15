package Framework;

import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class with_ddf_program {
public static void main(String[] args) {
	
	//fetch data from excel
	FileInputStream fis=new FileInputStream("C:\\Users\\seema\\OneDrive\\Desktop\\New folder\\Family.xlsx\");
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//delete all cookies
	driver.manage().deleteAllCookies();
	
	//maximize
	driver.manage().window().maximize();
	
	//open the application
	driver.get("https://demo.actitime.com/login.do");
	
	//enter username
	
	
}
}
