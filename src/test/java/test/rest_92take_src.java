package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class rest_92take_src {

	public static void main(String[] args) throws Exception {
		
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
		
		String path="C:\\Users\\samad\\eclipse-workspace\\Batch_111_project\\scr";
		
		String rm=RandomString.make(3);  //abc ,bcd
		TakesScreenshot ts=(TakesScreenshot) Driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File desnt=new File(path+"\\"+rm+".png");
		FileUtils.copyFile(src, desnt);
		
		
		

	}

}
