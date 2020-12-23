package mindtree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExecutionClass extends BaseTest 
{
	
	@Test
	public void print_links()
	{
		driver.get("http://www.google.com");
		WebElement total_links = driver.findElement(By.xpath("//a"));
		System.out.println("Total links in the webpage ->"+total_links);
	}

}
