package com.locators.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//using class selector
		driver.findElement(By.cssSelector(".input_error.form_input")).sendKeys("standard_user");
		
		//id selector 
//		WebElement test=driver.findElement(By.cssSelector("#password"));
//		test.sendKeys("password@123");
//		
		
		//tag selector
//		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");
		
		
		//contains
		driver.findElement(By.cssSelector("input[name*='word']")).sendKeys("password@123");
		
		//starts with
		driver.findElement(By.cssSelector("input[class^='input']")).sendKeys("Tom");
		
		//ends with
		driver.findElement(By.cssSelector("input[id$='word']")).sendKeys("Jerry");
	}

}
