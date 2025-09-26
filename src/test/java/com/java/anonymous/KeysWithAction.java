package com.java.anonymous;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysWithAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		WebElement searchbox = driver.findElement(By.name("q"));
		
		Actions actions = new Actions(driver);
		actions.click(searchbox).keyDown(Keys.SHIFT)
		.sendKeys("Selenium")
		.keyUp(Keys.SHIFT)
		.sendKeys(Keys.ENTER)
		.build().perform();
		Thread.sleep(3000);
		
		
	}

}
