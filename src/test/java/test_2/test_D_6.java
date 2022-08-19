package test_2;

import org.testng.annotations.Test;

public class test_D_6 {

	@Test(groups="sanity")
	public void A() {
		System.out.println("i am A");
	}
	@Test (groups="Regression")
	public void B() {
		System.out.println("i am B");
	}
	@Test(groups="critical Regression")
	public void C() {
		System.out.println("iam C");
	
	}
	}

