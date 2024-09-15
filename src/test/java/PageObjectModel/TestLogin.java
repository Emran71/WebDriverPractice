package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLogin {
	WebDriver driver;
	
	@BeforeClass 
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test
	public void LoginTest()
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("Admin");
		lp.setUserPassword("admin123");
		lp.setUserLogin();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@AfterClass
	public void closeTest()
	{
		driver.quit();
	}

}
