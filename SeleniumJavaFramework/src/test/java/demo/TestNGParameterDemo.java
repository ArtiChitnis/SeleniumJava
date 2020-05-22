package demo;

import org.junit.runners.Parameterized.Parameters;
import org.testng.annotations.*;

public class TestNGParameterDemo {

	
	@Test
	@org.testng.annotations.Parameters({"aarti"})
	public static void test1(String name) {
		System.out.println("My name is " +name);
		
	}
}
