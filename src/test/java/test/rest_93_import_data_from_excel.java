package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rest_93_import_data_from_excel {

	public static void main(String[] args) throws Exception {
		
		//Browser open
	     WebDriverManager.chromedriver().setup();
	     WebDriver Driver=new ChromeDriver();
	      Driver.get("https://www.facebook.com/");
	      Driver.manage().window().maximize();
	      
	      //identify the WebElement
	   WebElement email= Driver.findElement(By.xpath("//input[@name='email']"));
	   WebElement pass= Driver.findElement(By.xpath("//input[@name='pass']"));
		
		String path="C:\\Users\\samad\\eclipse-workspace\\Batch_111_project\\TestData\\Data.xlsx";
		FileInputStream fis=new FileInputStream (path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
      String data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
      System.out.println(data_1);
      String data_2=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
      System.out.println(data_2);
      String data_3=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
      System.out.println(data_3);
      String data_4=wb.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
      System.out.println(data_4);
      
      //provide the test data from excel to WebElement
        email.sendKeys(data_1);
        pass.sendKeys(data_2);
      
      //for numeric value
      double data_5=wb.getSheet("Sheet1").getRow(0).getCell(4).getNumericCellValue();//123654
      System.out.println(data_5);  //123654.0
      
      //for send data to pass in String
      String data_5_s=String.valueOf(data_5);
      String Data=data_5_s.replace(".0", "");
      System.out.println(Data);
      
      pass.sendKeys(Data);
      
      
      
      
	}

}
