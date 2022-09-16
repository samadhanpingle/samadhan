package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/test/delete_customer.php");
    driver.manage().window().maximize();
    
    String path="C:\\Users\\samad\\eclipse-workspace\\Batch_111_project\\ScreenShot";
    
    TakesScreenshot src= (TakesScreenshot) driver;
    File fl=src.getScreenshotAs(OutputType.FILE);
    File sr=new File(path+"//"+ " "+".png");
    FileUtils.copyFile(fl, sr);
    Thread.sleep(3000);
    driver.close();
    
	}

}
