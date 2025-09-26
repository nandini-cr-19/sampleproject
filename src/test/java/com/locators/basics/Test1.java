package com.locators.basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		WebElement userName= driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		
		
		WebElement Password=	driver.findElement(By.id("password")) ;
		Password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		userName.clear();
		Password.clear();
		
		Thread.sleep(2000);

		WebElement Button =driver.findElement(By.id("login-button"));
		Button.click();
		Thread.sleep(2000);
		System.out.println("Username nd password are correct logged in successfully..!!");
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
