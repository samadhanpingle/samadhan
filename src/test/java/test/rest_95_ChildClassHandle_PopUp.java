package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rest_95_ChildClassHandle_PopUp {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://demo.guru99.com/popup.php");
		Driver.manage().window().maximize();
		
		
		Driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		// to find adresses
		String parentAdress=Driver.getWindowHandle();
		System.out.println( parentAdress);
		
		
		Set<String> allAdress=Driver.getWindowHandles();
		System.out.println(allAdress);
		
		Iterator<String> it=allAdress.iterator();
		
		while(it.hasNext()) {
			String childwindowAdress=it.next();
			
			if(!parentAdress.equals(childwindowAdress)) {
				Driver.switchTo().window(childwindowAdress);
				
				//find xpath of webElement present on child window
			WebElement email=Driver.findElement(By.xpath("//input[@name='emailid']"));
		    email.sendKeys("test@gmail.com");
			Thread.sleep(3000);
				
				//find xpath of submit WebElement present on child window
		    WebElement sub=Driver.findElement(By.xpath("//input[@name='btnLogin']"));
				sub.click();
				Thread.sleep(3000);
				
				Driver.close();
				
				
			}
		
		}
		Driver.switchTo().window(parentAdress);
		Thread.sleep(5000);
		Driver.close();
		
	
		
		
	}

}
