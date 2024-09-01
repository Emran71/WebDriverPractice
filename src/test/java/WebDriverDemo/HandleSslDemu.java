package WebDriverDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSslDemu {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://expired.badssl.com/");
	    driver.manage().window().maximize();

	}

}
