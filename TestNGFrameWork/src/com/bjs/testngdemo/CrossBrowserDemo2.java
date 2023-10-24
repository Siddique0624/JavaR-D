package com.bjs.testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserDemo2 {

	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void beforemethod(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new OperaDriver();
		}
	}
	
	@Test
	public void positivecredential() {
		
		driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		 driver.close();
	}
}
