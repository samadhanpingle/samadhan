package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rest_9_by_method {
	
public static void costomHandleDragANDDrop(WebDriver Driver,WebElement drg,WebElement drp) {
	Actions act=new Actions(Driver);
	act.dragAndDrop(drg, drp).build().perform();
}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://demo.guru99.com/test/drag_drop.html");
		Driver.manage().window().maximize();
		
		
		WebElement drg=Driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement drp=Driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
        
		
	}

}
