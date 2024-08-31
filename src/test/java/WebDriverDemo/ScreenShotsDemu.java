package WebDriverDemo;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotsDemu {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    WebElement formElement = driver.findElement(By.xpath("//div[@class='column-center-outer']"));
	    File sourcefile = formElement.getScreenshotAs(OutputType.FILE);
	    File targetfile = new File(System.getProperty("user.dir")+ "\\screenshots\\test.png");
	    sourcefile.renameTo(targetfile);
	    driver.quit();
	    
	}

}
