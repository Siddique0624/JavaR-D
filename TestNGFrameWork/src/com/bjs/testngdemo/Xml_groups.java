package com.bjs.testngdemo;

import org.testng.annotations.Test;

public class Xml_groups {
	@Test(priority=1,groups="inbox")
	public void postivecredential1() {
	
		System.out.println("postivecredential1");
	}
	@Test(groups="compose")
	public void postivecredential2() {
	
		System.out.println("postivecredential2");
	}
	
	@Test(groups="logout")
	public void postivecredential3() {
	
		System.out.println("postivecredential3");
	}
	@Test(priority=0,groups="inbox")
	public void postivecredential4() {
	
		System.out.println("postivecredential4");
	}
	@Test(groups="compose")
	public void postivecredential5() {
	
		System.out.println("postivecredential5");
	}
	
	@Test(groups="logout")
	public void postivecredential6() {
	
		System.out.println("postivecredential6");
	}

}
