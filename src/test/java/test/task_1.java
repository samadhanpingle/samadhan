package test;

import static org.testng.Assert.expectThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class task_1 {

	public static void main(String[] args) throws Exception {
    //open browser
    WebDriverManager.chromedriver().setup();
    WebDriver Driver=new ChromeDriver();
    Driver.get("https://demo.guru99.com/test/newtours/register.php");
    Driver.manage().window().maximize();
    
    //find xpath of WebElement 
     WebElement f_name=Driver.findElement(By.xpath("//input[@name='firstName']"));
     WebElement l_name=Driver.findElement(By.xpath("//input[@name='lastName']"));
     WebElement m_number=Driver.findElement(By.xpath("//input[@name='phone']"));
     WebElement email=Driver.findElement(By.xpath("//input[@name='userName']"));
     WebElement adress =Driver.findElement(By.xpath("//input[@name='address1']"));
     WebElement city=Driver.findElement(By.xpath("//input[@name='city']"));
     WebElement state=Driver.findElement(By.xpath("//input[@name='state']"));
     WebElement code=Driver.findElement(By.xpath("//input[@name='postalCode']"));
     
     WebElement u_id=Driver.findElement(By.xpath("//input[@name='email']"));
     WebElement pass=Driver.findElement(By.xpath("//input[@name='password']"));
     WebElement c_pass=Driver.findElement(By.xpath("//input[@name='confirmPassword']"));
    
     //fetch data from excell
     String path="C:\\Users\\samad\\eclipse-workspace\\Batch_111_project\\guru\\reg.xlsx";
     FileInputStream file=new FileInputStream(path);
     XSSFWorkbook wb=new XSSFWorkbook(file);
     
   String sam=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
    System.out.println(sam);
   f_name.sendKeys(sam);
   String sam1= wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
   System.out.println(sam1);
   l_name.sendKeys(sam1);
   String sam3=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
   System.out.println(sam3);
   m_number.sendKeys(sam3);
   String sam4=wb.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
   System.out.println(sam4);
   email.sendKeys(sam4);
   String sam5=wb.getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
   System.out.println(sam5);
   adress.sendKeys(sam5);
   String sam6=wb.getSheet("Sheet1").getRow(0).getCell(5).getStringCellValue();
   System.out.println(sam6);
   city.sendKeys(sam6);
   String sam7=wb.getSheet("Sheet1").getRow(0).getCell(6).getStringCellValue();
   System.out.println(sam7);
   state.sendKeys(sam7);
   String sam8=wb.getSheet("Sheet1").getRow(0).getCell(7).getStringCellValue();
   System.out.println(sam8);
   code.sendKeys(sam8);
   
 //DropDown handling  
   WebElement country=Driver.findElement(By.xpath("//select[@name='country']"));
   Select slt=new Select(country);
   slt.selectByIndex(107);
   
   
   String sam9=wb.getSheet("Sheet1").getRow(0).getCell(8).getStringCellValue();
   System.out.println(sam9);
   u_id.sendKeys(sam9);
   String sam10=wb.getSheet("Sheet1").getRow(0).getCell(9).getStringCellValue();
   System.out.println(sam10);
   pass.sendKeys(sam10);
   String sam11=wb.getSheet("Sheet1").getRow(0).getCell(10).getStringCellValue();
   System.out.println(sam11);
   c_pass.sendKeys(sam11);
   WebElement sub=Driver.findElement(By.xpath("//input[@name='submit']"));
   sub.click();  
   
   Thread.sleep(3000);
   
   // select path taking screenshot
   String path1="C:\\Users\\samad\\eclipse-workspace\\Batch_111_project\\ScreenShot";
  
   //use random String method
   String rm=RandomString.make(3);
   
   TakesScreenshot ts=(TakesScreenshot) Driver;
  File st=ts.getScreenshotAs(OutputType.FILE);
   File fl=new File(path1+"\\"+rm+".png");
   FileUtils.copyFile(st, fl);
   
   //path find sigh in tab
   Thread.sleep(3000);
 // WebElement sign_In=Driver.findElement(By.xpath("//a[@href='login.php']"));
 // sign_In.click();
   
   Driver.get("https://demo.guru99.com/test/newtours/login.php");
  
  //find WebElement for log in
  WebElement user_id=Driver.findElement(By.xpath("//input[@name='userName']"));
  user_id.click();
  user_id.sendKeys("test@gmail.com");
 WebElement pass1=Driver.findElement(By.xpath("//input[@name='password']"));
 pass1.click();
 pass1.sendKeys("431499");
 WebElement sub1=Driver.findElement(By.xpath("//input[@type='submit']"));
 sub1.click();
 
 // take again screenshot
 Thread.sleep(3000);
 String path2="C:\\\\Users\\\\samad\\\\eclipse-workspace\\\\Batch_111_project\\\\ScreenShot";
 String rm1=RandomString.make(3);
 
 TakesScreenshot ts1= (TakesScreenshot) Driver;
 File sl=ts1.getScreenshotAs(OutputType.FILE);
 File st1=new File(path2+"\\"+rm1+".png");
 FileUtils.copyFile(sl, st1);
 
 
  
  
  
  
  
  
  
   
	}
}
