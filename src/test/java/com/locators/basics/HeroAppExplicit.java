package com.locators.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeroAppExplicit {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

		driver.findElement(By.cssSelector("#start button")).click();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement hellotext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));

		//webelement hellotext=driver.findelement(by.id("finish"));

		System.out.println("Message: " + hellotext.getText());
	}

}
