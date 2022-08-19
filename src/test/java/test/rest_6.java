package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rest_6 {

	public static void main(String[] args) {
		
		// Handling DropDown

		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();
		
	Driver.get("https://demo.guru99.com/test/newtours/register.php");
	Driver.manage().window().maximize();
	
	WebElement drp=Driver.findElement(By.xpath("//select[@name='country']"));
	Select sel=new Select(drp);
	System.out.println(sel.getFirstSelectedOption().getText());
	
	// select by using index
	//sel.selectByIndex(10);
	
	// select by value
	//sel.selectByValue("ALGERIA");
	
	//select by using the text
	//sel.selectByVisibleText("ANGOLA");
	
	//select by size
	//List<WebElement> list=sel.getOptions();
	//System.out.println(list.size());
	
	//for(int i=0;i<list.size();i++) {
		//System.out.println(list.get(i).getText());
		//if(list.get(i).getText().equals("BARBADOS")) {
			//break;
			
			
		}
	
	
	}


