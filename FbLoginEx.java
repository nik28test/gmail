package com.mindq.classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLoginEx {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		// get facebook
		driver.get("http://www.facebook.com");
		// maximize window
		driver.manage().window().maximize();
		// enter mail id
		driver.findElement(By.id("email")).sendKeys("InsightQ");
		// enter password
		driver.findElement(By.name("pass")).sendKeys("mercury");
		//click login button
		driver.findElement(By.id("loginbutton")).click();
		// close
		driver.close();
		

	}

}
