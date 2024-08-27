package WebDriverDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAcionDemo {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://demo.opencart.com/");
    driver.manage().window().maximize();
    WebElement components = driver.findElement(By.xpath("//a[normalize-space()='Components']"));
    WebElement monitor = driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']"));
    
    Actions act = new Actions(driver);
    act.moveToElement(components).moveToElement(monitor).click().build().perform();
}
}
