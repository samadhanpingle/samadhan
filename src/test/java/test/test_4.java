package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_4 {

	public static void main(String[] args) {
		// xpath------>locators
		// Absolute xpath
		// navogation parent to immidate child 
		//single slash(/)
		// use avoid
		WebDriverManager.chromedriver().setup();
	   WebDriver Driver=new ChromeDriver();
	
	   Driver.get("https://www.facebook.com/");
	   Driver.manage().window().maximize();
	   
	   //absulute xpath
	  WebElement Login_id=Driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
	   
	  // Login_id.sendKeys("samadhan");
	   
	   //relative xpath
	  //navigation parent to any child
      // double slash(//)
	   
	   // 1.xpath by attribute
	   //tagname"[@atribute name='atribute value']"
	   WebElement email=Driver.findElement(By.xpath("//input[@name='email']"));
	   email.sendKeys("sam@gmail.com");
	   
	   WebElement pass=Driver.findElement(By.xpath("//input[@id='pass']"));
	   pass.sendKeys("12345");
	   
	   // 2.xpath by text:>  text  <
	  // tagname[text()='text']
	   WebElement text=Driver.findElement(By.xpath("// a[text()='Forgotten password?']"));
	  // text.click();
	   
	   // 3.xpath by contains 
	   // tagname"[contains(@'atributeName,atribute value')]"
	   WebElement login=Driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
	   login.click();
	   //4.xpath by index
	   // 
	   
	   
	   
	}

}
