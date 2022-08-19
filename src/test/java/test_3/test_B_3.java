package test_3;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_B_3 {
	
	@Test
	public void dn() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor) Driver;
		js.executeScript("window.scrollBy(0,500)","");
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)","");
		
		Thread.sleep(3000);
		
		WebElement marathi=Driver.findElement(By.xpath("//a[text()='मराठी']"));
		js.executeScript("arguments[0].scrollIntoView()", marathi);
		
		
		
		
		

	}
	}
		
		