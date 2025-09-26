package com.java.anonymous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_Test {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickButton= driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		Actions actions = new Actions(driver);
		actions.contextClick(rightClickButton).perform();
		
		System.out.println("Right click performed");
	}

}
