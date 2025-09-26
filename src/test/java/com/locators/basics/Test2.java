package com.locators.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("calcSearchTerm")).sendKeys("calculator");
		System.out.println("search box used by name");
		Thread.sleep(5000);
		
		driver.findElement(By.id("bluebtn")).click();
		
//		driver.quit();
	}

}
