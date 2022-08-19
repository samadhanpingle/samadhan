package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rest_91_keyboard_handling {

	public static void main(String[] args) throws Exception {

		   WebDriverManager.chromedriver().setup();
		   WebDriver Driver=new ChromeDriver();
		   Driver.get("https://www.facebook.com/");
		   Driver.manage().window().maximize();
		   
		   Actions act=new Actions(Driver);

		   WebElement email=Driver.findElement(By.xpath("//input[@id='email']"));
		   act.keyDown(email, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
		   
		   act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		   Thread.sleep(3000);
		   act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		   Thread.sleep(3000);
		   WebElement pass=Driver.findElement(By.xpath("//input[@id='pass']"));
		   Thread.sleep(3000);
		   //pass.click();
		   
		   act.keyDown(pass, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		   Thread.sleep(3000);
		   Driver.close();
	}

}
