package com.locators.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_ParentChildSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//parent > child selector-click "Add Element" button (direct child of div#content)
		driver.findElement(By.cssSelector("div#content > div > button")).click();
		System.out.println("Clicked add element button");
		
		driver.findElement(By.cssSelector("div.row >a")).click();
		
		Thread.sleep(2000);
	}

}
