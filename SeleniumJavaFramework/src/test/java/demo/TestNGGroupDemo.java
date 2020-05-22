package demo;

import org.testng.annotations.Test;

public class TestNGGroupDemo {
	
	
	@Test(groups = {"sanity"})
	public void test1() {
		
		System.out.println("This is a test1");
	}
	
	@Test(groups= {"windows.regression"})
	public void test2() {
		
		System.out.println("This is a test2");
	}
	@Test(groups= {"linux.regression"})
	public void test3() {
		
		System.out.println("This is a test3");
	}
	@Test
	public void test4() {
		
		System.out.println("This is a test4");
	}
}
