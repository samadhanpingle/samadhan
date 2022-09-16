package Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base_Class.base_class;
import Test_Demo.LoginPom;

public class test_case_001 extends base_class {

	@Test
	public void t1() throws Exception {
   LoginPom login=PageFactory.initElements(Driver, LoginPom.class);
		login.getEmail().sendKeys("test@gmail.com");
		  Thread.sleep(3000);
		login.getPass().sendKeys("123654");
		  Thread.sleep(3000);
		login.getLogin().click();
		  Thread.sleep(3000);	
	}
	
	
}
