package WebDriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.demoblaze.com/");
		driver.navigate().to("https://www.daraz.com.bd/");
		driver.navigate().back();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
