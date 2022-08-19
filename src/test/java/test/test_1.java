package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();	
		Driver.manage().window().minimize();
		Driver.close();
		}

}
