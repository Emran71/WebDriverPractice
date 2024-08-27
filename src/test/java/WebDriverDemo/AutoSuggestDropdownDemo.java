package WebDriverDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://bjs.ojp.gov/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//div[@id='prefix-overlay-header']//button")).click();
        driver.findElement(By.xpath("//input[@id='gsc-i-id1']")).sendKeys("home");
        Thread.sleep(5000);
        List <WebElement> options = driver.findElements(By.xpath("//table[@role='presentation']//span"));
        for(WebElement op : options)
        {   if(op.getText().equals("homeless offenders"))
        	{op.click();}
        }
	}

}
