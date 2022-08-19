package test_3;

import org.testng.annotations.Test;

public class test_B_1 extends test_B_2{
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
}
