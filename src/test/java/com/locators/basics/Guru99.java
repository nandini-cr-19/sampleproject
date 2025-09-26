package com.locators.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		
//		driver.findElement(By.name("address1")).sendKeys("123 Main Street, Bangalore");
//		Thread.sleep(2000);
//		System.out.println("Address entered successfully");
//		
		driver.findElement(By.name("uid")).sendKeys("Tom_123");
		driver.findElement(By.name("password")).sendKeys("Tom@123");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
//		System.out.println(alert.getText());
		
	}

}
