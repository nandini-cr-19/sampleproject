package com.locators.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BookMyShow {
	public static void main(String[] args) {
//		WebDriver driver= new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumProjectHealth\\drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		driver.findElement(By.cssSelector(".sc-1or3vea-16.gPcyDI")).click();
		driver.findElement(By.cssSelector(".sc-ifipx4-9.cpXaIl")).sendKeys("kolar");
		driver.findElement(By.cssSelector(".sc-mrh8fw-0.ghlPza")).click();

	}

}
