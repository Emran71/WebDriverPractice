package TestNGGrouping;

import org.testng.annotations.Test;

public class TestPayment {
	
	@Test(priority=1,groups = {"sanity","regression"})
	public void TestPAymentDollers()
	{
		System.out.println("Doller Payment Test........"); 
	}
   
	@Test(priority=1,dependsOnMethods= {"TestPAymentDollers"},groups = {"regression"})
	public void TestPAymentTaka()
	{
		System.out.println("Taka Payment Test........"); 
	}
}
