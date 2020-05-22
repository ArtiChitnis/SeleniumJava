package demo;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNGRetryDemo {

	@Test
	public void test1() {
		System.out.println("I am inside test1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside test 2");
		//int i = 1/0;
	}
	
	@Test(retryAnalyzer = listeners.MyRetry.class)
	public void test3() {
		System.out.println("I am inside test 3");
		Assert.assertTrue(false);
	
	}
	
}
