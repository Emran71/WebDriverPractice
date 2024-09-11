package TestNGGrouping;

import org.testng.annotations.Test;

public class TestLogging {
	@Test(priority=1,groups = {"sanity"})
	public void TestFacebookLogin()
	{
		System.out.println("Facebook Login........"); 
	}
	@Test(priority=2,dependsOnMethods= {"TestFacebookLogin"},groups = {"sanity"})
	public void TestAppleLogin()
	{
		System.out.println("Apple Login........"); 
	}
	@Test(priority=3,dependsOnMethods= {"TestAppleLogin"},groups = {"sanity"})
	public void TestTwitterLogin()
	{
		System.out.println("Twitter Login........"); 
	}
	@Test(priority=4,dependsOnMethods= {"TestTwitterLogin"},groups = {"sanity"})
	public void TestInstagramLogin()
	{
		System.out.println("Instagram Login........"); 
	}
}
