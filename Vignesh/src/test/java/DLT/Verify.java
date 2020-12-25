package DLT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify {

//	static
//	{
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//	}
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://thedemosite.co.uk/login.php");
		driver.findElement(By.name("username")).sendKeys("vignesh");		
		driver.findElement(By.name("password")).sendKeys("vignesh");
		driver.findElement(By.xpath("//input[@value='Test Login']")).click();
		Thread.sleep(2000);
		try {
		String err_msg = driver.findElement(By.xpath("//b[contains(text(),'**Failed Login**')]")).getText();
		
		Assert.assertEquals(err_msg.trim(), "**Failed Login**");
		System.out.println("Error message -> "+err_msg );
		
		}
		catch(Exception e)
		{
			System.out.println("Failed log in message not dispalyed");
		}
		driver.close();
		
		
	}

}
