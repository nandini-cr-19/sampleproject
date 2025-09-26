package com.locators.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelBooking {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//button[@class='a-button-text']")).click();
		driver.findElement(By.cssSelector("//button[@class='nav-flyout-button.nav-icon.nav-arrow'")).click();
		
	}

}
