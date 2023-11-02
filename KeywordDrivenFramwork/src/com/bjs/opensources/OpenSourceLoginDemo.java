package com.bjs.opensources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSourceLoginDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\KeywordDrivenFramwork\\src\\com\\bjs\\utilities\\keyworddriven.properties");

       Properties p = new Properties()	;
       p.load(fis);

       String  loginkey=p.getProperty("login");
       String  usernamekey=p.getProperty("username");
       String  passwordkey=p.getProperty("password");
       String  submitkey=p.getProperty("submit");
       String  commentkey=p.getProperty("comment");

       System.out.println(loginkey);
       System.out.println(usernamekey);
       System.out.println(passwordkey);
       System.out.println(submitkey);
       System.out.println(commentkey);
       
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://s1.demo.opensourcecms.com/wordpress/");
       
       driver.findElement(By.linkText(loginkey)).click();
       driver.findElement(By.id(usernamekey)).sendKeys("opensourcecms");
       driver.findElement(By.id(passwordkey)).sendKeys("opensourcecms");
       driver.findElement(By.id(submitkey)).click();
       
       driver.findElement(By.xpath(commentkey)).click();
       driver.close();
       
       
       
	}

}
