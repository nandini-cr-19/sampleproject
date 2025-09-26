package com.locators.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiPedia {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".sprite.svg-search-icon")).click();
		
		
//		driver.findElement(By.id("searchInput")).sendKeys("Selenium Automation");
//		Thread.sleep(2000);
//		System.out.println("Search text entered successfully");
//		driver.quit();
	}

}
