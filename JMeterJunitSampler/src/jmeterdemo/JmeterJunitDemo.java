package jmeterdemo;

import org.junit.Assert;
import org.junit.Test;



public class JmeterJunitDemo {

	@Test
	public void testdemo1() {
		System.out.println("Junit Test Case");
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void testdemo2() {
		
		System.out.println("Junit test case 2");
	}
}
