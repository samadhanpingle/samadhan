package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_3 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		
		
		//identify the WebElement---->locators--->id
		
		WebElement txt_email=Driver.findElement(By.id("email"));
		txt_email.sendKeys("test@gmail.com");
		
		WebElement txt_password=Driver.findElement(By.id("pass"));
		txt_password.sendKeys("123456");
		
		//identify WebElement-Name
		
     WebElement btn_login=Driver.findElement(By.name("login"));
     Thread.sleep(5000);
     btn_login.click();
     Thread.sleep(5000);
     String title=Driver.getTitle();
     System.out.println(title);
     Thread.sleep(5000);
   String url=Driver.getCurrentUrl();
     System.out.println(url);
     Thread.sleep(5000);
     Driver.close();     
     
     
     
		
		
	}

}
