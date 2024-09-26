package module_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public static WebDriver driver;
	
	public WebDriver util() throws IOException
	{
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\framework\\src\\test\\resources\\question.data");
			Properties prop = new Properties();
			prop.load(fis);
			
			String browser = prop.getProperty("browser");
			String url = prop.getProperty("url");
			
			if(browser.equals("chrome"))
			{
				driver = new ChromeDriver();
			}
			else if(browser.equals("ff"))
			{
				driver = new ChromeDriver();
			}
			driver.get(url);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

}
