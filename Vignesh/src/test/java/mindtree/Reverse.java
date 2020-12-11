package mindtree;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reverse {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
			String org= "Malayalam",rev="";
			char[] ch = org.toCharArray();
			for (int i=(ch.length-1);i>=0; i--) 
			{
				rev=rev+ch[i];
			}			
			System.out.println("Original String ->"+org);
			System.out.println("After reversing ->"+rev);
			
			if(org.equalsIgnoreCase(rev))
				System.out.println("The given String is palindrome");
			else
				System.out.println("The given string is not Palindrome");	
			
			WebDriver driver= WebDriver.class.newInstance();
			SearchContext drv = new FirefoxDriver();
			
//			driver= new ChromeDriver();
//			List<WebElement> links = driver.findElements(By.linkText("a"));
//			for (WebElement webElement : links) 
//			{
//				System.out.println(webElement.getText());
//			}
	}

}
