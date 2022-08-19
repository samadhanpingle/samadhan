package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rest_5 {

	public static void main(String[] args) throws InterruptedException {
	
		// handling auto suggetion
		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.google.com/");
		Driver.manage().window().maximize();
		
		WebElement search=Driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("maven");
		Thread.sleep(5000);
		
		List<WebElement> list=Driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	   System.out.println(list.size());
	   
	    for(int i=0;i<list.size();i++) {
		   System.out.println(list.get(i).getText());{
			   if(list.get(i).getText().equals("maven meaning")) {
				   list.get(i).click();
				   break;
			   }
			   
		   }
		   
	   }
	   
	   
		
		}
}
		
	
			


