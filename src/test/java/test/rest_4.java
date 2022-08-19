package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rest_4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.facebook.com/");
	    Driver.manage().window().maximize();
	    
	    String title=Driver.getTitle();
	    System.out.println(title);
	    
	    String url=Driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement txt_email=Driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		txt_email.sendKeys("text@gmail.com");
		
		WebElement txt_pass=Driver.findElement(By.xpath("//input[@id='pass']"));
		txt_pass.sendKeys("123654");
		
		//WebElement btn=Driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		//btn.click();
		
		WebElement txt=Driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		txt.click();
		
		WebElement index=Driver.findElement(By.xpath("//input[@name='email'][1]"));
		index.sendKeys("text22@gmail.com");
		
		
		
	}

}
