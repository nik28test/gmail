package com.mindq.commands;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadingFileGmailEx01 {

	public static void main(String[] args) throws Exception {
		// launch browser
		WebDriver driver = new FirefoxDriver();
		// maximize window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// open gmail home page
		driver.get("https://gmail.com");
		// enter email id
		driver.findElement(By.id("Email")).sendKeys("seleniumuser15@gmail.com");
		// click on next button
		driver.findElement(By.name("signIn")).click();
		// enter password
		driver.findElement(By.id("Passwd")).sendKeys("Platinum");
		// click on sign in
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(5000);
		// click on compose button
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		// enter to email
		driver.findElement(By.name("to")).sendKeys("seleniumuser15@gmail.com");
		// enter subject
		driver.findElement(By.name("subjectbox")).sendKeys("Uploading File Using Selenium");
		// click on upload icon
		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
		Thread.sleep(3000);
		// enter the file path in popup window
		//to assign string
		StringSelection st = new StringSelection("E:\\New.docx");
		// to set value in system clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st, null);
		
		Robot rb = new Robot();
		// to press ctr+v
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		// click on send
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(5000);
		// click on name icon
		driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
		Thread.sleep(5000);
		
		// click on sign out
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(3000);
		
		//close
		driver.close();

	}

}
