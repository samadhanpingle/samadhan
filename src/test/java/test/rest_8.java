package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rest_8 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		
       Driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	//	Driver.get("https://www.google.co.in/");
        Driver.manage().window().maximize();
        
       // WebElement drp_selenium=Driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
       //WebElement gmail=Driver.findElement(By.xpath("//a[text()='Gmail']"));
       // WebElement Rightclick_ele=Driver.findElement(By.xpath("//span[text()='right click me']"));
        WebElement double_click=Driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions act=new Actions(Driver);
        
     //act.moveToElement(drp_selenium).click(drp_selenium).build().perform();
     //  act.moveToElement(gmail).build().perform();
      //  act.contextClick(Rightclick_ele).build().perform();
        act.doubleClick(double_click).build().perform();
	}

}
