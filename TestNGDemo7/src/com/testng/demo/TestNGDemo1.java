	package com.testng.demo;
	

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


	
	public class TestNGDemo1 {
	
		@Parameters({ "URLSuite" })
		@Test
		public void demoTesta(String str) {
			System.out.println("Test A "+str);
		} 
	
	
	}
