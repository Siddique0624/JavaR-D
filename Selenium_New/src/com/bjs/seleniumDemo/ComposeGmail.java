package com.bjs.seleniumDemo;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComposeGmail {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		//Send email address
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("siddiquetestingselenium@gmail.com");
	        driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		
		//send password
		WebElement passwordButton = driver.findElement(By.xpath("//input[@name='Passwd']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(passwordButton));
		passwordButton.sendKeys("Incubytes@850");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		
		//Click on compose button
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		
 //Enter the sender mail id
		try {
		driver.findElement(By.xpath("//input[@class='agP aFw']")).sendKeys("siddiquetestingselenium@gmail.com");
		}
		catch (org.openqa.selenium.StaleElementReferenceException ex){
			driver.findElement(By.xpath("//input[@class='agP aFw']")).sendKeys("siddiquetestingselenium@gmail.com");
			
		}
 //Enter subject to the mail
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Incubyte");
	
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Automation QA test for Incubyte");
		
		//Am Al editable LW-avf tS-tW
		

 driver.findElement(By.xpath("//div[text()='Send']")).click();
	}
}