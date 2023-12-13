	package com.testng.demo;
	
	import org.testng.annotations.Test;
	
	public class TestNGDemo1 {
	
		@Test
		public void demoTesta() {
			System.out.println("Test A");
		}
	
		@Test(dependsOnMethods = { "demoTestd", "demoTeste" })
		public void demoTestb() {
			System.out.println("Test B");
		}
	
		@Test(timeOut = 2000)
		public void demoTestc() {
			System.out.println("Test C");
		}
	
		@Test
		public void demoTestd() {
			System.out.println("Test D");
		}
	
		@Test(enabled = true)
		public void demoTeste() {
			System.out.println("Test E");
		}
	
	}
