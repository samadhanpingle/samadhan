package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rest_2_Navigation {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		
		String title=Driver.getTitle();
		System.out.println(title);
		
		String url=Driver.getCurrentUrl();
		System.out.println(url);
		
		Driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		Driver.navigate().back();
		Thread.sleep(2000);
		Driver.navigate().forward();
		Thread.sleep(2000);
		Driver.navigate().refresh();
		Thread.sleep(2000);
		
		Driver.close();
		
		
		
	}

}
