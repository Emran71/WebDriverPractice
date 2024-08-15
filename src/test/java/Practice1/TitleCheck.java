package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* test case:
 1) Launch the browser.
  2)open the Url www.demo.opencart.com
  3) title should be 'Your Store'
  4)close the browser
  */

public class TitleCheck {
   public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://demo.opencart.com/");
	   String actual = driver.getTitle();
	   
	   if(actual.equals("non "))
	   {
		   System.out.println("Test passed");
	   }
	   else {
		   System.out.println("Failed");
	   }
	   driver.close();
	   
}
	
}
