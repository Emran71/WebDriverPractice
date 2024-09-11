package TestNGGrouping;

import org.testng.annotations.Test;

public class TestSignup {
	@Test(priority=1,groups = {"sanity","regression"})
	public void TestFacebookSignup()
	{
		System.out.println("Facebook Signup........"); 
	}
    
	@Test(priority=2,dependsOnMethods= {"TestFacebookSignup"},groups = {"sanity"})
	public void TestAppleSignup()
	{
		System.out.println("Apple Signup........"); 
	}
    
	@Test(priority=3,dependsOnMethods= {"TestFacebookSignup"},groups = {"sanity","regression"})
	public void TestTwitterSignup()
	{
		System.out.println("Twitter Signup........"); 
	}
}
