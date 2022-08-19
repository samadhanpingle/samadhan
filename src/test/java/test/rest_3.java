package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rest_3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.facebook.com/");
	    Driver.manage().window().maximize();
	    
	    String title=Driver.getTitle();
	    System.out.println(title);
	    
	    String url=Driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement txt_email=Driver.findElement(By.id("email"));
		txt_email.sendKeys("text@gmail.com");
		
		WebElement txt_password=Driver.findElement(By.id("pass"));
		txt_password.sendKeys("123654");
		
		WebElement btn=Driver.findElement(By.name("login"));
		btn.click();
		
		

	}

}
