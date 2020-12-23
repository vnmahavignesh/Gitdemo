package mindtree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	WebDriver driver;

	static 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/NMahaVignesh/git/Gitdemo/Vignesh/driver/chromedriver.exe");
	}
	@BeforeSuite
	public void open_browser()
	{
		 driver= new ChromeDriver();
		 
		
	}
	@AfterSuite
	public void close()
	{
		driver.close();
	}
}
