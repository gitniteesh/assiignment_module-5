package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question_1 {

	@Test
	public void TitleCheck()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		
		String actualTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		String expectedTitle = "Facebook – log in or sign up";
		
		
		if(actualTitle.equals(expectedTitle)) 
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		assertEquals(expectedTitle, actualTitle);
    }
}
