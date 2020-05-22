package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGIgnoreDemo {
	@Ignore
	@Test
	public void test1() {
		System.out.println("I am inside test1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside test 3");
	}
	
}
