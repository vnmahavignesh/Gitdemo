package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("ibm");
		Thread.sleep(2000);
		List<WebElement> qsp = driver.findElements(By.xpath("//span[contains(text(),'ibm')]"));
		System.out.println(qsp.size());
		for (WebElement webElement : qsp) {
			System.out.println(webElement.getText());
		}
Thread.sleep(2000);
driver.close();
	}

}
