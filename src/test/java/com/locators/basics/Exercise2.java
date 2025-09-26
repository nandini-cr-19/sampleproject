package com.locators.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.get("https://www.healthasyst.com");
		driver.manage().window().maximize();
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		for(WebElement s: list) {
			System.out.println(s);
		}
		
		driver.quit();
//		driver.findElement(By.partialLinkText("Rentals")).click();
		
	}

}
