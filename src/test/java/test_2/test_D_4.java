package test_2;

import org.testng.annotations.Test;

public class test_D_4 {

	
	@Test(priority=1)
	public void A() {
		System.out.println("sam");
	}
     
	@Test(priority=2)
	public void B() {
		System.out.println("samy");
	
}
	
	@Test(priority=0)
	public void C() {
		System.out.println("sandy");
	}
	
	@Test(enabled=false)
	public void D() {
		System.out.println("sama");
}
	
	@Test(invocationCount=2)
	public void E() {
		System.out.println("samadhan");
		
}
	}
