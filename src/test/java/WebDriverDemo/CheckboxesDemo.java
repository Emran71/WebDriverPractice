package WebDriverDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        List<WebElement> lists = driver.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"));
		
        // All select
        /*
		 * for(WebElement i:lists) { i.click(); }
		 */
        
        //random select here select last 4
        for(int i=0; i<3; i++)
        {
        	lists.get(i).click();
        }
        Thread.sleep(5000);
        for(int i=0; i<3; i++)
        {  
        	if(lists.get(i).isSelected())
        	{
        		lists.get(i).click();	
        	}
        	
        }
	}

}
