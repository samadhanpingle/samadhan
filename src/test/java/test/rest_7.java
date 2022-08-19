package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rest_7 {
	public static void dropdown(String text, WebElement element) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		
	Driver.get("https://demo.guru99.com/test/newtours/register.php");
	Driver.manage().window().maximize();
	
	WebElement drp=Driver.findElement(By.xpath("//select[@name='country']"));
	dropdown("INDIA",drp);
	
	}

}
