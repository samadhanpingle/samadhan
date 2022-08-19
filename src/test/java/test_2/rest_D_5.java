package test_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class rest_D_5 {
	@Test(invocationCount=2)
	public void test_A() {
		System.out.println("i am 1st");
	}
	@Test(dependsOnMethods="test_C")
	public void test_B() {
		System.out.println("i am 2nd");
	}

	@Test()
    public void test_C() {
		System.out.println("i am 3rd");	
 }
	}

