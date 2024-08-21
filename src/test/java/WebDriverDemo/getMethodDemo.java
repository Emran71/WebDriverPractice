package WebDriverDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethodDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);

		/*
		 * String title= driver.getTitle();
		 * System.out.println(title);
		 * 
		 * String url = driver.getCurrentUrl(); 
		 * System.out.println(url);
		 */
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> ids = driver.getWindowHandles();
		for(Object i: ids) {
			System.out.println(i);
		}
		/*
		 * List<String> list = new ArrayList(ids); for(String i: list) {
		 * System.out.println(i); }
		 */

		//driver.close();
	}
}
