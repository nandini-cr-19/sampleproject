package com.java.anonymous;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait_Example {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		//click on timer so clock will start
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		//Create object of Fluentwait class and pass WebDriver as input
		//List<String> list = new ArrayList<String>(); Generic and Dynamic dispatch
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).
				pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		WebElement element = wait.until(new Function<WebDriver, WebElement>(){

			@Override
			public WebElement apply(WebDriver driver) {
				WebElement ele = driver.findElement(By.xpath(".//*[@id='demo']"));
				String value = ele.getAttribute("innerHTML");
				if(value.equalsIgnoreCase("WebDriver")) {
					return ele;
				}else{
					System.out.println("Text is coming on a screen " + value);
					return null;
				}
				
			}
			
		});
		System.out.println("element displayed " + element.isDisplayed());
	}

}
