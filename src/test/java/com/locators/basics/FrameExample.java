package com.locators.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameExample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		//Switch to frame by name or ID
		driver.switchTo().frame("frame1");
		WebElement heading = driver.findElement(By.id("sampleHeading"));
		System.out.println("Text inside iframe: " + heading.getText());
		
		//switch back to main page content
		driver.switchTo().defaultContent();
		System.out.println("Back to main page");
		
		driver.findElement(By.id("frame1Wrapper")).click();
	}

}
