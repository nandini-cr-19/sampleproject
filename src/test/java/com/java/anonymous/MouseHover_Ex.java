package com.java.anonymous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_Ex {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Actions actions = new Actions(driver);
		
		//Mouse hover on "Login" menu
		WebElement loginMenu = driver.findElement(By.xpath("//span[text()='Login']"));
		actions.moveToElement(loginMenu).perform();
		
		System.out.println("Mouse hover performed.");
	}

}
