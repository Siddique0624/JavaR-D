package com.bjs.testngdemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {

	@Test
	public void test1() {
		System.out.println("Test case 1");
	}
	@Test
	public void test2() {
		System.out.println("Test case 2 ");
	}
	 
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}
}
