package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

/*Please run in testNgparallelmethods.xml*/
public class Testngparallalbymethods {
	WebDriver driver;

	
	@Parameters("browser")
	@BeforeTest
	public void platforms(String browser)
	{
		System.out.println("Browser Name : "+browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}
	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("I am inside test1 ");
		driver.get("http://www.google.com");
		Thread.sleep(2000);
//		driver.close();
		
	}
	@Test
	public void test2() throws InterruptedException
	{
		System.out.println("I am inside test2 ");
		driver.get("http://www.linkedin.com/in/sarbjeet-sidhu-b550a2125/");
		Thread.sleep(2000);
//		driver.close();
	}
}
