package com.java.anonymous;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Ex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//scroll down by 400 pixel
		js.executeScript("window.scrollBy(0,400");
		
		Thread.sleep(2000);
		
		// scroll back up by -400 pixel
		js.executeScript("window.scrollBy(0,-400");
		
		driver.findElement(By.id("submit")).click();
	}

}
