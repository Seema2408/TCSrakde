package Dipak_1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class A {
	
	@Test
	public void TC1() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\seema\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the application
		//open the application
				driver.get("https://www.facebook.com/");
				//click on  create new account btn
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
				//select the dd which we neeed to handle
				Thread.sleep(4000);
		       WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		        //create the object of select class
		       Select s=new Select(year);
		      Thread.sleep(4000);
		     //use select class methods(select bt text)
		      //s.selectByVisibleText("2000");
		      //select by value 
		      s.selectByValue("2021");
	

}
}
