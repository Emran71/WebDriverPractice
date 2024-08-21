package WebDriverDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
		/*
		 * driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
		 * Thread.sleep(4000);
		 */
       
        //normal accept alert
       // driver.switchTo().alert().accept();
        
        // If we want to store Text
		/*
		 * Alert al = driver.switchTo().alert(); System.out.println(al.getText());
		 * al.accept();
		 */
        
        // Confirmation alert OK or cancel button
        
        //driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();
        
        //Promt alert
        driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
        Thread.sleep(4000);
        Alert al = driver.switchTo().alert();
        al.sendKeys("Emran");
        al.accept();
        
        
        
        
	}

}
