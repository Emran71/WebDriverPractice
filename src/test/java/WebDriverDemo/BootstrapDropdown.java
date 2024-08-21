package WebDriverDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(@class,\"multiselect\")]")).click();
        
        //select single option
        //driver.findElement(By.xpath("//input[@value='csharp']")).click();
        
        //select multiple option
        List <WebElement> options =driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        for(WebElement op: options) {
        	
        	//for all select
			/*
			 * if(!op.isSelected()) { op.click(); }
			 */
        	
        	String opt = op.getText();
        	if(opt.equals("Java")|| opt.equals("Python")|| opt.equals("Oracle")) {
        		op.click();
        	}
        }
        

	}

}
