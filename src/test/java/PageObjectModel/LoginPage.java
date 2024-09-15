package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
   public LoginPage(WebDriver driver) {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath = "//input[@placeholder='Username']") WebElement txt_username;
   
   @FindBy(xpath = "//input[@placeholder='Password']") WebElement txt_password;
   
   @FindBy(xpath = "//button[@type='submit']") WebElement txt_login;
   
   public void setUsername(String user) 
   {
	   txt_username.sendKeys(user);
   }
   
   public void setUserPassword(String pass) 
   {
	   txt_password.sendKeys(pass); 
   }
   
   public void setUserLogin() 
   {
	   txt_login.click(); 
   }
   
   
}
