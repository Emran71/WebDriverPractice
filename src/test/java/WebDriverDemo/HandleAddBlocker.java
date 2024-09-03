package WebDriverDemo;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAddBlocker {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		File file =  new File("K:\\CRX file\\AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx");
		option.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://stackoverflow.com/questions/7890160/embed-website-into-my-site");
	    driver.manage().window().maximize();
	}

}
