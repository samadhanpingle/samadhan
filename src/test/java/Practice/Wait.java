package Practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait {

	public static void main(String[] args) {
		//Waits
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//Here we used Implicitly wait
    	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("Mobiles");
		
		List<WebElement> l=driver.findElements(By.xpath("(//ul[@class='G43f7e']/li)"));
		System.out.println(l.size());        //10
	
		//Here we used Explicitly wait
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(search));
	
		
		
		
		
	}

}
