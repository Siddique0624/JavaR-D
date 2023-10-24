package com.bjs.testngdemo;

import org.testng.annotations.Test;

public class PriorityDemo {

	@Test(priority=3)
	public void a() {
		System.out.println("a");
	}
	@Test(priority=2)
	public void b() {
		System.out.println("b");
	}
	@Test(priority=0)
	public void c() {
		System.out.println("c");
	}

	@Test(priority=1)
	public void d() {
		System.out.println("d");
	}
	
}
