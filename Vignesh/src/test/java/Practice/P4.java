package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException  
	{
	WebDriver driver =new ChromeDriver();
	Thread.sleep(2000);
	driver.get("http://www.google.com");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	System.out.println("size->"+links.size());
	for (WebElement webElement : links) 
	{
		System.out.println(webElement.getText());
	}
	
	
	
	}
}
