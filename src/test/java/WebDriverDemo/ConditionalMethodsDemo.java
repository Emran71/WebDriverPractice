package WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(4000);
		boolean status = driver.findElement(By.xpath("//input[@id='gender-male']")).isEnabled();
		boolean status1 = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		boolean status2 = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status);
		System.out.println(status1);
		System.out.println(status2);
		

	}

}
