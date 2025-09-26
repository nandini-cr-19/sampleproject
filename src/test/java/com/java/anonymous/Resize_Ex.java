package com.java.anonymous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize_Ex {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		
		WebElement resize=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions actions = new Actions(driver);

	actions.clickAndHold(resize).moveByOffset(10, 19).click().build().perform();
		//actions.dragAndDropBy(resize, 10, 50).perform();
		System.out.println("Resized");
 
	}

}
