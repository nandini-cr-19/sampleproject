package com.locators.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
//		driver.manage().window().maximize();
		
		//switch to frame by name or id
		driver.switchTo().frame(0);
		WebElement button = driver.findElement(By.id("Click"));
		System.out.println(button.getText());
		
//		driver.switchTo().defaultContent();
//		System.out.println("Back to main page");
		
	}

}
