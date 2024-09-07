package TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;

/*open the app
 * login
icon check
logout*/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTestcase {

	WebDriver driver;
	@Test(priority = 0)
	void openapp() 
	{   
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}
	@Test(priority = 1)
	void checkIcon() throws InterruptedException 
	{   Thread.sleep(4000);
		boolean icon = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("The is is visible---"+icon);
	}

	@Test(priority = 2)
	void login() 
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");	
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority = 3)
	void close()
	{
      driver.quit();
	}
}
