package com.testng.demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	@Test(groups={"A1"})
	public void demoTest21(){
		System.out.println("Test 21");
	}
	
	@Test
	public void demoTest22() {
		System.out.println("Test22");
	}
	
	@Test
	public void demoTest23() {
		System.out.println("Test 23");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	

}
