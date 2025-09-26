package com.java.anonymous;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Ex {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Fill form 
		driver.findElement(By.id("userName")).sendKeys("Sunita Hadapad");
		driver.findElement(By.id("userEmail")).sendKeys("sunita@example.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Dharwad");
		driver.findElement(By.id("permanentAddress")).sendKeys("Dharwad, Karnataka");
		
		//ScreenShot for entire page
		File fullScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(fullScreenshot, new File("./Screenshot/nandini.png"));
	}

}
