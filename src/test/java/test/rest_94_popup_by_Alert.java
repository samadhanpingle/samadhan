package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rest_94_popup_by_Alert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://demo.guru99.com/test/delete_customer.php");
		Driver.manage().window().maximize();
		
		WebElement id=Driver.findElement(By.xpath("//input[@name='cusid']"));
		id.sendKeys("123654");
		WebElement submit=Driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		Alert alt=Driver.switchTo().alert();
		
		String text=alt.getText();
		System.out.println(text);
		alt.accept();
		
		String text1=alt.getText();
		System.out.println(text1);
		alt.accept();
		
	}

}
