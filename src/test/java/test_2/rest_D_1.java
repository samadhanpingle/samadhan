package test_2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rest_D_1 {

	@BeforeSuite
	public void test1() {
		System.out.println("test1");
	}
	@BeforeTest
	public void test2() {
		System.out.println("test2");
	}
	@BeforeClass
	public void test3() {
		System.out.println("test3");
	}
	@BeforeMethod
	public void test4() {
		System.out.println("test4");
	}
	@Test
	public void test_A() {
		System.out.println("i am 1st");
	}
	@Test
	public void test_B() {
		System.out.println("i am 2nd");
	}

	@Test
    public void test_C() {
		System.out.println("i am 3rd");
	}
	

  @AfterMethod
  public void test5() {
	  System.out.println("test5");
  }
  @AfterClass
  public void test6() {
	  System.out.println("test6");	  
}
  @AfterTest
  public void test7() {
	  System.out.println("test7");
}
  @AfterSuite
  public void test8() {
	  System.out.println("test8");
}
}












