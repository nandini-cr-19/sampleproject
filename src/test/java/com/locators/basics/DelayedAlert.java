package com.locators.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelayedAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("timerAlertButton")).click();
		System.out.println("clicked");
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("accepted");
	}

}
