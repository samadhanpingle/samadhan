package test_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test_D_5 {

	@Test
	public void A() {
		System.out.println("samy");
	
}
	@Test(dependsOnMethods="C")
	public void B() {
		System.out.println("sam");
}
	
	@Test
	public void C() {
		System.out.println("sandy");
		Assert.assertEquals(true, false);
}
}
