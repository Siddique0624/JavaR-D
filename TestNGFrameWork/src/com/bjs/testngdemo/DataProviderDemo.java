package com.bjs.testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;
	
	@DataProvider(name="authentication")
	public Object[][] dataProvider(){
		Object[][] obj=new Object[2][2];

		obj[0][0]="Admin";
		obj[0][1]="admin123";
		obj[1][0]="Admin";			
		obj[1][1]="admin123";
		return obj;
		
	}
	@Test(dataProvider="authentication")
	public void positivecredential(String username,String password) {
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		 driver.close();
	}
	
	
	
}
