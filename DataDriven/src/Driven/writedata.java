package Driven;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
			  // Specify the path of file
			  File src=new File("https://docs.google.com/spreadsheets/d/16MYL62yhbQ9i60MSKFfR52mVhcHKs85w9ovFQ-G8wSA/edit#gid=0");

			   
			   FileInputStream fis=new FileInputStream(src);
			 
			   // Load workbook
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			   
			   // Load sheet- Here we are loading first sheet only
			   //Nick Koirala
			      XSSFSheet sheet1= wb.getSheetAt(0);
			     
			      sheet1.getRow(1).createCell(1).setCellValue("pass");
			      sheet1.getRow(2).createCell(1).setCellValue("fail");
			      sheet1.getRow(3).createCell(1).setCellValue("5");
			      sheet1.getRow(4).createCell(1).setCellValue("6");
			      sheet1.getRow(5).createCell(1).setCellValue("3");

			     FileOutputStream fout=new FileOutputStream(src);
			      
			      wb.write(fout);
			      
			      //Nick M
			      
			      XSSFSheet sheet2= wb.getSheetAt(1);
				     
			      sheet2.getRow(1).createCell(1).setCellValue("10");
			      sheet2.getRow(2).createCell(1).setCellValue("5");
			      sheet2.getRow(3).createCell(1).setCellValue("6");
			      sheet2.getRow(4).createCell(1).setCellValue("7");
			      sheet2.getRow(5).createCell(1).setCellValue("8");
			      sheet2.getRow(6).createCell(1).setCellValue("1");
			      sheet2.getRow(7).createCell(1).setCellValue("3");
			      sheet2.getRow(8).createCell(1).setCellValue("7");
			      sheet2.getRow(9).createCell(1).setCellValue("2");
			      sheet2.getRow(10).createCell(1).setCellValue("9");

			     FileOutputStream fouter=new FileOutputStream(src);
			      
			      wb.write(fouter);
			      
			      //joy Report
			      
			      XSSFSheet sheet3= wb.getSheetAt(2);
				     
			      sheet3.getRow(1).createCell(1).setCellValue("poriruaunionhealth last 22 march past 5pm");
			      sheet3.getRow(3).createCell(1).setCellValue("prometheus.littlemonkey.co.nz");
			      sheet3.getRow(6).createCell(1).setCellValue("hosting 1");
			      sheet3.getRow(10).createCell(1).setCellValue("hosting 1-10");
			      

			     FileOutputStream joy=new FileOutputStream(src);
			      
			      wb.write(joy);
			      
 //Darlene Report
			      
			      XSSFSheet sheet4= wb.getSheetAt(3);
				     
			      sheet4.getRow(5).createCell(1).setCellValue("$8360.50");
			      sheet4.getRow(5).createCell(2).setCellValue("367.20%");
			      sheet4.getRow(7).createCell(1).setCellValue("$28,929.28");
			      
			      FileOutputStream darlene=new FileOutputStream(src);
			      
			      wb.write(darlene);
//Sunaina Report
 
			      
			      XSSFSheet sheet5= wb.getSheetAt(4);
				     
			      sheet5.getRow(1).createCell(1).setCellValue("10");
			      sheet5.getRow(1).createCell(2).setCellValue("Pass");
			      sheet5.getRow(1).createCell(3).setCellValue("2.5");
			      sheet5.getRow(1).createCell(4).setCellValue("gjhsdjfdsfhsd,2. dcsdsdfdf.3 sdfsdff");
			      
			      
			      sheet5.getRow(2).createCell(1).setCellValue("5");
			      sheet5.getRow(2).createCell(2).setCellValue("fail");
			      sheet5.getRow(2).createCell(3).setCellValue("3");
			      sheet5.getRow(2).createCell(4).setCellValue("gjhsdjfdsfhsd,2. dcsdsdfdf.3 sdfsdff");
			      
			      sheet5.getRow(3).createCell(1).setCellValue("10");
			      sheet5.getRow(3).createCell(2).setCellValue("Pass");
			      sheet5.getRow(3).createCell(3).setCellValue("6.5");
			      sheet5.getRow(3).createCell(4).setCellValue("gjhsdjfdsfhsd,2. dcsdsdfdf.3 sdfsdff");
			      
			      
			      
			      
			     
			     sheet5.getRow(4).createCell(1).setCellValue("7");
			     sheet5.getRow(4).createCell(2).setCellValue("fail");
			      sheet5.getRow(4).createCell(3).setCellValue("3");
			      sheet5.getRow(4).createCell(4).setCellValue("gjhsdjfdsfhsd,2. dcsdsdfdf.3 sdfsdff");
			     
			     
			     
			     
			      sheet5.getRow(5).createCell(1).setCellValue("8");
			      sheet5.getRow(5).createCell(2).setCellValue("Pass");
			      sheet5.getRow(5).createCell(3).setCellValue("3.5");
			      sheet5.getRow(5).createCell(4).setCellValue("gjhsdjfdsfhsd,2. dcsdsdfdf.3 sdfsdff");
			      
			      
			      
			      
			      sheet5.getRow(6).createCell(1).setCellValue("1");
			      sheet5.getRow(6).createCell(2).setCellValue("fail");
			      sheet5.getRow(6).createCell(3).setCellValue("3");
			      sheet5.getRow(6).createCell(4).setCellValue("gjhsdjfdsfhsd,2. dcsdsdfdf.3 sdfsdff");
			      
			      
			      
			      sheet5.getRow(7).createCell(1).setCellValue("3");
			      sheet5.getRow(7).createCell(2).setCellValue("fail");
			      sheet5.getRow(7).createCell(3).setCellValue("3");
			      sheet5.getRow(7).createCell(4).setCellValue("gjhsdjfdsfhsd,2. dcsdsdfdf.3 sdfsdff");
			      
			      
			      
			      
			      sheet5.getRow(8).createCell(1).setCellValue("7");
			      sheet5.getRow(8).createCell(2).setCellValue("Pass");
			      sheet5.getRow(8).createCell(3).setCellValue("2");
			      sheet5.getRow(8).createCell(4).setCellValue("gjhsdjfdsfhsd,2. dcsdsdfdf.3 sdfsdff");
			      
			      
			      sheet5.getRow(9).createCell(1).setCellValue("2");
			      sheet5.getRow(9).createCell(2).setCellValue("fail");
			      sheet5.getRow(9).createCell(3).setCellValue("3");
			      sheet5.getRow(9).createCell(4).setCellValue("gjhsdjfdsfhsd,2. dcsdsdfdf.3 sdfsdff");
			     FileOutputStream Naina=new FileOutputStream(src);
			      
			      wb.write(Naina);
			      
			      
			      
			      
			      
			      
			      
			     wb.close();

		}
	}
	
	