package com.testng.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo1 {
	@Test(dataProvider = "testData")
	public void demoTesta(String a, String b) {
		System.out.println("User " + a + " " + b + "\n");
	}
	@DataProvider
	public Object[][] testData() {
		Object obj[][] = new Object[2][2];
		obj[0][0] = "1st User";
		obj[0][1] = "1st Pass";
		obj[1][0] = "2nd User";
		obj[1][1] = "2nd Pass";
		return obj;
	}
}
