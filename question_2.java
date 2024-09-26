package testNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class question_2 {
	
	@Test
	public void fbtitle()
	{
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		
		String Actualtitle = driver.getTitle();
		String expectedtitle = "fb";
		
		if(Actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		assertEquals(expectedtitle, Actualtitle);
		
	}


}
