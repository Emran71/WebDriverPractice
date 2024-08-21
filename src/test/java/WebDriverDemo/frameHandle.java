package WebDriverDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        //Frame handle by name
        driver.switchTo().frame("frame-one796456169");
        driver.findElement(By.xpath("//input[@id='RESULT_TextField-0']")).sendKeys("Emran");
	}

}
