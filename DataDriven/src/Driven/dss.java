package Driven;

import java.io.File;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dss
{
	static WebDriver driver;

	 public static void main(String []args){
	  
	  try {
	  // Specify the path of file
	  File src=new File("C:\\Users\\vinod\\Desktop\\Book1.xlsx");

	   
	   FileInputStream fis=new FileInputStream(src);
	 
	   // Load workbook
	   XSSFWorkbook wb=new XSSFWorkbook(fis);
	   
	   // Load sheet- Here we are loading first sheet only
	      XSSFSheet sh1= wb.getSheetAt(0);
	      XSSFRow row = sh1.getRow(0);
	      System.out.println("number of rows in excel="+row);
 		 System.setProperty("webdriver.gecko.driver","E:\\Software\\geckodriver-v0.19.1-win32\\geckodriver.exe");
 		int colNum = row.getLastCellNum();
        System.out.println("Total Number of Columns in the excel is : "+colNum);
        int rowNum = sh1.getLastRowNum()+1;
        System.out.println("Total Number of Rows in the excel is : "+rowNum);
        
     //payable images load from excel
        

	  	driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	      
	      for(int i=1; i <=  rowNum;i++)
	        {
	    	    String username=    sh1.getRow(i).getCell(0).getStringCellValue();
	    		 System.out.println("Print the user name="+username);
	    		 
	    		 
	    		
	    		String password=    sh1.getRow(i).getCell(1).getStringCellValue();
	    		 System.out.println("Print the password="+password);
	    			
	    		 
	    		 
	    		
	    			
	    			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    	    driver.findElement(By.id("email")).clear();
	    	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    	    
	    	    driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	    	    driver.findElement(By.id("email")).sendKeys(username);
	    	   Thread.sleep(3000);
	    	    
	    	    
	    	   
	    	    
	    	    
	    	    
	    	   // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    	    driver.findElement(By.id("pass")).clear();
	    	    
	    	    
	    	    Thread.sleep(3000);
	    	    driver.findElement(By.id("pass")).sendKeys(password);
	    	    
	    	    driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	    	    driver.findElement(By.id("pass")).sendKeys(password);
	    	    Thread.sleep(3000);
	    	    
	    	    
	    	    
	        }
	      
	      
	 
	  

	
	 
	 
	
	 
	 

	 
	 
	  } catch (Exception e) {

	   System.out.println(e.getMessage());

	  }
	  
	 }
	 
	}