package com.locators.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		//click button to trigger alert
//				driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();//or

		//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		//	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert=	driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert1=	driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

		Alert alert2=	driver.switchTo().alert();
		
		alert2.sendKeys("Hello how ru");
		alert2.accept();
		Thread.sleep(2000);
		

	}

}
