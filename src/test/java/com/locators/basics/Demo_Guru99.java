package com.locators.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Guru99 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user_title")).sendKeys("Ms");
		driver.findElement(By.id("user_firstname")).sendKeys("tom");
		driver.findElement(By.id("user_surname")).sendKeys("jerry");
		
		driver.findElement(By.id("user_phone")).sendKeys("987654321");
		
		Select yr = new Select(driver.findElement(By.id("user_dateofbirth_1i")));
        yr.selectByVisibleText("1935");
        Select mth = new Select(driver.findElement(By.id("user_dateofbirth_2i")));
        mth.selectByVisibleText("December");
        Select day = new Select(driver.findElement(By.id("user_dateofbirth_3i")));
        day.selectByVisibleText("21");
		

		driver.findElement(By.id("licencetype_f")).click();
		
		driver.findElement(By.id("user_licenceperiod")).sendKeys("5");
		
		driver.findElement(By.id("user_occupation_id")).sendKeys("Doctor");
		
		driver.findElement(By.id("user_address_attributes_street")).sendKeys("No 13 cross, next to temple");
		
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("Bengaluru");
		
		driver.findElement(By.id("user_address_attributes_county")).sendKeys("India");
		
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("123456");
		
		driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("Jerry@gmail.com");
		
		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("Jerry@123");
		
		driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("Jerry@123");
		
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.id("email")).sendKeys("Jerry@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Jerry@123");
		driver.findElement(By.cssSelector(".btn.btn-default")).click();
		
		driver.findElement(By.partialLinkText("linkedin")).click();
	}

}
