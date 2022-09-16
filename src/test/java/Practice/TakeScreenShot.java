package Practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {
	
	public static void main (String[]args) throws Exception {
		
		// Browser opening 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String path="C:\\Users\\samad\\eclipse-workspace\\Batch_111_project\\ScreenShot";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File file=new File(path+"//"+" "+".png");
		FileUtils.copyFile(src, file);
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
