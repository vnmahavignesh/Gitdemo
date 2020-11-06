package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testngparallalbytest 
{
WebDriver driver;

	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("I am inside test1 ");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.close();
		
	}
	@Test
	public void test2() throws InterruptedException
	{
		System.out.println("I am inside test2 ");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(2000);
		driver.close();
	}
}
