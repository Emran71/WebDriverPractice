package WebDriverDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement countrys = driver.findElement(By.xpath("//select[@id='country']"));
        Select count_list = new Select(countrys);
        
        //Select a element from multiple d
        count_list.selectByValue("uk");
        
        //Show all the list
        List<WebElement> list = count_list.getOptions();
        for(WebElement total_list:list) {
        	System.out.println(total_list.getText());
        }

	}

}
