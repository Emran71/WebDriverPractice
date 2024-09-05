package WebDriverDemo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkHandleFemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("http://www.deadlinkcity.com/");
	    driver.manage().window().maximize();
	    int count_broken_link = 0;
	    int count_valid_link = 0;
	    List <WebElement> UrlList = driver.findElements(By.tagName("a"));
	    System.out.println("Total URL: "+UrlList.size());
	    for(WebElement list:UrlList ) {
	    	
	    	String hreflists = list.getAttribute("href");
	    	if(hreflists == null || hreflists.isEmpty() )
	    	{
	    		System.out.println("This is not possible to count because it is empty");
	    		continue;
	    	}
	    	try{
	    	
	    		URL str_url = new URL(hreflists);
	    	
	    	   HttpURLConnection conn = (HttpURLConnection) str_url.openConnection();
	    	   conn.connect();
	    	if(conn.getResponseCode()>= 400) {
	    		System.out.println(hreflists+" Broken Link");
	    		count_broken_link++;
	    	}
	    	else {
	    		System.out.println(hreflists+" Not Broken Link");
	    		count_valid_link++;
	    	}
	    }
	    	catch(Exception e) {}
	    	
	    }
	    System.out.println("Total Broken link : "+count_broken_link );
	    System.out.println("Total Valid link : "+count_valid_link );
	    
	}

}
