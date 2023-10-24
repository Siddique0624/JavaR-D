package com.bjs.testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAttributes {

	@Test
	public void login() {
	Assert.fail();
		System.out.println("login");
	}
	@Test(invocationCount=5)
	public void compose() {
		System.out.println("compose");
	}
	@Test (enabled=false)
	public void inbox() {
		System.out.println("inbox");
	}
	 
	@Test(dependsOnMethods="login",alwaysRun=true)
	public void logout() {
		System.out.println("logout");
	}
} 