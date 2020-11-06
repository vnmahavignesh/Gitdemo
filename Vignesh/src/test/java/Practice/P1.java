package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class P1 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	WebDriver driver;
	@Parameters({"browser","un"})
	@Test
	public void start(String browser,String un)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.get("http://www.google.com");
			try {Thread.sleep(2000);}
			catch (InterruptedException e) {e.printStackTrace();}
			System.out.println("Chrome");
			driver.close();
		}
		else
		{
			driver=new FirefoxDriver();
			driver.get("http://www.google.com");
			try {Thread.sleep(2000);}
			catch (InterruptedException e) {e.printStackTrace();}
			System.out.println("FireFox");
			driver.close();
			
		}
	}

}
