package com.locators.basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBtwMultiple {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.linkText("click")).click();

		String parentWindow=driver.getWindowHandle();

		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles) {
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				System.out.println("child window="+driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		System.out.println("parent "+driver.getTitle());
	}

}
