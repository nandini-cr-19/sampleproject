package com.locators.basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchMultiple {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");

		//click open to new window
		driver.findElement(By.linkText("Click")).click();
		//get current window handle
		String parentWindow =driver.getWindowHandle();
		System.out.println(parentWindow);
		//get all handles
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);
		//switch to child window
		for(String handle : handles) {
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				System.out.println("child window title "+ driver.getTitle());
				driver.close();

			}
		}
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
