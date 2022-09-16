package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alret {

	public static void main(String[] args) throws InterruptedException {

     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.guru99.com/test/delete_customer.php");
     driver.manage().window().maximize();
     
     driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Test@123");
     driver.findElement(By.xpath("//input[@name='submit']")).click();
     
     Alert alt=driver.switchTo().alert();
     Thread.sleep(2000);
     alt.accept();
     System.out.println(alt);
     
     Alert alt1=driver.switchTo().alert();
     Thread.sleep(2000);
     alt1.accept();
     System.out.println(alt1);
     
	}

}
