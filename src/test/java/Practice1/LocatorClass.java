package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClass {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoblaze.com/index.html");
		 driver.manage().window().maximize();
		//boolean logos = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logos);
		// driver.findElement(By.linkText("Software")).click();
		 
		 // total List
		//List<WebElement> linkname=driver.findElements(By.className("list-inline-item"));
		//System.out.println("Total link: "+ linkname.size());
		 
		 // Total images in the webpage
		 //List<WebElement> linkname=driver.findElements(By.tagName("img"));
		// System.out.println("Total Images: "+ linkname.size());
		 
		 driver.findElement(By.cssSelector("#login2")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.cssSelector("div[id='logInModal'] div[class='modal-footer'] button:nth-child(1)")).click();
		 
		 
		// driver.close();
		   

	}

}
