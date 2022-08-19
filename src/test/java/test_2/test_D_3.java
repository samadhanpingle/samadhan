package test_2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class test_D_3 extends test_D_2{
	
   // no of test script excuted under a single class by using testNG
	
	@Test
	
	public void loginTest() {
		
		Driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test@12345");
		Driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123654");
		Driver.findElement(By.xpath("//button[@name='login']")).click();
		
		}
	
	@Test
	public void CreateNewTest() {
		Driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
	}
	
	
}
