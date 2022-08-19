package test_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_B_2 {
	WebDriver Driver;
	@Parameters({"Browser"})
	@BeforeMethod
	public void bm(String Browser) {
		if(Browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		 Driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			 Driver=new EdgeDriver();
		}
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
	}
	@AfterMethod
	public void syso() {
		Driver.close();

	}
	

}
