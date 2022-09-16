package Practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousemovement {

	public static void main(String[] args) throws InterruptedException {

     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
     driver.manage().window().maximize();
     
     
     Actions act=new Actions(driver);
     
     WebElement sel=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
     act.moveToElement(sel).build().perform();
     act.click().build().perform();
     Thread.sleep(3000);
     
    WebElement ri8= driver.findElement(By.xpath("//span[text()='right click me']"));
     act.contextClick(ri8).build().perform();
     act.click().build().perform();
     Thread.sleep(3000);
     
    WebElement double1= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
    act.doubleClick(double1).build().perform();
    act.click().build().perform();
    Thread.sleep(3000);
   
     
     
	}

}
