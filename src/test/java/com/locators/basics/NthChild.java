package com.locators.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NthChild {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");

		String website= driver.findElement(By.cssSelector("#table1 tr:nth-child(2) td:nth-child(5)")).getText();
		System.out.println("Second row website name :" + website);

		String action = driver.findElement(By.cssSelector("#table1 tr:nth-child(1) th:nth-child(6)")).getText();
		System.out.println("Action name: " + action);

		String name = driver.findElement(By.cssSelector("#table1 tr:nth-child(4) td:nth-child(2)")).getText();
		System.out.println("Name: " + name);	

		String sal = driver.findElement(By.cssSelector("#table1 tr:nth-child(3) td:nth-child(4)")).getText();
		System.out.println("salary: " + sal);

	}

}
