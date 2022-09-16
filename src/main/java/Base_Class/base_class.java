package Base_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class {
	public static WebDriver Driver;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tear_down() {
		Driver.close();
	}
	
}
