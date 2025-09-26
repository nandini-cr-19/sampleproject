package com.locators.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excerise1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/webhp");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gLFyf")).sendKeys("youtube");
		System.out.println("google opened");
		
		driver.findElement(By.className("gNO89b")).click();
		
	}

}
