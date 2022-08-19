package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.instagram.com/?hl=en");
     String	title=driver.getTitle();
     driver.manage().window().maximize();
     System.out.println(title);
    String url= driver.getCurrentUrl();
    System.out.println(url);
    driver.navigate().to("https://www.facebook.com/");
    Thread.sleep(5000);
    driver.navigate().back();
    Thread.sleep(5000);
    driver.navigate().forward();
    Thread.sleep(5000);
    driver.navigate().refresh();
    
    driver.close();
	
	}

}
