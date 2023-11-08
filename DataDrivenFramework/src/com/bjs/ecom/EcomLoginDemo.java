package com.bjs.ecom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcomLoginDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	FileInputStream fis = new	FileInputStream("C:\\Users\\admin\\eclipse-workspace\\DataDrivenFramework\\src\\com\\bjs\\utilities\\datadrivenframework.properties");
	
	Properties p = new Properties();
	p.load(fis);
	
	String urldata = p.getProperty("url");
	String usernamedata = p.getProperty("username");
	String passworddata = p.getProperty("password");

	System.out.println(urldata);
	System.out.println(usernamedata);
	System.out.println(passworddata);
	
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(urldata);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys(usernamedata);
		driver.findElement(By.id("passwd")).sendKeys(passworddata);
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.linkText("Sign out")).click();
	}

}
