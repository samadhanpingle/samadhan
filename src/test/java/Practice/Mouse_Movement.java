package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Movement {

	public static void main(String[] args) throws Exception {
		
    //Browser opning
   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
   driver.get("https://demo.guru99.com/test/simple_context_menu.html");
   driver.manage().window().maximize();
   
   //object Action Class
   Actions act=new Actions(driver);
   
   // click to element
  WebElement sel= driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
   act.moveToElement(sel).build().perform();
   act.click(sel).build().perform();
   Thread.sleep(3000);
   //right click on element
  WebElement ri8= driver.findElement(By.xpath("//span[text()='right click me']"));
   act.contextClick(ri8).build().perform();
   act.click(ri8).build().perform();
   Thread.sleep(3000);
   //double click on element
  WebElement DClick= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
   act.doubleClick(DClick).build().perform();
   act.click(DClick).build().perform();
   
   
   
	}

}
