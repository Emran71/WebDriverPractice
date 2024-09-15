package DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderHardcode {
	WebDriver driver;

	@BeforeClass
	void TestSetup(){

		driver = new ChromeDriver();

	}

	@Test(dataProvider="dp")
	void TestLogin(String email, String pass) throws Exception
	{
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true)
		{
			driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Logout']")).click();
			Thread.sleep(4000);
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}

	}
	@AfterClass
	void TestLogout()
	{
		driver.close();
	}
	@DataProvider(name="dp")
	Object [][] TestLoginData()
	{
		Object data [][] = {
				{"abc@gmail.com", "test123"},
				{"abc123@gmail.com", "test1234"},
				{"emran123@gmail.com", "12345678"},
				{"Admin1234", "admin1324234"}
		};
		return data;
	}
}
