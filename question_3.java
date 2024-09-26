package simple;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class question_3 {
	
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.driver.ChromeDriver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.name("email")).sendKeys("8000806020");
		driver.findElement(By.name("pass")).sendKeys("Nitesh#77");
		driver.findElement(By.name("login")).click();
		
		/*
		String mainTab = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> winds = driver.getWindowHandles();
		for(String wins:winds)
		{
			if(wins.equals(mainTab))
			{
				driver.switchTo().window(wins);
			}
		}
		
		
		Alert alert = driver.switchTo().alert();
		System.err.println(alert.getText());
		alert.accept();
		
		
		//driver.findElement(By.xpath("//*[name()='g' and contains(@mask,'url(#:R3ar')]//*[name()='image' and contains(@x,'0')]")).click();
		*/
	}

}
