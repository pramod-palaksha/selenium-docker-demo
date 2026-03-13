import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test1 {
	
	@Test
	public void testgoogle() throws MalformedURLException
	{
		//WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();

		WebDriver driver =
				 new RemoteWebDriver(
				   new URL("http://selenium-hub:4444"),
				   options
				 );

		driver.get("https://google.com");

		System.out.println(driver.getTitle());
		System.out.println("Hi");
		System.out.println("ram");

		driver.quit();
	}
	

}
