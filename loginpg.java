package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpg {
	
	WebDriver driver;

	public loginpg(WebDriver driver) {
		this.driver = driver;
	}
	
	By lgn = By.xpath("//i[@class='fa fa-imh-user']");
	By username = By.name("username");
	By password = By.name("password");
	//By iframe = By.name("a-egfuaq4n7fu2");
	//By captcha = By.id("//span[@id='recaptcha-anchor']");
	//By login = By.id("login-submit");
	
	public void lgn()
	{
		driver.findElement(lgn).click();
	}
	
	public void enterusername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterpassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	
}
