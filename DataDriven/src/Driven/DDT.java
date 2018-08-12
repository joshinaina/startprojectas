package Driven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DDT {
	WebDriver driver;
	
	@Test
	public void naina() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","E:\\Software\\geckodriver-v0.19.1-win32\\geckodriver.exe");
				
		driver=new FirefoxDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
       driver.findElement(By.id("email")).clear();
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       
       driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
       driver.findElement(By.id("email")).sendKeys("vs680703@gmail.com");
       
       
       
       driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
       driver.findElement(By.id("pass")).clear();
       driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
       driver.findElement(By.id("pass")).sendKeys("Admin.789");
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
		
		
		
		
	}
	
	
}
