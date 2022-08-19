package test_2;

import org.testng.annotations.Test;

public class rest_D_4 {
	@Test(priority=3)
	public void test_A() {
		System.out.println("i am 1st");
	}
	@Test(enabled=false)
	public void test_B() {
		System.out.println("i am 2nd");
	}

	@Test(priority=3)
    public void test_C() {
		System.out.println("i am 3rd");
	}
}
