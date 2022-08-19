package test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class rest_D_3 extends rest_D_2 {

	@Test
	public void test_A() {
		Driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@123")	;	
		Driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("112364");
		Driver.findElement(By.xpath("//button[@name=\'login\']")).click();
	}
	
	//@Test
	public void test_B() {
		Driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("112364");
	}

	//@Test
    public void test_C() {
	Driver.findElement(By.xpath("//button[@name=\'login\']")).click();
	}
}
