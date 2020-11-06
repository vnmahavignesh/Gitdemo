package com.avin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class P2 {	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	WebDriver driver;
	@Test
	public void ss() throws AWTException, InterruptedException
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);		
		WebElement rightclick = driver.findElement(By.xpath("//span[contains(text(),'Selenium WebDriver')]"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Set<String> gwh = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(gwh);
		System.out.println(al.size());		
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getCurrentUrl());
		WebElement sd = driver.findElement(By.xpath("//p[@class='body-large'][1]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;		
		jse.executeScript("arguments[0].scrollIntoView(true);", sd);
		Thread.sleep(2000);
		driver.quit();
	}

}
