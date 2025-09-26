package com.locators.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EvilTesterBasic {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
	
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tom_123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tom@321");
		
		driver.findElement(By.xpath("//input[@name='filename']")).sendKeys("C:/Users/Dell/Downloads/selectors.txt");
		
		
		//for checkbox 
		List<WebElement> checkboxes=driver.findElements(By.name("checkboxes[]"));
		System.out.println(checkboxes.size());
		
		for(WebElement checkbox: checkboxes) {
//			System.out.println(checkbox);
		String checkboxname=	checkbox.getAttribute("value"); 	
		System.out.println(checkboxname);
		if(checkboxname.equals("cb1")) {
			checkbox.click();
		}		
		}
		
		//radio button 
		List<WebElement> radiobox=driver.findElements(By.name("radioval"));
		System.out.println(radiobox.size());
		
		for(WebElement radio : radiobox) {
			String radioname = radio.getAttribute("value");
			System.out.println(radioname);
			if(radioname.equals("rd2")) {
				radio.click();
			}
		}
		
 
		//driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb1']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb3']")).click();
//        driver.findElement(By.xpath("//input[@type='radio' or @value='rd2']")).click();
//        WebElement dropdown = driver.findElement(By.xpath("//select[@name='dropdown']"));
        
//        Select select = new Select(dropdown);
//        select.selectByVisibleText("Drop Down Item 5");
        
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
        }

}
