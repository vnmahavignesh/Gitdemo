package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Given("^User is already in login page$")
	public void user_already_login_page()
	{
		driver= new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		
	}
	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page()
	{
		String aTitle=driver.getTitle();
		System.out.println(aTitle);
		Assert.assertEquals("Cogmento CRM", aTitle);
	}
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("email")).sendKeys("mvbank04@gmail.com");
		driver.findElement(By.name("password")).sendKeys("04Mvbankibm@");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement submit = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		jse.executeScript("arguments[0].click()", submit);
	
		
	}
	
	
}
