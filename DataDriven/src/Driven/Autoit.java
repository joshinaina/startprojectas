package Driven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Autoit 

{
	
	WebDriver driver;
	@BeforeTest
    
	public void launchbrowser()
	
	{
		System.setProperty("webdriver.gecko.driver","E:\\Software\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   
		   //gmail url
		   driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-en&flowName=GlifWebSignIn&flowEntry=SignUp");
	      
		
		
	}
	

	@Test
	
	
	public void autoe() throws IOException 
	{
		
		//fill out the gmail detail for create an account
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   driver.findElement(By.id("firstName")).sendKeys("Naina");
   
   
   
	
   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   //user name data
     driver.findElement(By.id("lastName")).sendKeys("sharma");
   
    
    //driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("42");
    
    
    
    
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//for fillup id    
    driver.findElement(By.id("username")).sendKeys("abcd");
    
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    
    //for click password
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/form/div[2]/div/div[1]/div[3]/div[1]/div[1]/div/div/div[1]/div/div[1]/input")).sendKeys("33");
    
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    
    //click on next
    
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div[1]/div/content")).click();
    
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    
    // only put String errortext
    String errortext= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/form/div[2]/div/div[1]/div[3]/div[1]/div[1]/div/div/div[2]/div[2]")).getText();
   
    //then need to  printout popup
    System.out.println("errormessagetext:"+errortext); 
    
    //if condition use, if we fill wrong password
   
   if(errortext.equalsIgnoreCase("Use 8 characters or more for your password"))
   {
	   //whats message we needs to printout message
	   System.out.println("Yes this is  working");
	   
	   Runtime.getRuntime().exec("D:\\AutoIT\\message.exe");
	   
	   
	   // correct password
	   //if we use correct password according condition then pop up is not coming.
	   
   }
    
    
	
		
		
		
		
		
		
		
	}
	
	
	
	
}
	
	


